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

not_run: WebUI.setText(findTestObject('Create Template/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('Create Template/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('Create Template/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('Create Template/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Create Template/Page_Canvas World/span_Create New Template'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create Template/Page_Canvas World/input_TEMPLATE_ID'), 'AUTOMATION_TEMPLATE')

WebUI.delay(2)

WebUI.setText(findTestObject('Create Template/Page_Canvas World/input_TEMPLATE_DESC'), 'AUTOMATION_TEMPLATE')

WebUI.click(findTestObject('Create Template/Page_Canvas World/label_Yes'))

WebUI.setText(findTestObject('Create Template/Page_Canvas World/textarea_TEMPLATE_CONFIG'), 'templates/html/index.html')

WebUI.click(findTestObject('Create Template/Page_Canvas World/a_Submit'))

WebUI.click(findTestObject('Create Template/Page_Canvas World/a_Ok'))

not_run: WebUI.closeBrowser()

