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

String view_id = common['viewID']

println(view_id)

'Opening the Browser.'
WebUI.openBrowser('')

'Maximize the browser.'
WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.19.29.253:8082/ctmodelhouse/cacheReset.jsp')

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

String selectWS = ('//div[contains(text(),\'' + ws_id) + '\')]'

println(selectWS)

TestObject dynamicObject = new TestObject(selectWS).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectWS, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.click(dynamicObject)

WebUI.waitForPageLoad(10)

String selectview = ('//h3[contains(text(),\'' + view_id) + '\')]'

println(selectview)

TestObject dynamicObject1 = new TestObject(selectview).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    selectview, true)

WebUI.waitForElementVisible(dynamicObject1, 3)

String viewHeader = WebUI.getText(dynamicObject1)

println(viewHeader)

assert viewHeader == view_id

WebUI.delay(5)

WebUI.takeScreenshot('D:\\Sheepa\\Katalon\\screenshot.png')

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'))

WebUI.setText(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'), findTestData('MH_Test Data').getValue(
        'Text_NegativeMin', 1))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

boolean errormsg = WebUI.verifyElementPresent(findTestObject('Model House Form App Test/Page_Canvas World/min_error_msg'), 
    5)

println(errormsg)

assert String.valueOf(errormsg) == 'true'

String errormsg_text = WebUI.getAttribute(findTestObject('Model House Form App Test/Page_Canvas World/min_error_msg'), 'data-original-title')

println(errormsg_text)

assert errormsg_text == (('A minimum of 6 characters is required for ' + findTestData('Test Data').getValue('Text_Label', 
    1)) + '.')

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'))

WebUI.setText(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'), findTestData('MH_Test Data').getValue(
        'Text_NegativeMax', 1))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

boolean errormsgMax = WebUI.verifyElementPresent(findTestObject('Model House Form App Test/Page_Canvas World/max_error_msg'), 
    5)

println(errormsgMax)

assert String.valueOf(errormsgMax) == 'true'

String errormsgMax_text = WebUI.getAttribute(findTestObject('Model House Form App Test/Page_Canvas World/max_error_msg'), 
    'data-original-title')

println(errormsgMax_text)

assert errormsgMax_text == (findTestData('Test Data').getValue('Text_Label', 1) + ' must not be greater than 12 characters.')

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'))

WebUI.setText(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'), findTestData('MH_Test Data').getValue(
        'Text_Min', 1))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

boolean errormsgmin = WebUI.verifyElementNotPresent(findTestObject('Model House Form App Test/Page_Canvas World/min_error_msg'), 
    3)

println(errormsgmin)

assert String.valueOf(errormsgmin) == 'true'

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'))

WebUI.setText(findTestObject('Model House Form App Test/Page_Canvas World/text_field_Click'), findTestData('MH_Test Data').getValue(
        'Text_Max', 1))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

boolean noerrormsg = WebUI.verifyElementNotPresent(findTestObject('Model House Form App Test/Page_Canvas World/max_error_msg'), 
    3)

println(noerrormsg)

assert String.valueOf(noerrormsg) == 'true'

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

WebUI.setText(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'), 'This field is editable_alphanumeric validation878785')

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/password_area_click'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

boolean mandateField = WebUI.verifyElementPresent(findTestObject('Model House Form App Test/Page_Canvas World/password_field_error'), 
    5)

println(mandateField)

assert String.valueOf(mandateField) == 'true'

String mandateField_text = WebUI.getAttribute(findTestObject('Model House Form App Test/Page_Canvas World/password_field_error'), 
    'data-original-title')

println(mandateField_text)

assert mandateField_text == 'Please enter the password.'

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/password_area_click'))

WebUI.setText(findTestObject('Model House Form App Test/Page_Canvas World/password_area_click'), findTestData('MH_Test Data').getValue(
        'Password_text', 1))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/text_area_click'))

boolean noPasserror = WebUI.verifyElementNotPresent(findTestObject('Model House Form App Test/Page_Canvas World/password_field_error'), 
    3)

println(noPasserror)

assert String.valueOf(noPasserror) == 'true'

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/checkBox_click'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/chkbxGrp_value1'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/chkbxGrp_value2'))

WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/radioGrp_val1'))

WebUI.selectOptionByValue(findTestObject('Model House Form App Test/Page_Canvas World/combo_select'), 'Ok', false)

WebUI.getText(findTestObject('Model House Form App Test/Page_Canvas World/title_value'))

not_run: WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/date_field'))

WebUI.setText(findTestObject('Model House Form App Test/Page_Canvas World/date_field'), '12/30/2020')

WebUI.getText(findTestObject('Model House Form App Test/Page_Canvas World/label_text'))

//WebUI.click(findTestObject('Model House Form App Test/Page_Canvas World/submit_button'))
not_run: WebUI.closeBrowser()

