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
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

Thread.sleep(3000)

/*String folder = 'D:\\Sheepa\\AutoIt\\'
 String exe = 'KAuth.exe'
 // Create and start Process with ProcessBuilder.
 ProcessBuilder p = new ProcessBuilder('cmd.exe', '/C', 'start')
 p.command(folder + exe)
 p.start()
 Thread.sleep(2000)*/
//Runtime.getRuntime().exec("D:\\Sheepa\\AutoIt\\KTube.exe");
//WebUI.refresh();
//WebUI.navigateToUrl('http://172.19.29.253:8082/expertctstudio/')
WebUI.setText(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_commit'))

WebUI.delay(3)



WebUI.click(findTestObject('New_AppDesigner/click_appDesigner'))

WebUI.delay(3)

String appDel = delete()

println('Delete ' + appDel)

WebUI.delay(5)

WebUI.click(findTestObject('New_AppDesigner/click_newApp'))

WebUI.delay(5)

WebUI.setText(findTestObject('New_AppDesigner/enter_appName'), findTestData('Database').getValue('App_name_id', 3))

WebUI.delay(2)

WebUI.setText(findTestObject('New_AppDesigner/enter_appId'), findTestData('Database').getValue('App_name_id', 3))

WebUI.delay(2)

WebUI.setText(findTestObject('New_AppDesigner/enter_bundleKey'), findTestData('Database').getValue('bundle_key', 3))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New_AppDesigner/select_prdt'), 5)

WebUI.delay(4)

WebUI.selectOptionByIndex(findTestObject('New_AppDesigner/select_subPrdt'), 0)

WebUI.delay(2)

/*boolean result = WebUI.verifyElementVisible(findTestObject('New_AppDesigner/select_funcCode'))
 println result
 WebUI.delay(3)*/
WebUI.click(findTestObject('New_AppDesigner/select_funcCode'))

WebUI.selectOptionByIndex(findTestObject('New_AppDesigner/select_funcCode'), 4)

WebUI.scrollToElement(findTestObject('New_AppDesigner/click_gridType'), 3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

boolean result = WebUI.verifyElementVisible(findTestObject('New_AppDesigner/click_classicGrid'))

println(result)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('New_AppDesigner/click_classicGrid'))

WebUI.delay(3)

WebUI.click(findTestObject('New_AppDesigner/click_datasource'))

WebUI.delay(3)

String webService = ('(//span[contains(text(),\'' + findTestData('Database').getValue('datasource_name', 3)) + '\')])[3]'

println(webService)

TestObject dynamicObject2 = new TestObject(webService).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    webService, true)

WebUI.waitForElementVisible(dynamicObject2, 3)

WebUI.click(dynamicObject2)

WebUI.delay(3)

WebUI.click(findTestObject('New_AppDesigner/proceed_button'))

WebUI.delay(3)

WebUI.click(findTestObject('New_AppDesigner/click_columns'))

WebUI.delay(3)

for (int i = 3; i <= 5; i++) {
    String source = ('(//div[@column-id=\'' + findTestData('Database').getValue('Json_val', i)) + '\'])[1]'

    println(source)

    TestObject drag = new TestObject(source).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        source, true)

    WebUI.doubleClick(drag)

    WebUI.delay(2)
}

WebUI.delay(3)

WebUI.click(findTestObject('New_AppDesigner/save_app'))

WebUI.delay(3)

WebUI.click(findTestObject('New_AppDesigner/click_ok'))

WebUI.delay(3)

WebUI.click(findTestObject('New_AppDesigner/close_appDesigner'))

String delete() {
    String selectconn = '(//div[contains(text(),\'AUTO_APP\')])[1]'

    println(selectconn)

    TestObject dynamicObject = new TestObject(selectconn).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        selectconn, true)

    WebUI.delay(6)

    boolean present = WebUI.verifyElementPresent(dynamicObject, 4, FailureHandling.CONTINUE_ON_FAILURE)

    if (String.valueOf(present) == 'true') {
        WebUI.click(dynamicObject)

        WebUI.delay(3)

        WebUI.click(findTestObject('New_AppDesigner/delete_app'))

        WebUI.delay(4)

        WebUI.click(findTestObject('New_DataSource/click_ok'))

        WebUI.delay(3)

        WebUI.click(findTestObject('New_DataSource/click_ok'))

        println('DELETED')
    } else {
        println('No View exist')
    }
    
    return 'done'
}

