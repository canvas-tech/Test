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

not_run: WebUI.setText(findTestObject('Create Chart View/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

not_run: WebUI.setText(findTestObject('Create Chart View/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

not_run: WebUI.click(findTestObject('Create Chart View/Page_Expert CT Studio/input_commit'))

WebUI.delay(5)

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/span_Create  New View'))

WebUI.setText(findTestObject('Create Chart View/Page_Canvas World/input_VIEW_ID'), 'AUTOMATION_CHART_VIEW01')

WebUI.setText(findTestObject('Create Chart View/Page_Canvas World/input_VIEW_DISPLAY_NM'), 'AUTOMATION_CHART_VIEW01')

WebUI.selectOptionByValue(findTestObject('Create Chart View/Page_Canvas World/select_Select Advertisements V'), 'CHART', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Chart View/Page_Canvas World/select_Select Angular GaugeAre'), 'BAR', true)

WebUI.setText(findTestObject('Create Chart View/Page_Canvas World/input_VIEW_BUNDLE_KEY'), 'COMMON')

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/input_CHART_DIMENSION'))

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/i_flaticon-magnifying-glass2'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/a_Data Source Name'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create Chart View/Page_Canvas World/input_string_contains'), 'TEST_AUTO_DATASOURCE01')

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('Create Chart View/Page_Canvas World/span_TEST_AUTO_DATASOURCE01'))

WebUI.doubleClick(findTestObject('Create Chart View/Page_Canvas World/span_TEST_AUTO_DATASOURCE01'))

WebUI.delay(5)

WebUI.setText(findTestObject('Create Chart View/Page_Canvas World/input_INSTRUCTION_CLASS'), 'com.intellectdesign.modelhouse.views.CTAccSummaryViewsInstruction')

not_run: WebUI.waitForElementVisible(findTestObject('Create Chart View/Page_Canvas World/select_Select CFFPYMTACCSERCUS'), 
    3000)

WebUI.selectOptionByValue(findTestObject('Create Chart View/Page_Canvas World/select_Select CFFPYMTACCSERCUS'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Chart View/Page_Canvas World/select_Select CUSER'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Chart View/Page_Canvas World/select_Select APPROVEINITVIEWV'), 'VSBLTY', 
    true)

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/button_More1'))

WebUI.delay(5)

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/input_CHART_AXIS_IND'))

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/a_Submit1'))

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/button_More2'))

WebUI.delay(5)

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/input_CHART_AXIS_IND_1'))

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/a_Submit2'))

WebUI.delay(5)

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/a_Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Chart View/Page_Canvas World/a_Ok'))

not_run: WebUI.closeBrowser()

