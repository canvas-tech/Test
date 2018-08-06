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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

WebUI.setText(findTestObject('FORM DEFINITION/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('FORM DEFINITION/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('FORM DEFINITION/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_Create New Form'))

not_run: WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_ID'))

not_run: WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_ID'))

WebUI.waitForElementPresent(findTestObject('FORM DEFINITION/Page_Canvas World/span_Title'), 10)

not_run: WebUI.clearText(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 'AUTOMATIONFORM01')

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_Title'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_Title'))

WebUI.waitForElementPresent(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 20)

WebUI.clearText(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 'AUTOMATIONFORM01')

not_run: WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_Description'))

not_run: WebUI.waitForElementPresent(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 10)

not_run: WebUI.clearText(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 'AUTOMATIONFORM01')

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_designer-item-icon form-i'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_2'))

WebUI.setText(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 'AUTOMATION TEST SAMPLE FORM')

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_designer-item-icon form-i_1'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_Text Field'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_2'))

WebUI.setText(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 'NAME')

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_designer-item-icon form-i_2'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_2'))

WebUI.setText(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 'ADDRESS')

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_designer-item-icon form-i_3'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/span_2'))

WebUI.setText(findTestObject('FORM DEFINITION/Page_Canvas World/input_input-text'), 'SUBMIT')

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/input_designer-btn save-btn'))

WebUI.click(findTestObject('FORM DEFINITION/Page_Canvas World/a_Ok'))

WebUI.closeBrowser()

