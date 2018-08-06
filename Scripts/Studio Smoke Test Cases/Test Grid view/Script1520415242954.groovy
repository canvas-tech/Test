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

WebUI.setText(findTestObject('Test Grid view/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('Test Grid view/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('Test Grid view/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/span_Create  New View'))

WebUI.setText(findTestObject('Test Grid view/Page_Canvas World/input_VIEW_ID'), 'TEST_AUTO_SIMPLEGRID01')

WebUI.setText(findTestObject('Test Grid view/Page_Canvas World/input_VIEW_DISPLAY_NM'), 'TEST_AUTO_SIMPLEGRID01')

WebUI.selectOptionByValue(findTestObject('Test Grid view/Page_Canvas World/select_Select Advertisements V'), 'CLASSIC_GRID', 
    true)

WebUI.setText(findTestObject('Test Grid view/Page_Canvas World/input_VIEW_BUNDLE_KEY'), 'COMMON')

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/i_flaticon-magnifying-glass2'))

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/a_Data Source Name'))

WebUI.waitForElementPresent(findTestObject('Test Grid view/Page_Canvas World/input_string_contains'), 3000)

WebUI.setText(findTestObject('Test Grid view/Page_Canvas World/input_string_contains'), 'TEST_AUTO_DATASOURCE01')

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/button_SEARCH'))

not_run: WebUI.waitForElementPresent(findTestObject('Test Grid view/Page_Canvas World/td_TEST_AUTO_DATASOURCE01'), 
    2000)

WebUI.doubleClick(findTestObject('Test Grid view/Page_Canvas World/td_TEST_AUTO_DATASOURCE01'))

WebUI.waitForElementPresent(findTestObject('Test Grid view/Page_Canvas World/td_TEST_AUTO_DATASOURCE01'), 2000)

WebUI.doubleClick(findTestObject('Test Grid view/Page_Canvas World/td_TEST_AUTO_DATASOURCE01'))

not_run: WebUI.waitForElementPresent(findTestObject('Test Grid view/Page_Canvas World/input_INSTRUCTION_CLASS'), 
    2000)

WebUI.setText(findTestObject('Test Grid view/Page_Canvas World/Page_Canvas World (2)/input_INSTRUCTION_CLASS'), 
    'com.intellectdesign.modelhouse.views.CTAccSummaryViewsInstruction')

not_run: WebUI.click(findTestObject('Test Grid view/Page_Canvas World/label_Yes'))

WebUI.selectOptionByValue(findTestObject('Test Grid view/Page_Canvas World/select_Select CFFPYMTACCSERCUS'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Test Grid view/Page_Canvas World/select_Select CUSER'), 'CUSER', true)

not_run: WebUI.click(findTestObject('Test Grid view/Page_Canvas World/select_Select VSBLTY'))

not_run: WebUI.waitForElementPresent(findTestObject('Test Grid view/Page_Canvas World/select_Select VSBLTY'), 2000)

WebUI.selectOptionByValue(findTestObject('Test Grid view/Page_Canvas World/select_Select VSBLTY'), 'VSBLTY', true)

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/a_Submit'))

WebUI.click(findTestObject('Test Grid view/Page_Canvas World/a_Ok'))

WebUI.closeBrowser()

