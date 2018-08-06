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

WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Create Paging Grid/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('Create Paging Grid/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('Create Paging Grid/Page_Expert CT Studio/input_commit'))

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/span_Initiate'))

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/span_Create  New View'))

WebUI.setText(findTestObject('Create Paging Grid/Page_Canvas World/input_VIEW_ID'), 'AUTO_PAGINGGRID_VIEW')

WebUI.setText(findTestObject('Create Paging Grid/Page_Canvas World/input_VIEW_DISPLAY_NM'), 'AUTO_PAGINGGRID_VIEW')

WebUI.selectOptionByValue(findTestObject('Create Paging Grid/Page_Canvas World/select_Select Advertisements V'), 'PAGING', 
    true)

WebUI.setText(findTestObject('Create Paging Grid/Page_Canvas World/input_VIEW_BUNDLE_KEY'), 'COMMON')

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/i_flaticon-magnifying-glass2'))

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/span_ct-app__tools flaticon-fi'))

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/a_Data Source Name'))

WebUI.setText(findTestObject('Create Paging Grid/Page_Canvas World/input_string_contains'), 'TEST_AUTO_DATASOURCE01')

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/button_SEARCH'))

WebUI.doubleClick(findTestObject('Create Paging Grid/Page_Canvas World/span_TEST_AUTO_DATASOURCE01'))

WebUI.doubleClick(findTestObject('Create Paging Grid/Page_Canvas World/span_TEST_AUTO_DATASOURCE01'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/instruction_Yes'))

WebUI.selectOptionByValue(findTestObject('Create Paging Grid/Page_Canvas World/select_Select CFFPYMTACCSERCUS'), 'CUSER', 
    true)

WebUI.selectOptionByValue(findTestObject('Create Paging Grid/Page_Canvas World/select_Select CUSER'), 'CUSER', true)

WebUI.selectOptionByValue(findTestObject('Create Paging Grid/Page_Canvas World/select_Select APPROVEINITVIEWV'), 'VSBLTY', 
    true)

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/span_ct-form_fieldset_icon ct-'))

WebUI.setText(findTestObject('Create Paging Grid/Page_Canvas World/input_RECORDS_PER_PAGE'), '2')

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/totalcountindicator_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/Widget_Yes'))

WebUI.setText(findTestObject('Create Paging Grid/Page_Canvas World/input_WIDGET_ID'), 'AUTO_PAGINGGRID_APP')

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/a_Submit'))

WebUI.click(findTestObject('Create Paging Grid/Page_Canvas World/a_Ok'))

WebUI.closeBrowser()

