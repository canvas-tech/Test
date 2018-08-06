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

/*WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.19.29.253:8082/expertctstudio/')

Thread.sleep(3000)

String folder = 'D:\\Sheepa\\AutoIt\\'

String exe = 'KAuth.exe'

// Create and start Process with ProcessBuilder.
ProcessBuilder p = new ProcessBuilder('cmd.exe', '/C', 'start')

p.command(folder + exe)

p.start()

Thread.sleep(2000)

//WebUI.navigateToUrl('http://172.19.29.253:8082/expertctstudio/')
WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))*/


Map common = WebUI.callTestCase(findTestCase('Test Cases/Studio Smoke Test Cases/ReadExcel'), [:])

String app_id = common['appID']
println app_id

String view_id = common['viewID']
println view_id

WebUI.waitForPageLoad(10)

/*String homePageHeader = WebUI.getText(findTestObject('New_Test_Create_Form/Page_Canvas World/get_HomePage_Header'))

println(homePageHeader)

assert homePageHeader == 'WORKSPACE CANVAS LIST'*/

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/span_App'))

WebUI.waitForPageLoad(10)

/*String pageHeader = WebUI.getText(findTestObject('New_Test_Create_View/Page_Canvas World/view_pageHeader'))

println(pageHeader)

assert pageHeader == 'CREATE APP'

WebUI.delay(3)*/

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppId'))

WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppId'), app_id)

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppDisplayName'))

WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppDisplayName'), app_id)

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppBundleKey'))

WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppBundleKey'), 'common')

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_View_Link_App'))

//WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_View_Link_App'), view_id)

String selectview = "//span[starts-with(text(), '"+view_id+"')]";

println selectview;

TestObject dynamicObject = new TestObject(selectview).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, selectview, true)
WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.doubleClick((dynamicObject))

WebUI.doubleClick((dynamicObject))

WebUI.delay(3)
not_run: WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/search_viewId'))

not_run: WebUI.doubleClick(findTestObject('New_Test_Create_App/Page_Canvas World/select_View'))

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/app_Submit'))

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/app_submission'))

