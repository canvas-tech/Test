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
import org.apache.poi.hssf.usermodel.HSSFCell as HSSFCell
import org.apache.poi.hssf.usermodel.HSSFRow as HSSFRow
import org.apache.poi.hssf.usermodel.HSSFSheet as HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook as HSSFWorkbook

String path = 'D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Grid_view_id.xls'

FileInputStream fis = new FileInputStream(path)

HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis)

int sc = hssfWorkbook.getNumberOfSheets()

println(sc)

HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0)

HSSFRow hssfRow = hssfSheet.getRow(1)

HSSFCell WS_id = hssfRow.getCell(6)
HSSFCell SubWS_id = hssfRow.getCell(7)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/span_Workspace'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WSId'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WSId'), String.valueOf(WS_id))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_Name'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_Name'), String.valueOf(WS_id))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_ResourceBundle'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_WS_ResourceBundle'), 'common')

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_Position'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_Position'), '1')

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/select_ProductCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/enter_Prdt_SubCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/select_Layout'), 'STACK', false)

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/create_SubWS'))

WebUI.waitForPageLoad(10)


WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/subWS_ID'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/subWS_ID'), String.valueOf(SubWS_id))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_Name'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_Name'), String.valueOf(SubWS_id))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_RB'))

WebUI.setText(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_RB'), 'common')

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_ProductCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_subPrdtCode'), 'CUSER', false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Workspace/Page_Canvas World/subWS_Layout'), 'STACK', false)

for (int i = 0; i <= 5; i++) {
	HSSFCell app_id = hssfRow.getCell(i)

	WebUI.delay(5)

	WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/add_ChildApp'))

	WebUI.waitForPageLoad(10)

	WebUI.delay(5)


	String selectApp = "//span[starts-with(text(), '"+String.valueOf(app_id)+"')]";

	println selectApp;

	TestObject dynamicObject = new TestObject(selectApp).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, selectApp, true)
	WebUI.waitForElementVisible(dynamicObject, 3)

	WebUI.doubleClick((dynamicObject))

	WebUI.doubleClick((dynamicObject))

	WebUI.delay(5)
}

WebUI.delay(5)
WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/SubWS_Submit'))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/WS_Submit'))

WebUI.click(findTestObject('New_Test_Create_Workspace/Page_Canvas World/WS_Submission'))

