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

Thread.sleep(3000)

/*String folder = 'D:\\Sheepa\\AutoIt\\'
 String exe = 'KAuth.exe'
 // Create and start Process with ProcessBuilder.
 ProcessBuilder p = new ProcessBuilder('cmd.exe', '/C', 'start')
 p.command(folder + exe)
 p.start()
 Thread.sleep(2000)*/
//Runtime.getRuntime().exec("D:\\Sheepa\\AutoIt\\KTube.exe");
//WebUI.refresh();
//WebUI.navigateToUrl('http://172.19.29.253:8082/expertctstudio/')
WebUI.setText(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('DB_Connectio/Page_Canvas World/Page_Expert CT Studio/input_commit'))

String returnVal_View = delete()

println('View ' + returnVal_View)

WebUI.delay(5)

WebUI.click(findTestObject('DB_Connectio/Page_Canvas World/span_Connection'))

WebUI.click(findTestObject('DB_Connectio/Page_Canvas World/span_Create_Connection'))

WebUI.delay(5)

WebUI.setText(findTestObject('DB_Connectio/Page_Canvas World/input_CONNECTION_NAME'), findTestData('Database').getValue(
        'Connection_Name', 3))

WebUI.click(findTestObject('New_DataSource/click_webservice'))

WebUI.delay(3)

WebUI.setText(findTestObject('New_DataSource/enter_domain_name'), findTestData('Database').getValue('domain_name', 3))

WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('New_DataSource/select_auth_type'), findTestData('Database').getValue(
        'auth_type', 3), false)

not_run: WebUI.delay(3)

WebUI.click(findTestObject('New_DataSource/click_save'))

WebUI.delay(3)

WebUI.click(findTestObject('New_DataSource/click_ok'))

WebUI.delay(3)

String dataSource = ('(//span[contains(text(),\'' + findTestData('Database').getValue('Connection_Name', 3)) + '\')])[1]'

println(dataSource)

TestObject dynamicObject = new TestObject(dataSource).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
    dataSource, true)

WebUI.waitForElementVisible(dynamicObject, 3)

WebUI.rightClick(dynamicObject)

WebUI.click(findTestObject('New_DataSource/manage_datasource'))

WebUI.delay(2)

WebUI.click(findTestObject('New_DataSource/create_datasource'))

WebUI.delay(2)

WebUI.setText(findTestObject('New_DataSource/enter_datasource_name'), findTestData('Database').getValue('datasource', 
        3))

WebUI.setText(findTestObject('New_DataSource/enter_table_name'), findTestData('Database').getValue('table_name', 3))

WebUI.delay(2)

not_run: WebUI.selectOptionByValue(findTestObject('New_DataSource/select_appID_reqType'), findTestData('Database').getValue(
        'Comm_appID', 3), false)

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('New_DataSource/enter_root'), findTestData('Database').getValue('Col_Root', 3))

WebUI.delay(2)

int j = 3

for (int i = 1; i <= 3; i++) {
    String jsonDetail = ('(//input[@id=\'DS_COL_MAP_MULTIFORM-WS_COLUMN_EXPRESSION\'])[' + i) + ']'

    println(jsonDetail)

    TestObject dynamicObject2 = new TestObject(jsonDetail).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        jsonDetail, true)

    WebUI.waitForElementVisible(dynamicObject2, 3)

    WebUI.setText(dynamicObject2, findTestData('Database').getValue('Json_val', j))

    String jsonVal = ('(//input[@id=\'DS_COL_MAP_MULTIFORM-WS_COLUMN_ID\'])[' + i) + ']'

    println(jsonVal)

    TestObject dynamicObject1 = new TestObject(jsonVal).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        jsonVal, true)

    WebUI.waitForElementVisible(dynamicObject1, 3)

    WebUI.setText(dynamicObject1, findTestData('Database').getValue('Json_val', j))

    WebUI.delay(2)


    WebUI.click(findTestObject('New_DataSource/add_button'))

    j++
}

WebUI.delay(5)

WebUI.click(findTestObject('New_DataSource/click_save'))

WebUI.delay(5)

WebUI.click(findTestObject('New_DataSource/click_ok'))

WebUI.delay(5)

WebUI.click(findTestObject('New_DataSource/close_button'))

String delete() {
    String selectconn = ('(//span[contains(text(),\'' + findTestData('Database').getValue('Connection_Name', 3)) + '\')])[1]'

    println(selectconn)

    TestObject dynamicObject = new TestObject(selectconn).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        selectconn, true)

    WebUI.delay(8)

    boolean present = WebUI.verifyElementPresent(dynamicObject, 4, FailureHandling.CONTINUE_ON_FAILURE)

    if (String.valueOf(present) == 'true') {
        WebUI.rightClick(dynamicObject)

        WebUI.delay(3)

        WebUI.click(findTestObject('New_DataSource/delete_connection'))

        WebUI.delay(4)

        WebUI.click(findTestObject('New_DataSource/click_yes'))

        WebUI.delay(3)

        WebUI.click(findTestObject('New_DataSource/click_ok'))

        println('DELETED')
    } else {
        println('No View exist')
    }
    
    return 'done'
}

