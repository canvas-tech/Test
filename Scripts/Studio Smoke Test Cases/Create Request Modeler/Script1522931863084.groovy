import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.List as List
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
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.19.29.253:8082/expertctstudio/')

WebUI.setText(findTestObject('Create Request Modeler/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('Create Request Modeler/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('Create Request Modeler/Page_Expert CT Studio/input_commit'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/span_Request'))

WebUI.delay(3)

WebUI.setText(findTestObject('Create Request Modeler/Page_Canvas World/input_REQ_ID'), 'AUTO_REQMOD01')

WebUI.setText(findTestObject('Create Request Modeler/Page_Canvas World/input_REQ_DISPLAY_NM'), 'AUTOMATION_REQUESTMODELER')

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/label_Admin'))

WebUI.setText(findTestObject('Create Request Modeler/Page_Canvas World/input_BUNDLE'), 'COMMON')

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/label_Public'))

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/select_Select LibraryService R'), 'LIBRARY', 
    true)

WebUI.setText(findTestObject('Create Request Modeler/Page_Canvas World/textarea_REQ_DESC'), 'AUTOMATION REQUEST MODELER')

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/i_flaticon-magnifying-glass2'))

WebUI.doubleClick(findTestObject('Create Request Modeler/Page_Canvas World/span_TEST_AUTOMATION_CONN'))

WebUI.doubleClick(findTestObject('Create Request Modeler/Page_Canvas World/span_TEST_AUTOMATION_CONN'))

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/Select_Cuser_Init'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/Select_SP_init'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/select_function_INIT'), 'INIT', true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/Select_Cuser_Approve'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/Select_SP_approve'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/select_function_Approve'), 'APPROVE', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/Select_Cuser_View'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/Select_SP_view'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Request Modeler/Page_Canvas World/select_function_view'), 'VIEW', true)

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/button_Add Table'))

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/Table_Filter icon'))

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/Table_Filter_tablenameSelect'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create Request Modeler/Page_Canvas World/Table_search textbox'), 'USER_ONLINE_REGISTRATION')

WebUI.delay(2)

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/Table Search'))

WebUI.doubleClick(findTestObject('Create Request Modeler/Page_Canvas World/span_USER_ONLINE_REGISTER'))

WebUI.doubleClick(findTestObject('Create Request Modeler/Page_Canvas World/span_USER_ONLINE_REGISTER'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/i_flaticon-expand_down'))

not_run: WebUI.doubleClick(findTestObject('REQMOD1/Page_Canvas World/span_OD_MESSAGE'))

WebUI.scrollToElement(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'))

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), 'BANK_NAME', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/autosuggest_WorkspaceID'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'))

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), 'IFSC_CODE', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/a_SAVE_TableSelect'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Create Request Modeler/Page_Canvas World/textarea_VALID_JSON_RULE'), '{}', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/a_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4)

WebUI.setText(findTestObject('Create Request Modeler/Page_Canvas World/WorkspaceId_Searchtextbox'), 'PAYMENT_WS')

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/WorkspaceId_Searchtextbox'), Keys.chord(Keys.ARROW_DOWN))

not_run: WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/autosuggest_WorkspaceID'))

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/WorkspaceId_Searchtextbox'), Keys.chord(Keys.TAB), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByIndex(findTestObject('Create Request Modeler/Page_Canvas World/WorkspaceId_Searchtextbox'), 
    1, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/autosuggest_WorkspaceID'))

WebUI.delay(5)

//String textToSelect = 'PAYMENT_WS'
//
//List<WebElement> optionToSelect = WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/autosuggest_WorkspaceID'))
//
//for (WebElement option : optionToSelect) {
//    if (option.getText().equals(textToSelect)) {
//        option.click()
//    }
//}
not_run: WebUI.selectOptionByIndex(findTestObject('Create Request Modeler/Page_Canvas World/autosuggest_WorkspaceID'), 1)

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/WorkspaceMenuSavebutton'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/WorkspaceMenuSavebutton'))

WebUI.verifyElementText(findTestObject('Create Request Modeler/Page_Canvas World/SuccessPopupMessage'), 'Workspace menu created successfully..')

WebUI.delay(3)

WebUI.click(findTestObject('Create Request Modeler/Page_Canvas World/a_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.closeBrowser()

