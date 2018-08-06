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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.interactions.Actions as Actions

int menu = generateRandomInt(999999999)

String menuId = 'M' + String.valueOf(menu)

println(menuId)

String submenuId = 'SM' + String.valueOf(menu)

println(submenuId)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/expertctstudio/')

Thread.sleep(3000)

WebUI.setText(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_commit'))

WebUI.delay(3)

WebUI.click(findTestObject('New_WS_Designer/click_WS_Designer'))

WebUI.delay(3)

String appDel = delete()

println('Delete ' + appDel)

WebUI.delay(5)

WebUI.click(findTestObject('New_WS_Designer/add_WS'))

WebUI.delay(5)

WebUI.setText(findTestObject('New_WS_Designer/WS_Title'), findTestData('Database').getValue('WS_id', 3))

WebUI.delay(2)

WebUI.setText(findTestObject('New_WS_Designer/WS_bundle'), findTestData('Database').getValue('bundle_key', 3))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('New_WS_Designer/WS_id'), findTestData('Database').getValue('WS_id', 3))

not_run: WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/select_prdt'), 5)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/select_subPrdt'), 1)

WebUI.delay(3)

WebUI.delay(2)

WebUI.click(findTestObject('New_WS_Designer/proceed_button'))

WebUI.delay(3)

WebUI.click(findTestObject('New_WS_Designer/add_subws'))

WebUI.delay(2)

WebUI.setText(findTestObject('New_WS_Designer/enter_subws_name'), findTestData('Database').getValue('Sub_WS_id', 3))

WebUI.delay(2)

not_run: WebUI.setText(findTestObject('New_WS_Designer/subws_id'), findTestData('Database').getValue('Sub_WS_id', 3))

not_run: WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/subws_prdt'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('New_WS_Designer/proceed_button'))

WebUI.delay(3)

WebUI.click(findTestObject('New_WS_Designer/add_app'))

String addApp = '//label[@data-widget-id=\'AUTO_APP\']'

println(addApp)

TestObject dynamicObject = new TestObject(addApp).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    addApp, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.click(dynamicObject)

WebUI.delay(1)

WebUI.click(findTestObject('New_WS_Designer/addApp_submitButton'))

WebUI.delay(1)

WebUI.click(findTestObject('New_WS_Designer/button_WS_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('New_WS_Designer/add_LMenu'))

WebUI.delay(3)

WebUI.setText(findTestObject('New_WS_Designer/LMenu_name'), findTestData('Database').getValue('Lmenu_name', 3))

WebUI.delay(2)

WebUI.setText(findTestObject('New_WS_Designer/LMenu_id'), menuId)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/LMenu_prdt'), 5)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/LMenu_subPrdt'), 1)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/LMenu_funcCode'), 4)

WebUI.delay(1)

WebUI.click(findTestObject('New_WS_Designer/LMenu-create'))

WebUI.delay(1)

WebUI.click(findTestObject('New_WS_Designer/add_subMenu'))

WebUI.delay(1)

WebUI.setText(findTestObject('New_WS_Designer/LMenu_name'), findTestData('Database').getValue('Lmenu_Sub_name', 3))

WebUI.delay(2)

WebUI.setText(findTestObject('New_WS_Designer/LMenu_id'), submenuId)

WebUI.delay(5)

boolean flag = true

int i = 0

while ((String.valueOf(flag) == 'true') && (i <= 5)) {
    boolean appShortcut = WebUI.verifyElementVisible(findTestObject('New_WS_Designer/appshortcut_on'))

    println(appShortcut)

    if (String.valueOf(appShortcut) == 'true') {
        flag = false
    }
    
    i++
}

WebUI.click(findTestObject('New_WS_Designer/appshortcut_on'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/select_appSC'), 1)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('New_WS_Designer/LMenu_funcCode'), 4)

WebUI.delay(2)

WebUI.click(findTestObject('New_WS_Designer/LMenu-create'))

WebUI.delay(5)

WebUI.click(findTestObject('New_WS_Designer/LMenu_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('New_WS_Designer/WS_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('New_WS_Designer/click_ok'))

WebUI.delay(5)

WebUI.click(findTestObject('New_WS_Designer/close_WS'))

WebUI.delay(2)

int generateRandomInt(int upperRange) {
    Random random = new Random()

    return random.nextInt(upperRange)
}

String delete() {
    String selectconn = '(//div[contains(text(),\'AUTO_WS\')])[1]'

    println(selectconn)

    TestObject dynamicObject = new TestObject(selectconn).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        selectconn, true)

    WebUI.delay(6)

    boolean present = WebUI.verifyElementNotPresent(dynamicObject, 4, FailureHandling.CONTINUE_ON_FAILURE)

    if (String.valueOf(present) == 'false') {
        WebUI.click(dynamicObject)

        WebUI.delay(3)

        WebUI.click(findTestObject('New_WS_Designer/delete_WS'))

        WebUI.delay(4)

        WebUI.click(findTestObject('New_DataSource/click_ok'))

        WebUI.delay(3)

        WebUI.click(findTestObject('New_WS_Designer/delete_confirm'))

        WebUI.delay(4)

        WebUI.click(findTestObject('New_DataSource/click_ok'))

        println('DELETED')
    } else {
        println('No View exist')
    }
    
    return 'done'
}

