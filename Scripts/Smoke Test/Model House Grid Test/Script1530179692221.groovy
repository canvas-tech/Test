import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

'Opening the Browser.'
WebUI.openBrowser('')

'Maximize the browser.'
WebUI.maximizeWindow()

'Verifiy that user able to launch Application.'
WebUI.navigateToUrl('http://localhost:8082/ctmodelhouse/')

Thread.sleep(3000)

'Verify that user able to enter the user name.'
WebUI.setText(findTestObject('Model House Login/Page_Model House/input_loginID'), 'terrim')

'Verify that user able to enter the password.'
WebUI.setText(findTestObject('Model House Login/Page_Model House/input_loginPSW'), 'canvas')

'Verify that user able to click on the Login and able to open the application.'
WebUI.click(findTestObject('Model House Login/Page_Model House/input_commit'))

WebUI.waitForPageLoad(20)

String pageHeader = WebUI.getAttribute(findTestObject('Model House Home Page/Page_Canvas World/Home_Page_Title'), 'title')

println(pageHeader)

assert pageHeader == 'Canvas Technology'

String selectWS = ('//div[contains(text(),\'' + findTestData('Grid_id').getValue('WS_id', 1)) + '\')]'

println(selectWS)

TestObject dynamicObject = new TestObject(selectWS).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		selectWS, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.click(dynamicObject)

//*******************DB Fetch *********************//
def result = CustomKeywords.'mySqlConnection.executingQuery.connection'(findTestData('Test Data').getValue('DB_Url', 1),
		findTestData('Test Data').getValue('DB_UN', 1), findTestData('Test Data').getValue('DB_PWD', 1), findTestData('Test Data').getValue(
		'DB_Driver', 1),"Select * from account_summary_data")

println(result)

//*******************Simple Grid *********************//
String simpleGrid = ('(//h3[contains(text(),\'' + findTestData('Grid_id').getValue('Simple', 1)) + '\')]/following::table)[1]/tbody'

println(simpleGrid)

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath(simpleGrid))

WebUI.delay(4)

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

println(rows_count)

assert rows_count == result



//*******************List Grid *********************//
String listGrid = ('(//h3[contains(text(),\'' + findTestData('Grid_id').getValue('List', 1)) + '\')]/following::table)[1]/tbody'

println(listGrid)

WebUI.delay(5)

WebElement Table1 = driver.findElement(By.xpath(listGrid))

WebUI.delay(4)

List<WebElement> rows_table1 = Table1.findElements(By.tagName('tr'))

int rows_count1 = rows_table1.size()

println(rows_count1)

boolean nxtButton, previousButton

if (rows_count1 != result) {
	WebUI.delay(3)

	nxtButton = WebUI.verifyElementPresent(findTestObject('Model House Grid Test/Page_Canvas World/next_button'), 5)

	assert String.valueOf(nxtButton) == 'true'

	if (String.valueOf(nxtButton) == 'true') {
		WebUI.scrollToElement(findTestObject('Model House Grid Test/Page_Canvas World/next_button'), 3)

		WebUI.click(findTestObject('Model House Grid Test/Page_Canvas World/next_button'))

		WebUI.delay(3)

		previousButton = WebUI.verifyElementPresent(findTestObject('Model House Grid Test/Page_Canvas World/previous_button'), 5)

		assert String.valueOf(previousButton) == 'true'

		if (String.valueOf(nxtButton) == 'true') {

			WebUI.click(findTestObject('Model House Grid Test/Page_Canvas World/previous_button'))
		}else{

			println('Previous Button is missing')
			
			assert String.valueOf(previousButton) == 'true'
		}

	} else {
		println('Next Button is missing')
		
		assert String.valueOf(nxtButton) == 'true'
	}
} else {
	
}

//*******************Paging Grid *********************//
String pagingGrid = ('(//h3[contains(text(),\'' + findTestData('Grid_id').getValue('Paging', 1)) + '\')]/following::table)[1]/tbody'

println(pagingGrid)

WebUI.delay(5)

WebElement Table2 = driver.findElement(By.xpath(pagingGrid))

WebUI.delay(4)

List<WebElement> rows_table2 = Table2.findElements(By.tagName('tr'))

int rows_count2 = rows_table2.size()

println(rows_count2)
int i=0;
while (rows_count2 != result&& i<=6) {
	WebUI.delay(3)

	boolean loadMoreButton = WebUI.verifyElementPresent(findTestObject('Model House Grid Test/Page_Canvas World/load_more'),
			5)

	assert String.valueOf(loadMoreButton) == 'true'

	if (String.valueOf(loadMoreButton) == 'true') {

		WebUI.click(findTestObject('Model House Grid Test/Page_Canvas World/load_more'))

		WebUI.delay(4)

		rows_table2 = Table2.findElements(By.tagName('tr'))

		println(rows_count2 = (rows_table2.size() - 1))
	} else {
		println('Load More Button is missing')
	}

	i++;
}






	
	//*******************Group - Single - Grid *********************//
	
	def grpSingleResult = CustomKeywords.'mySqlConnection.executingQuery.connection'(findTestData('Test Data').getValue('DB_Url', 1),
		findTestData('Test Data').getValue('DB_UN', 1), findTestData('Test Data').getValue('DB_PWD', 1), findTestData('Test Data').getValue(
		'DB_Driver', 1),"Select * from account_summary_data where account_type='CHECKING ACCOUNT'")
	
	println(grpSingleResult)
	
	String grpSingle = "((//h3[contains(text(),'A005')]/following::span[contains(text(),'CHECKING ACCOUNT')])[1]/following::tr/td[1])[1]/span"
	
