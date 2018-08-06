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

not_run: WebUI.setText(findTestObject('Create Workspace/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('Create Workspace/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('Create Workspace/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/span_Create New Canvas'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_WS_ID'), 'AUTOMATION_WORKSPACE')

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_WS_NM_KEY'), 'AUTOMATION_WORKSPACE')

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_WS_RB'), 'COMMON')

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_WS_POSITION'), '1')

WebUI.selectOptionByValue(findTestObject('Create Workspace/Page_Canvas World/select_Select CFFPYMTACCSERCUS'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Workspace/Page_Canvas World/select_Select CUSER'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Workspace/Page_Canvas World/select_Select L-MENUR-MENUSTAC'), 'STACK', 
    true)

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_Create a Sub Workspace'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_SUBWS_ID'), 'AUTOMATION_SUBWORKSPACE')

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_SUBWS_NM_KEY'), 'AUTOMATION_SUBWORKSPACE')

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_SUBWS_RB'), 'COMMON')

WebUI.selectOptionByValue(findTestObject('Create Workspace/Page_Canvas World/select_Select CFFPYMTACCSERCUS_1'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Workspace/Page_Canvas World/select_Select CUSER_1'), 'CUSER', true)

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/a_App ID'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_string_contains'), 'AUTOMATION_GRID_APP')

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_GRID_APP'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_GRID_APP'))

not_run: WebUI.waitForPageLoad(5000)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'))

//WebElement element = WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'))
//Actions actions = new Actions(driver)
//actions.moveToElement(element).click().build().perform()
WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/a_App ID'))

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_string_contains'), 'AUTOMATION_CHART_APP')

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_CHART_APP'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_CHART_APP'))

not_run: WebUI.verifyElementClickable(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'))

not_run: WebUI.waitForPageLoad(5000)

not_run: WebUI.waitForElementPresent(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'), 10000)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/a_App ID'))

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_string_contains'), 'AUTOMATION_FORM_APP')

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_FORM_APP'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_FORM_APP'))

not_run: WebUI.waitForElementPresent(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'), 10000)

not_run: WebUI.waitForPageLoad(5000)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/a_App ID'))

WebUI.setText(findTestObject('Create Workspace/Page_Canvas World/input_string_contains'), 'AUTOMATION_SHORTCUT_APP')

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_SHORTCUT_APP'))

WebUI.doubleClick(findTestObject('Create Workspace/Page_Canvas World/span_AUTOMATION_SHORTCUT_APP'))

not_run: WebUI.waitForElementPresent(findTestObject('Create Workspace/Page_Canvas World/button_Add Child App'), 10000)

not_run: WebUI.waitForPageLoad(5000)

not_run: WebUI.scrollToElement(findTestObject('Create Workspace/Page_Canvas World/sws_Submit'), 10)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/sws_Submit'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Workspace/Page_Canvas World/WS_Submit'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/a_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/WorkspaceDesigner_closeicon'))

not_run: WebUI.click(findTestObject('Create Workspace Designer/Page_Canvas World/WSD_closedialog_OKbutton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

