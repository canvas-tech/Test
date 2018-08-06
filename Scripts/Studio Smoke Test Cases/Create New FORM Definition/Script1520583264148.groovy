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

not_run: WebUI.setText(findTestObject('Create Form Definition/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('Create Form Definition/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('Create Form Definition/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_Create New Form'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_designer-item-icon form-i'))

not_run: WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/label_Title'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_2'))

not_run: WebUI.clearText(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'))

WebUI.sendKeys(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'), 'AUTOMATION TEST FORM')

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_designer-item-icon form-i_1'))

WebUI.waitForElementVisible(findTestObject('Create Form Definition/Page_Canvas World/span_2'), 5)

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_2'))

not_run: WebUI.clearText(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'))

WebUI.sendKeys(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'), 'FIRST NAME')

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_designer-item-icon form-i_2'))

WebUI.waitForElementVisible(findTestObject('Create Form Definition/Page_Canvas World/span_2'), 5)

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_2'))

not_run: WebUI.clearText(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'))

WebUI.sendKeys(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'), 'ADDRESS')

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_designer-item-icon form-i_3'))

WebUI.waitForElementVisible(findTestObject('Create Form Definition/Page_Canvas World/span_2'), 5)

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/span_2'))

not_run: WebUI.clearText(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'))

WebUI.sendKeys(findTestObject('Create Form Definition/Page_Canvas World/input_input-text'), 'SUBMIT')

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/input_designer-btn save-btn'))

WebUI.click(findTestObject('Create Form Definition/Page_Canvas World/a_Ok'))

not_run: WebUI.closeBrowser()

