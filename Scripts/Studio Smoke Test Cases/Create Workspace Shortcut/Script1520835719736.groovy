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

not_run: WebUI.setText(findTestObject('Create SHORTCUTS/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('Create SHORTCUTS/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('Create SHORTCUTS/Page_Expert CT Studio/input_commit'))

WebUI.delay(2)

WebUI.click(findTestObject('Create SHORTCUTS/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Create SHORTCUTS/Page_Canvas World/span_Create Shortcuts'))

WebUI.delay(3)

WebUI.click(findTestObject('Create SHORTCUTS/Page_Canvas World/workspace search lookup'))

not_run: WebUI.waitForElementPresent(findTestObject('Create SHORTCUTS/Page_Canvas World/span_PAYMENT_WS'), 10)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Create SHORTCUTS/Page_Canvas World/span_PAYMENT_WS'))

WebUI.doubleClick(findTestObject('Create SHORTCUTS/Page_Canvas World/span_PAYMENT_WS'))

WebUI.selectOptionByValue(findTestObject('Create SHORTCUTS/Page_Canvas World/select_Select CFFPYMTACCSERCUS'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Create SHORTCUTS/Page_Canvas World/select_Select CUSER'), 'CUSER', true)

WebUI.setText(findTestObject('Create SHORTCUTS/Page_Canvas World/input_APP_ID'), 'PAYMENT_WS_SHORTCUT')

WebUI.setText(findTestObject('Create SHORTCUTS/Page_Canvas World/input_APP_DISPLAY_NM_KEY'), 'PAYMENT_WS_SHORTCUT')

WebUI.click(findTestObject('Create SHORTCUTS/Page_Canvas World/a_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Create SHORTCUTS/Page_Canvas World/a_Ok'))

not_run: WebUI.closeBrowser()

