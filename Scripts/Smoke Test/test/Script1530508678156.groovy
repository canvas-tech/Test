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

//*******************Group - Single - Grid *********************//
def result = CustomKeywords.'mySqlConnection.executingQuery.connection'(findTestData('Test Data').getValue('DB_Url', 1), 
    findTestData('Test Data').getValue('DB_UN', 1), findTestData('Test Data').getValue('DB_PWD', 1), findTestData('Test Data').getValue(
        'DB_Driver', 1), 'Select * from account_summary_data where account_type=\'CHECKING ACCOUNT\'')

println(result)

/*
String scroll ="//h3[contains(text(),'A003')]"

TestObject scrollTo = new TestObject(scroll).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
	scroll, true)

WebUI.waitForElementVisible(scrollTo, 3)

WebUI.scrollToElement(scrollTo, 0)*/


String expand ="((//h3[contains(text(),'A005')]/following::span[contains(text(),'SAVINGS ACCOUNT')])[1]/preceding::a/span[@class='ct-app__tools flaticon-expand flaticon-listGroup group-collapsed'])[3]"

// "//h3[contains(text(),'A005')]/following::tbody/tr[1]//a/span[@class='ct-app__tools flaticon-expand flaticon-listGroup group-collapsed']"
//h3[contains(text(),'A005')]/following::tbody/tr[1]//a/span[@class='ct-app__tools flaticon-expand flaticon-listGroup group-collapsed']

TestObject expand_acc1 = new TestObject(expand).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
	expand, true)

WebUI.waitForElementVisible(expand_acc1, 3)

WebUI.scrollToElement(expand_acc1, 0)

WebUI.click(expand_acc1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)
boolean flag;
for(int i=1;i<=10;i++){
String grpSingle = "((//h3[contains(text(),'A005')]/following::span[contains(text(),'SAVINGS ACCOUNT')])[1]/following::tr["+i+"]/td[1])[1]/span"

TestObject dynamicObject1 = new TestObject(grpSingle).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    grpSingle, true)

WebUI.waitForElementVisible(dynamicObject1, 3)
boolean check = WebUI.verifyElementPresent(dynamicObject1, 5);
flag=check;
println flag;
if(String.valueOf(check)=='true'){
String val = WebUI.getText(dynamicObject1, FailureHandling.CONTINUE_ON_FAILURE)
println val;
}else{
flag = 'false';

println 'No more rows'
break;
}

}