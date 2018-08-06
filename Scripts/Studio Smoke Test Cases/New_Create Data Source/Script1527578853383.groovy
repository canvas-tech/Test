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

not_run: WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('New_Create Data Source/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('New_Create Data Source/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('New_Create Data Source/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/a_CONNECTIONS'))

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/a_Connection Name'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('New_Create Data Source/Page_Canvas World/input_string_contains'), 'TEST_AUTOMATION_CONN')

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/button_SEARCH'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.rightClick(findTestObject('New_Create Data Source/Page_Canvas World/td_TEST_AUTOMATION_CONN'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/a_Manage Data Sources'))

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/a_Create Data Source'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('New_Create Data Source/Page_Canvas World/input_DATA_SOURCE_NAME'), 'TEST_AUTO_DATASOURCE01')

WebUI.setText(findTestObject('New_Create Data Source/Page_Canvas World/input_TABLE_NAMES'), 'ACCOUNT_SUMMARY_DATA')

WebUI.setText(findTestObject('New_Create Data Source/Page_Canvas World/input_COLUMN_IDS'), '*')

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/a_Save'))

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/a_Ok'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('New_Create Data Source/Page_Canvas World/button_flaticon-close flaticon'))

not_run: WebUI.closeBrowser()

