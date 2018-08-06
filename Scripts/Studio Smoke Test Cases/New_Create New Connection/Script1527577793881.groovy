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

WebUI.navigateToUrl('http://172.19.29.253:8082/expertctstudio/')

WebUI.setText(findTestObject('New_Create New Connection/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('New_Create New Connection/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('New_Create New Connection/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('New_Create New Connection/Page_Canvas World/Initiate Menu'))

WebUI.click(findTestObject('New_Create New Connection/Page_Canvas World/span_Create New Connection'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('New_Create New Connection/Page_Canvas World/input_CONNECTION_NAME'), 'TEST_AUTOMATION_CONN')

WebUI.setText(findTestObject('New_Create New Connection/Page_Canvas World/input_HOST_NAME'), 'localhost')

WebUI.setText(findTestObject('New_Create New Connection/Page_Canvas World/input_PORT'), '1521')

WebUI.setText(findTestObject('New_Create New Connection/Page_Canvas World/input_SERVICE_NAME'), 'pdborcl.intellectdesign.com')

WebUI.setText(findTestObject('New_Create New Connection/Page_Canvas World/input_USER_NAME'), 'MODEL_7857')

WebUI.setText(findTestObject('New_Create New Connection/Page_Canvas World/input_USER_PASSWORD'), 'MODEL_7857')

WebUI.click(findTestObject('New_Create New Connection/Page_Canvas World/a_Save'))

WebUI.click(findTestObject('New_Create New Connection/Page_Canvas World/a_Ok'))

not_run: WebUI.closeBrowser()

