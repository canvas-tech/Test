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

not_run: WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

not_run: WebUI.setText(findTestObject('APP for Shortcut/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('APP for Shortcut/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('APP for Shortcut/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/span_Create New App'))

WebUI.delay(2)

WebUI.setText(findTestObject('APP for Shortcut/Page_Canvas World/input_WIDGET_ID'), 'AUTOMATION_SHORTCUT_APP')

WebUI.setText(findTestObject('APP for Shortcut/Page_Canvas World/input_WGT_DISPLAY_NM'), 'AUTOMATION_SHORTCUT_APP')

WebUI.setText(findTestObject('APP for Shortcut/Page_Canvas World/input_BUNDLE_KEY'), 'COMMON')

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/i_flaticon-magnifying-glass2'))

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/a_View ID'))

WebUI.delay(2)

WebUI.setText(findTestObject('APP for Shortcut/Page_Canvas World/input_string_contains'), 'AUTOMATION_SHRTCUT_VIEW01')

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('APP for Shortcut/Page_Canvas World/span_TEST_AUTO_APPSHRTCUT01'))

WebUI.doubleClick(findTestObject('APP for Shortcut/Page_Canvas World/span_TEST_AUTO_APPSHRTCUT01'))

WebUI.delay(5)

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/a_Submit'))

WebUI.click(findTestObject('APP for Shortcut/Page_Canvas World/a_Ok'))

WebUI.delay(2)

not_run: WebUI.closeBrowser()

