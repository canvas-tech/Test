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

String ws_id = common['WSID']

println(ws_id)

String req_id = common['REQID']

println(req_id)

String acc_No = common['AccNo']

println(acc_No)

'Opening the Browser.'
WebUI.openBrowser('')

'Maximize the browser.'
WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/ctmodelhouse/cacheReset.jsp')

WebUI.closeBrowser()

WebUI.openBrowser('')

'Maximize the browser.'
WebUI.maximizeWindow()

'Verifiy that user able to launch Application.'
WebUI.navigateToUrl(findTestData('MH_Test Data').getValue('URL', 1))

WebUI.waitForPageLoad(10)

'Verify that user able to enter the user name.'
WebUI.setText(findTestObject('Model House Login/Page_Model House/input_loginID'), findTestData('MH_Test Data').getValue(
        'Username', 1))

'Verify that user able to enter the password.'
WebUI.setText(findTestObject('Model House Login/Page_Model House/input_loginPSW'), findTestData('MH_Test Data').getValue(
        'Password', 1))

//WebUI.setEncryptedText(findTestObject('Model House Login/Page_Model House/input_loginPSW'), 'Y2FudmFz')
'Verify that user able to click on the Login and able to open the application.'
WebUI.click(findTestObject('Model House Login/Page_Model House/input_commit'))

WebUI.waitForPageLoad(10)

String pageHeader = WebUI.getAttribute(findTestObject('Model House Home Page/Page_Canvas World/Home_Page_Title'), 'title')

println(pageHeader)

assert pageHeader == 'Canvas Technology'

String selectWS = ('//div[contains(text(),\'' + findTestData('Req_Mod_Test Data').getValue('Req_Mod_WS', 1)) + '\')]'

println(selectWS)

TestObject dynamicObject = new TestObject(selectWS).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectWS, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.click(dynamicObject)

WebUI.delay(10)

String selectRM = ('//span[starts-with(@class,\'workspace_label workspace_label-' + req_id) + '\')]'

//String selectRM = "//span[contains(text(),'" + req_id +"')]"
println(selectRM)

TestObject dynamicObject1 = new TestObject(selectRM).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectRM, true)

WebUI.waitForElementVisible(dynamicObject1, 3)

WebUI.click(dynamicObject1)

WebUI.delay(10)

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_ac_no'), acc_No)

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_acc_type'), findTestData('Req_Mod_Test Data').getValue(
        'Acc_Type', 1))

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_avail_bal'), findTestData('Req_Mod_Test Data').getValue(
        'Avail_Bal', 1))

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_status'), findTestData('Req_Mod_Test Data').getValue(
        'Status', 1))

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_unclearedFund'), findTestData('Req_Mod_Test Data').getValue(
        'Uncleared_Fund', 1))

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_ovrdft_lmt'), findTestData('Req_Mod_Test Data').getValue(
        'Overdraft_limit', 1))

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_currency'), findTestData('Req_Mod_Test Data').getValue(
        'Currency', 1))

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/enter_ac_name'), findTestData('Req_Mod_Test Data').getValue(
        'Acc_Name', 1))

WebUI.delay(3)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/click_submit'))

WebUI.delay(3)

String readAccNo = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue('Col_1', 1)) + '\']'

println(readAccNo)

TestObject dO = new TestObject(readAccNo).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, readAccNo, 
    true)

WebUI.waitForElementVisible(dO, 3)

String accNo = WebUI.getText(dO)

println(accNo)

assert accNo == acc_No

String readStatus = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue('Col_2', 1)) + '\']'

println(readStatus)

TestObject dO1 = new TestObject(readStatus).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, readStatus, 
    true)

WebUI.waitForElementVisible(dO1, 3)

String status = WebUI.getText(dO1)

println(status)

assert status == findTestData('Req_Mod_Test Data').getValue('Status', 1)

String readUnclrFund = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue('Col_3', 1)) + '\']'

println(readUnclrFund)

TestObject dO2 = new TestObject(readUnclrFund).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    readUnclrFund, true)

WebUI.waitForElementVisible(dO2, 3)

String unClrFund = WebUI.getText(dO2)

println(unClrFund)

assert unClrFund == findTestData('Req_Mod_Test Data').getValue('Uncleared_Fund', 1)

String readOvrDft = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue('Col_4', 1)) + '\']'

println(readOvrDft)

TestObject dO3 = new TestObject(readOvrDft).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, readOvrDft, 
    true)

WebUI.waitForElementVisible(dO3, 3)

String ovrDft = WebUI.getText(dO3)

println(ovrDft)

assert ovrDft == findTestData('Req_Mod_Test Data').getValue('Overdraft_limit', 1)

String readCurrency = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue('Col_5', 1)) + '\']'

println(readCurrency)

TestObject dO4 = new TestObject(readCurrency).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    readCurrency, true)

WebUI.waitForElementVisible(dO4, 3)

String currency = WebUI.getText(dO4)

println(currency)

assert currency == findTestData('Req_Mod_Test Data').getValue('Currency', 1)

String readAccName = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue('Col_6', 1)) + '\']'

println(readAccName)

TestObject dO5 = new TestObject(readAccName).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    readAccName, true)

WebUI.waitForElementVisible(dO5, 3)

String accName = WebUI.getText(dO5)

println(accName)

assert accName == findTestData('Req_Mod_Test Data').getValue('Acc_Name', 1)

WebUI.delay(3)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/form_submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/success_ok'))


