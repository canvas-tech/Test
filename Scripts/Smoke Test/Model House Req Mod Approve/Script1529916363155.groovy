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

WebUI.navigateToUrl(findTestData('MH_Test Data').getValue('URL', 1))

WebUI.closeBrowser()

WebUI.openBrowser('')

'Maximize the browser.'
WebUI.maximizeWindow()

'Verifiy that user able to launch Application.'
WebUI.navigateToUrl(findTestData('MH_Test Data').getValue('URL', 1))

WebUI.waitForPageLoad(10)

'Verify that user able to enter the user name.'
WebUI.setText(findTestObject('Model House Login/Page_Model House/input_loginID'), findTestData('MH_Test Data').getValue(
        'Approve_UN', 1))

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

WebUI.delay(15)

WebUI.scrollToElement(findTestObject('Model House RM Test/Page_Canvas World/click_pending'), 5)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/click_pending'))

WebUI.delay(5)


String listAcc = ('//h4[contains(text(),\'' + acc_No) + '\')]'

println(listAcc)

TestObject selectList = new TestObject(listAcc).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    listAcc, true)

WebUI.waitForElementVisible(selectList, 3)
WebUI.scrollToElement(selectList, 3)

WebUI.mouseOver(selectList)

WebUI.delay(3)

String approve = ('(//h4[contains(text(),\'' + acc_No) + '\')]/following::div[@class=\'pull-right buttons-action\'])[1]'

TestObject appButton = new TestObject(approve).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    approve, true)

WebUI.waitForElementVisible(appButton, 3)

boolean rmApprove = WebUI.verifyElementPresent(appButton, 5)

println(rmApprove)

WebUI.mouseOver(appButton)

String approveButton = ('(//h4[contains(text(),\'' + acc_No) + '\')]/following::div[@class=\'pull-right buttons-action\'])[1]/button'

TestObject authButton = new TestObject(approveButton).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    approveButton, true)

WebUI.waitForElementVisible(authButton, 3)

boolean auth = WebUI.verifyElementPresent(authButton, 5)

println(auth)

WebUI.click(authButton)

WebUI.delay(6)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/approve_button'))

WebUI.delay(3)

WebUI.setText(findTestObject('Model House RM Test/Page_Canvas World/approve_comments'), 'Approved')

WebUI.delay(3)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/approve_submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/approve_ok'))

