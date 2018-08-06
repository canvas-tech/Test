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

not_run: WebUI.setText(findTestObject('APP for Grid/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('APP for Grid/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('APP for Grid/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/span_Create New App'))

WebUI.delay(3)

WebUI.setText(findTestObject('APP for Grid/Page_Canvas World/input_WIDGET_ID (1)'), 'AUTOMATION_GRID_APP')

WebUI.setText(findTestObject('APP for Grid/Page_Canvas World/input_WGT_DISPLAY_NM'), 'AUTOMATION_GRID_APP')

WebUI.setText(findTestObject('APP for Grid/Page_Canvas World/input_BUNDLE_KEY'), 'COMMON')

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/i_flaticon-magnifying-glass2'))

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/a_View ID'))

WebUI.delay(2)

WebUI.setText(findTestObject('APP for Grid/Page_Canvas World/input_string_contains'), 'AUTOMATION_GRID_VIEW')

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('APP for Grid/Page_Canvas World/span_AUTOMATION_GRID_VIEW'))

WebUI.doubleClick(findTestObject('APP for Grid/Page_Canvas World/span_AUTOMATION_GRID_VIEW'))

//CustomKeywords.com.example.WebUIKeywords.clickUsingJS(findTestObject('APP for Grid/Page_Canvas World/a_Submit'), 30)
not_run: CustomKeywords.AppSubmitbtn.WebUIKeywords.clickUsingJS(findTestObject('APP for Grid/Page_Canvas World/a_Submit'), 
    30)

WebUI.delay(5)

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/a_Submit'))

not_run: WebUI.waitForElementVisible(findTestObject('APP for Grid/Page_Canvas World/a_Ok'), 10000)

WebUI.click(findTestObject('APP for Grid/Page_Canvas World/a_Ok'))

not_run: WebUI.closeBrowser()

