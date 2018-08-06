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

Map common = WebUI.callTestCase(findTestCase('Test Cases/Studio Smoke Test Cases/ReadExcel'), [:])

String form_id = common['formID']

println(form_id)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('Test Data').getValue('URL', 1))

Thread.sleep(3000)

/*String folder = 'D:\\Sheepa\\AutoIt\\'

String exe = 'KAuth.exe'

// Create and start Process with ProcessBuilder.
ProcessBuilder p = new ProcessBuilder('cmd.exe', '/C', 'start')

p.command(folder + exe)

p.start()

Thread.sleep(2000)
*/
//WebUI.navigateToUrl('http://172.19.29.253:8082/expertctstudio/')
WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginID'), findTestData('Test Data').getValue(
        'Username', 1))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginPSW'), findTestData('Test Data').getValue(
        'Password', 1))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))

WebUI.waitForPageLoad(20)

/*String pageHeader = WebUI.getText(findTestObject('New_Test_Create_Form/Page_Canvas World/get_HomePage_Header'))

println(pageHeader)

assert pageHeader == 'WORKSPACE CANVAS LIST'*/

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Form'))

WebUI.delay(8)

String formHeader = WebUI.getText(findTestObject('New_Test_Create_Form/Page_Canvas World/form_Title'))

println(formHeader)

assert formHeader == 'CREATE / EDIT FORM'

/*WebUI.waitForElementVisible('New_Test_Create_Form/Page_Canvas World/form_Edit', 10)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/form_Edit'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/form_details'))*/
WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_ID'))

not_run: WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/input_input-text'), '')

not_run: WebUI.clearText(findTestObject('New_Test_Create_Form/Page_Canvas World/input_input-text'))

WebUI.delay(5)

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/input_input-text'), form_id)

WebUI.delay(4)

not_run: WebUI.switchToWindowIndex(1)

if (WebUI.verifyElementPresent(findTestObject('New_Test_Create_Form/Page_Canvas World/error_PopUp'), 10)) {
    WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/error_OK'))

    WebUI.delay(5)

    WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_TextField'))
} else {
    WebUI.delay(5)

    WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_TextField'))
}

/*WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/error_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_TextField'))*/
WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/form_Edit'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/label_PlainLabel'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/label_EnterText'), 'Text_Label_01')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/textField_Click'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/LAlign_Inline'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/validation_Number'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/textField_Click'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/mandatory_Field'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/textField_Click'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/inputSize_Min'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/set_MinLength'), '6')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/textField_Click'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/inputSize_Max'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/set_MaxLength'), '12')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_TextArea'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/textArea_Click'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/validation_AlphaNumeric'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/password_Click'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/password_Area'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/mandatory_Field'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/password_Area'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/inputSize_Min'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/set_MinLength'), '6')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/password_Area'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/inputSize_Max'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/set_MaxLength'), '12')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/password_Area'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/validation_AlphaNumeric'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_ChkBox'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/chkbx_settings'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/chkbx_settingsArea'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/chkbx_settingsArea'), 'Ok : OK')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Chkbox_grp'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/chkbxGrp_settings'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/chkbxGrp_settingsArea'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/chkbxGrp_settingsArea'), 'Ok : OK, NotOK : NOT OK')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_RadioGrp'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/radioGrp_settings'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/radioGrp_settingsArea'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/radioGrp_settingsArea'), 'Ok : OK, NotOK : NOT OK')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_ComboBox'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/comboField_settings'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/comboField_settingsArea'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/comboField_settingsArea'), 'Ok : OK, NotOK : NOT OK')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Title'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/title_area'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/label_PlainLabel'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/label_EnterText'), 'Title_01')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/date_area'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/date_area'), '30/12/2020')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_Label'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/label_area'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/label_PlainLabel'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/label_EnterText'), 'Label_01')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/span_button'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/click_ButtonArea'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/label_PlainLabel'))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Canvas World/label_EnterText'), 'Submit')

WebUI.delay(5)

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/form_save'))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Canvas World/formSave_dialogBox'))

not_run: WebUI.closeBrowser()

