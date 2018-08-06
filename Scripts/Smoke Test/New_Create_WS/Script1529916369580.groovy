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
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions

Map common = WebUI.callTestCase(findTestCase('Test Cases/Studio Smoke Test Cases/ReadExcel'), [:])

String app_id = common['appID']
println app_id

String view_id = common['viewID']
println view_id


String subws_id = common['subWSID']
println subws_id

String ws_id = common['WSID']
println ws_id


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

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))
*/
WebUI.waitForPageLoad(10)

/*String homePageHeader = WebUI.getText(findTestObject('New_Test_Create_Form/Page_Canvas World/get_HomePage_Header'))

println(homePageHeader)

assert homePageHeader == 'WORKSPACE CANVAS LIST'*/

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/span_Workspace'))

WebUI.waitForPageLoad(10)

not_run: String wsPageHeader = WebUI.getText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/WS_PageHeader'))

not_run: println(wsPageHeader)

not_run: assert wsPageHeader == 'WORKSPACE DEFINITION'

not_run: WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WSId'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WSId'), ws_id)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_Name'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_Name'), ws_id)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_ResourceBundle'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_ResourceBundle'), 'common')

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_Position'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_Position'), '1')

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/select_ProductCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_Prdt_SubCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/select_Layout'), 'STACK', false)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/create_SubWS'))

WebUI.waitForPageLoad(10)

not_run: String subwsPageHeader = WebUI.getText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/subWS_PageHeader'))

not_run: println(subwsPageHeader)

not_run: assert subwsPageHeader == 'SUB WORKSPACE DEFINITION'

not_run: WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/subWS_ID'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/subWS_ID'), subws_id)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_Name'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_Name'), subws_id)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_RB'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_RB'), 'common')

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_ProductCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_subPrdtCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/subWS_Layout'), 'STACK', false)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/add_ChildApp'))

WebUI.waitForPageLoad(10)

not_run: String appLookPageHeader = WebUI.getText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/App_LookUp'))

not_run: println(appLookPageHeader)

not_run: assert appLookPageHeader == 'APP LOOKUP'

WebUI.delay(10)


String selectApp = "//span[starts-with(text(), '"+app_id+"')]";

println selectApp;

/*LinkToSearch = WebUI.modifyObjectProperty(findTestObject('New_Test_Create_Workspace/Page_Canvas World/select_App'), 'xpath','equals',selectApp, true)

WebUI.doubleClick(findTestObject(LinkToSearch))

WebUI.doubleClick(findTestObject(LinkToSearch))*/

//String ExpectedValue = 'WGT_AVL_REPORT'

TestObject dynamicObject = new TestObject(selectApp).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, selectApp, true)
WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.doubleClick((dynamicObject))

WebUI.doubleClick((dynamicObject))

/*WebDriver driver = DriverFactory.getWebDriver()

Actions builder = new Actions(driver)

Action clickDouble = builder.moveToElement(driver.findElement(By.xpath(selectApp))).doubleClick().build()

clickDouble.perform()
*/
WebUI.delay(5)
WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_Submit'))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/WS_Submit'))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/WS_Submission'))

