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

WebUI.setText(findTestObject('Model House RM Demo/Page_Canvas World/acc_Id'), acc_No)

for (int i = 17; i <= 19; i++) {
    String enterVal = ('//input[@name=\'' + findTestData('Req_Mod_Test Data').getValue(i, 2).trim()) + '\']'

    println(enterVal)

    TestObject val = new TestObject(enterVal).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        enterVal, true)

    WebUI.waitForElementVisible(val, 3)

    String dataVal = findTestData('Req_Mod_Test Data').getValue(i, 3)

    println(dataVal)

    WebUI.setText(val, findTestData('Req_Mod_Test Data').getValue(i, 3))

    WebUI.delay(1)
}

WebUI.delay(1)

WebUI.click(findTestObject('Req_Mod_Demo/mod_next'))

WebUI.delay(1)

for (int i = 20; i <= 26; i++) {
	String enterVal = ('//input[@name=\'' + findTestData('Req_Mod_Test Data').getValue(i, 2).trim()) + '\']'

	println(enterVal)

	TestObject val = new TestObject(enterVal).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		enterVal, true)

	WebUI.waitForElementVisible(val, 3)

	String dataVal = findTestData('Req_Mod_Test Data').getValue(i, 3)

	println(dataVal)

	WebUI.setText(val, findTestData('Req_Mod_Test Data').getValue(i, 3))

	WebUI.delay(1)
}

WebUI.delay(1)

WebUI.click(findTestObject('Req_Mod_Demo/mod_next'))

WebUI.delay(1)

for (int i = 27; i <= 36; i++) {
	String enterVal = ('//input[@name=\'' + findTestData('Req_Mod_Test Data').getValue(i, 2).trim()) + '\']'

	println(enterVal)

	TestObject val = new TestObject(enterVal).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		enterVal, true)

	WebUI.waitForElementVisible(val, 3)

	String dataVal = findTestData('Req_Mod_Test Data').getValue(i, 3)

	println(dataVal)

	WebUI.setText(val, findTestData('Req_Mod_Test Data').getValue(i, 3))

	WebUI.delay(1)
}

WebUI.delay(3)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/click_submit'))

WebUI.delay(3)

String readAccNo = '//span[@name=\'ACCOUNT_ID\']'

println(readAccNo)

TestObject dO = new TestObject(readAccNo).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, readAccNo, 
    true)

WebUI.waitForElementVisible(dO, 3)

String accNo = WebUI.getText(dO)

println(accNo)

assert accNo == acc_No

WebUI.delay(2)

for (int i = 17; i <= 19; i++) {
    String readStatus = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue(i, 2).trim()) + '\']'

    println(readStatus)

    TestObject getVal = new TestObject(readStatus).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        readStatus, true)

    WebUI.waitForElementVisible(getVal, 3)

    String value = WebUI.getText(getVal)

    println(value)

    assert value == findTestData('Req_Mod_Test Data').getValue(i, 3)

    WebUI.delay(1)
}

WebUI.delay(1)

WebUI.click(findTestObject('Req_Mod_Demo/mod_next'))

WebUI.delay(1)

for (int i = 20; i <= 26; i++) {
	String readStatus = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue(i, 2).trim()) + '\']'

	println(readStatus)

	TestObject getVal = new TestObject(readStatus).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		readStatus, true)

	WebUI.waitForElementVisible(getVal, 3)

	String value = WebUI.getText(getVal)

	println(value)

	assert value == findTestData('Req_Mod_Test Data').getValue(i, 3)

	WebUI.delay(1)
}

WebUI.delay(1)

WebUI.click(findTestObject('Req_Mod_Demo/mod_next'))

WebUI.delay(1)

for (int i = 27; i <= 36; i++) {
	String readStatus = ('//span[@name=\'' + findTestData('Req_Mod_Test Data').getValue(i, 2).trim()) + '\']'

	println(readStatus)

	TestObject getVal = new TestObject(readStatus).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS,
		readStatus, true)

	WebUI.waitForElementVisible(getVal, 3)

	String value = WebUI.getText(getVal)

	println(value)

	assert value == findTestData('Req_Mod_Test Data').getValue(i, 3)

	WebUI.delay(1)
}

WebUI.delay(2)

WebUI.click(findTestObject('Model House RM Demo/Page_Canvas World/validation_submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Model House RM Test/Page_Canvas World/success_ok'))

