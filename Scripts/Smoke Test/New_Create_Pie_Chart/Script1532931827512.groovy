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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/expertctstudio')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))
WebUI.waitForPageLoad(10)

Map common = WebUI.callTestCase(findTestCase('Test Cases/Studio Smoke Test Cases/ReadExcel'), [:])

String form_id = common['formID']

println(form_id)

String view_id = common['viewID']

println(view_id)

/*String homePageHeader = WebUI.getText(findTestObject('New_Test_Create_Form/Page_Canvas World/get_HomePage_Header'))

println(homePageHeader)

assert homePageHeader == 'WORKSPACE CANVAS LIST'*/
WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('New_Test_Create_View/Page_Canvas World/span_View'))

WebUI.waitForPageLoad(10)

/*String pageHeader = WebUI.getText(findTestObject('New_Test_Create_View/Page_Canvas World/view_pageHeader'))

println(pageHeader)

assert pageHeader == 'CREATE VIEW DEFINITION'

WebUI.delay(8)*/
WebUI.click(findTestObject('New_Test_Create_View/Page_Canvas World/enter_ViewId'))

WebUI.setText(findTestObject('New_Test_Create_View/Page_Canvas World/enter_ViewId'), findTestData('Grid_id').getValue('Simple', 
        1))

WebUI.click(findTestObject('New_Test_Create_View/Page_Canvas World/view_DisplayName'))

WebUI.setText(findTestObject('New_Test_Create_View/Page_Canvas World/view_DisplayName'), findTestData('Grid_id').getValue(
        'Simple', 1))

WebUI.selectOptionByValue(findTestObject('New_Test_Create_View/Page_Canvas World/select_ViewType'), 'CHART', false)

WebUI.click(findTestObject('New_Test_Create_View/Page_Canvas World/enter_ResourceBundle'))

WebUI.setText(findTestObject('New_Test_Create_View/Page_Canvas World/enter_ResourceBundle'), 'common')

WebUI.selectOptionByValue(findTestObject('Chart_type/bar_chart'), 'PIE', false)

WebUI.delay(1)

WebUI.click(findTestObject('Chart_type/click_2D'))

WebUI.delay(6)

WebUI.waitForElementVisible(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/click_selectForm'), 10)

WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/click_selectForm'))

String selectForm = ('//span[starts-with(text(), \'' + 'ACCOUNT TABLE') + '\')]'

println(selectForm)

TestObject dynamicObject = new TestObject(selectForm).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectForm, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.doubleClick(dynamicObject)

WebUI.doubleClick(dynamicObject)

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/click_default_ins_yes'))

WebUI.selectOptionByValue(findTestObject('New_Test_Create_View/Page_Canvas World/select_ProductCode'), findTestData('Test Data').getValue(
        'Product_Code', 1), false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_View/Page_Canvas World/select_SubProductCode'), findTestData('Test Data').getValue(
        'SubPrdt_Code', 1), false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_View/Page_Canvas World/select_FunctionCode'), findTestData('Test Data').getValue(
        'Function_Code', 1), false)

WebUI.delay(3)

/*WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/expand_gridConfig'))

WebUI.setText(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/enter_numberPerPage'), '2')

WebUI.delay(3)

WebUI.setText(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/record_initial'), '15')

WebUI.delay(3)*/

WebUI.click(findTestObject('New_Test_Create_View/Page_Canvas World/view_Submit'))

WebUI.click(findTestObject('New_Test_Create_View/Page_Canvas World/view_Submission'))

