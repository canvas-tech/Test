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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

not_run: WebUI.setText(findTestObject('Create Workspace Designer/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('Create Workspace Designer/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('Create Workspace Designer/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/span_Workspace designer'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/button_Create new'))

WebUI.setText(findTestObject('Create Workspace Designer/Page_Canvas World/input_workspaceDisplayName'), 'AUTO_WS_DESIGNER')

WebUI.setText(findTestObject('Create Workspace Designer/Page_Canvas World/input_bundleKey'), 'COMMON')

WebUI.selectOptionByValue(findTestObject('Create Workspace Designer/Page_Canvas World/select_Select             CFF'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Workspace Designer/Page_Canvas World/select_SelectCUSER'), 'CUSER', true)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/span_Proceed'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/button_wsfontbtns btn-addapp-s'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create Workspace Designer/Page_Canvas World/input_subWorkspaceDisplayName'), 'AUTOMATION_SWS')

WebUI.selectOptionByValue(findTestObject('Create Workspace Designer/Page_Canvas World/select_Select'), 'CUSER', true)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/span_Proceed'))

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/button_wsfontbtns btn-lookup-s'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/label_AUTOMATION_CHART_APP'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/label_AUTOMATION_SHORTCUT_APP'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/label_AUTOMATION_GRID_APP'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/label_AUTOMATION_FORM_APP'))

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/span_Add'))

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/button_wsfontbtns btn-sws-save'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/a_Ok'))

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/WorkspaceDesigner_closeicon'))

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/WSD_closedialog_OKbutton'))

not_run: WebUI.closeBrowser()

