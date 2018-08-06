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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))


WebUI.waitForPageLoad(10)

for (int i = 0; i <= 5; i++) {
	HSSFCell id = hssfRow.getCell(i)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/span_App'))

WebUI.waitForPageLoad(10)

WebUI.delay(5)
//WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppId'))

WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppId'), String.valueOf(id))

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppDisplayName'))

WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppDisplayName'), String.valueOf(id))

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppBundleKey'))

WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_AppBundleKey'), 'common')

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/enter_View_Link_App'))

//WebUI.setText(findTestObject('New_Test_Create_App/Page_Canvas World/enter_View_Link_App'), view_id)

String selectview = "//span[starts-with(text(), '"+String.valueOf(id)+"')]";

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


WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_App/Page_Canvas World/app_submission'))
}
