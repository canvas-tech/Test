import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Desktop.Action as Action
import javax.swing.plaf.basic.BasicButtonListener.Actions as Actions
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
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
import org.eclipse.persistence.jpa.jpql.parser.ElseExpressionBNF as ElseExpressionBNF
import org.openqa.selenium.Keys as Keys

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

not_run: WebUI.setText(findTestObject('Create Simple Grid View/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('Create Simple Grid View/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('Create Simple Grid View/Page_Expert CT Studio/input_commit'))

'Verify that user able to click on the Initiate in the home screen.'
WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/span_Initiate'))

'Verify that system allow the user to select the "Create New View" from the menu list and its navigate to Create view screen.'
WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/span_Create  New View'))

WebUI.setText(findTestObject('Create Simple Grid View/Page_Canvas World/input_VIEW_ID'), 'AUTOMATION_GRID_VIEW')

WebUI.setText(findTestObject('Create Simple Grid View/Page_Canvas World/input_VIEW_DISPLAY_NM'), 'AUTOMATION_GRID_VIEW')

WebUI.selectOptionByValue(findTestObject('Create Simple Grid View/Page_Canvas World/select_Select Advertisements V'), 'CLASSIC_GRID', 
    true)

WebUI.setText(findTestObject('Create Simple Grid View/Page_Canvas World/input_VIEW_BUNDLE_KEY'), 'COMMON')

WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/i_flaticon-magnifying-glass2'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/a_Data Source Name'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Create Simple Grid View/Page_Canvas World/input_string_contains'), 'TEST_AUTO_DATASOURCE01')

WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('Create Simple Grid View/Page_Canvas World/span_TEST_AUTO_DATASOURCE01'))

WebUI.doubleClick(findTestObject('Create Simple Grid View/Page_Canvas World/span_TEST_AUTO_DATASOURCE01'))

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Create Simple Grid View/Page_Canvas World/input_INSTRUCTION_CLASS'), 'com.intellectdesign.modelhouse.views.CTAccSummaryViewsInstruction')

WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/default_instruction_Y'))

WebUI.selectOptionByValue(findTestObject('Create Simple Grid View/Page_Canvas World/select_Select CFFPYMTACCSERCUS'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Simple Grid View/Page_Canvas World/select_Select CUSER'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Simple Grid View/Page_Canvas World/select_Select APPROVEINITVIEWV'), 'VSBLTY', 
    true)

WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/a_Submit'))

//If (WebUI.verifyElementText(findTestObject('Create Simple Grid View/Page_Canvas World/success_popup_text_verification'), 'View Defintion has been edited successfully.')==true)
//{
//	WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/a_Ok'))
//}
//Else
//{
////	KeywordLogger log = new KeywordLogger()
////	log.logInfo("View Definition NOT saved Successfully", null)
//	actresult = WebUI.getText(findTestObject('Create Simple Grid View/Page_Canvas World/success_popup_text_verification'))
//	println('actresult')
//	}
//If (WebUI.verifyElementText(findTestObject('Create Simple Grid View/Page_Canvas World/success_popup_text_verification'), 'View Defintion has been created successfully.')==true)
//{
//	WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/a_Ok'))
//}
WebUI.click(findTestObject('Create Simple Grid View/Page_Canvas World/a_Ok'))

not_run: WebUI.closeBrowser()

