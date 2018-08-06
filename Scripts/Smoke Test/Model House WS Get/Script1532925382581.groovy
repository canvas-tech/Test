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

Map common = WebUI.callTestCase(findTestCase('Test Cases/Smoke Test/New_Webservice_Get'), [:])

String result = common['count']

println(result)

WebUI.openBrowser('')

'Maximize the browser.'
WebUI.maximizeWindow()

'Verifiy that user able to launch Application.'
WebUI.navigateToUrl('http://localhost:8082/ctmodelhouse/cacheReset.jsp')

WebUI.closeBrowser()

WebUI.delay(2)

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

String selectWS = ('//div[contains(text(),\'' + findTestData('Database').getValue('datasource_name', 3)) + '\')]'

println(selectWS)

TestObject dynamicObject = new TestObject(selectWS).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectWS, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.click(dynamicObject)

WebUI.delay(30)

String wsResult = '//table[@class=\'table  table-striped table-hover no-margin ct-listview ct-listview-tm\']/tbody'

println(wsResult)

WebUI.delay(5)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath(wsResult))

WebUI.delay(4)

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

println(rows_count)

assert rows_count == Integer.parseInt(result)

WebUI.delay(3)

String menu = '(//span[contains(text(),\'CREATE\')])[1]'

println(menu)

TestObject menuClick = new TestObject(menu).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, menu, 
    true)

WebUI.waitForElementVisible(menuClick, 3)

WebUI.click(menuClick)

WebUI.delay(2)

String subMenu = '//a[starts-with(@data-item-id,\'SM\')]'

println(subMenu)

TestObject submenuClick = new TestObject(subMenu).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    subMenu, true)

WebUI.waitForElementVisible(submenuClick, 3)

WebUI.click(submenuClick)

WebUI.delay(10)

String title = WebUI.getText(findTestObject('Model House WS Test/get_menu_title'))

println title

String actual ="Create Request"

assert title==actual
