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

Map common = WebUI.callTestCase(findTestCase('Test Cases/Studio Smoke Test Cases/ReadExcel'), [:])

String req_id = common['REQID']

println(req_id)

String ws_id = common['WSID']

println(ws_id)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('Req_Mod_Test Data').getValue('URL', 1))

Thread.sleep(3000)

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginID'), findTestData('Req_Mod_Test Data').getValue(
        'Username', 1))

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginPSW'), findTestData('Req_Mod_Test Data').getValue(
        'Password', 1))

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))

WebUI.waitForPageLoad(20)

not_run: String pageHeader = WebUI.getText(findTestObject('New_Test_Create_Form/Page_Canvas World/get_HomePage_Header'))

not_run: println(pageHeader)

not_run: assert pageHeader == 'WORKSPACE CANVAS LIST'

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/span_Create'))

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/span_Request_Modular'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/click_Req_id'))

WebUI.setText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/click_Req_id'), req_id)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/click_Req_Name'))

WebUI.setText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/click_Req_Name'), req_id)

String service_type = findTestData('Req_Mod_Test Data').getValue('Service_Type', 1)

if (service_type == 'HAL') {
    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/service_type_HAL'))
} else if (service_type == 'Web Service') {
    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/service_type_Webservice'))
} else {
    println('Service Type is DATABASE')
}

String request_type = findTestData('Req_Mod_Test Data').getValue('Req_type', 1)

if (request_type == 'Admin') {
    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/Req_Type_Admin'))
} else {
    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/Req_Type_Customer'))
}

String request_mode = findTestData('Req_Mod_Test Data').getValue('Req_mode', 1)

if (request_mode == 'Private') {
    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/req_mode_private'))
} else if (request_mode == 'Public') {
    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/req_mode_public'))
} else {
    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/req_mode_semiPrivate'))
}

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/bundle_key'))

WebUI.setText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/bundle_key'), 'COMMON')

String req_category = findTestData('Req_Mod_Test Data').getValue('Req_category', 1)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/req_category'), req_category, 
    false)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/req_desc'))

WebUI.setText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/req_desc'), 'This is a new request')

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/search_connection'))

WebUI.delay(4)

String selectDB = ('(//td[@data-item-id=\'CONNECTION_NAME\']/span[contains(text(),\'' + findTestData('Req_Mod_Test Data').getValue(
    'DB_Name', 1)) + '\')])[2]'

println(selectDB)

TestObject dynamicObject = new TestObject(selectDB).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectDB, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.doubleClick(dynamicObject)

WebUI.doubleClick(dynamicObject)

WebUI.delay(6)

for (int i = 1; i <= 3; i++) {
    String prdtDetails = ('(//select[@id=\'REQ_ENTITLEMENT_FRM-REQ_PRODUCT\'])[' + i) + ']'

    println(prdtDetails)

    TestObject dynamicObject1 = new TestObject(prdtDetails).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        prdtDetails, true)

    WebUI.waitForElementVisible(dynamicObject1, 3)

    WebUI.selectOptionByValue(dynamicObject1, findTestData('Req_Mod_Test Data').getValue('Prdt_Code', 1), false)
}

for (int j = 1; j <= 3; j++) {
    String subprdtDetails = ('(//select[@id=\'REQ_ENTITLEMENT_FRM-REQ_SUB_PRODUCT\'])[' + j) + ']'

    println(subprdtDetails)

    TestObject dynamicObject2 = new TestObject(subprdtDetails).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        subprdtDetails, true)

    WebUI.waitForElementVisible(dynamicObject2, 3)

    WebUI.selectOptionByValue(dynamicObject2, findTestData('Req_Mod_Test Data').getValue('SubPrdt_Code', 1), false)
}

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/func_initiate'), findTestData(
        'Req_Mod_Test Data').getValue('Func_initiate', 1), false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/func_approve'), findTestData(
        'Req_Mod_Test Data').getValue('Func_approve', 1), false)

WebUI.selectOptionByValue(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/func_enquiry'), findTestData(
        'Req_Mod_Test Data').getValue('Func_enquiry', 1), false)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/addTable_button'))

WebUI.delay(20)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/select_Table'))

WebUI.delay(20)

WebUI.mouseOver(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/enter_tableName'))

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/click_contains'))

WebUI.delay(2)

WebUI.setText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/input_tableName_contains'), findTestData(
        'Req_Mod_Test Data').getValue('Table_Name', 1))

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/table_search'))

WebUI.delay(4)

String resultTable = ('(//span[contains(text(),\'' + findTestData('Req_Mod_Test Data').getValue('Table_Name', 1)) + '\')])[1]'

println(resultTable)

TestObject dynamicObject3 = new TestObject(resultTable).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    resultTable, true)

WebUI.waitForElementVisible(dynamicObject3, 3)

WebUI.doubleClick(dynamicObject3)

WebUI.doubleClick(dynamicObject3)

WebUI.delay(15)

WebUI.scrollToElement(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.focus(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'))

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), 'ACCOUNT_ID', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Create Request Modeler/Page_Canvas World/SummaryColumn'), Keys.chord(Keys.ENTER))

if (request_mode == 'Private') {
    WebUI.selectOptionByIndex(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/select_GCIF'), 2)

    WebUI.selectOptionByIndex(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/select_CIF'), 3)
} else if (request_mode == 'Semi Private') {
    WebUI.selectOptionByIndex(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/select_GCIF'), 2)
}

WebUI.focus(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/business_key'))

WebUI.sendKeys(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/business_key'), 'ACCOUNT_ID', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.sendKeys(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/business_key'), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/business_key'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/click_save'))

WebUI.setText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/json_textarea'), '{}')

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/reqMod_save'))

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/enter_workspaceId'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/enter_workspaceId'), 'Pay')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/enter_workspaceId'), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/enter_workspaceId'), Keys.chord(Keys.TAB))

WebUI.getText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/getLable'))

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/WS_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/WS_dialog'))

WebUI.delay(8)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/WS_for_widget'))

String selectReqWS = ('//span[contains(text(),\'' + findTestData('Req_Mod_Test Data').getValue('Edit_WS', 1)) + '\')]'

println(selectReqWS)

TestObject wdgt = new TestObject(selectReqWS).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectReqWS, true)

WebUI.waitForElementVisible(wdgt, 3)

WebUI.rightClick(wdgt)

WebUI.delay(2)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/edit_sub_WS'))

WebUI.delay(4)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/add_childApp'))

WebUI.delay(4)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/app_filter'))

WebUI.delay(4)

WebUI.mouseOver(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/click_appId'))

WebUI.delay(4)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/RM_wdgt_contains'))

WebUI.delay(4)

WebUI.setText(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/app_search'), 'RM_ACTSUM_APP')

WebUI.delay(4)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/button_search'))

WebUI.delay(4)

WebUI.doubleClick(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/add_approve_wdgt'))

WebUI.doubleClick(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/add_approve_wdgt'))

WebUI.delay(2)

boolean error_msg = WebUI.verifyElementPresent(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/error_msg'), 
    5)

if (String.valueOf(error_msg) == 'true') {
    WebUI.delay(4)

    WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/error_ok'))
} else {
    println('WS added')
}

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/button_submit'))

WebUI.delay(4)

WebUI.click(findTestObject('New_Test_Create_Request Moduler/Page_Canvas World/layout_dialog_ok'))

