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
import org.apache.poi.hssf.usermodel.HSSFCell as HSSFCell
import org.apache.poi.hssf.usermodel.HSSFRow as HSSFRow
import org.apache.poi.hssf.usermodel.HSSFSheet as HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook as HSSFWorkbook

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/expertctstudio')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginID'), 'CTSTUD1')

WebUI.setText(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_loginPSW'), 'TEST123')

WebUI.click(findTestObject('New_Test_Create_Form/Page_Expert CT Studio/input_commit'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/click_view_def'))

WebUI.waitForPageLoad(10)

String returnVal_View = delete(5)

println('View ' + returnVal_View)

WebUI.delay(5)

WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/click_app_def'))

WebUI.waitForPageLoad(10)

String returnVal_App = deleteApp(6)

println('App ' + returnVal_App)

WebUI.delay(3)

WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/click_WS_def'))

WebUI.waitForPageLoad(10)

String returnVal_WS = deleteWS()

println('WS ' + returnVal_WS)

String delete(int j) {
    String path = 'D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Grid_view_id.xls'

    FileInputStream fis = new FileInputStream(path)

    HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis)

    int sc = hssfWorkbook.getNumberOfSheets()

    println(sc)

    HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0)

    HSSFRow hssfRow = hssfSheet.getRow(1)

    for (int i = 0; i <= j; i++) {
        HSSFCell id = hssfRow.getCell(i)

        String selectForm = ('//span[contains(text(),\'' + String.valueOf(id)) + '\')]/preceding::td[2]/span/input[@data-item-id=\'ct_rowSelector\']'

        println(selectForm)

        TestObject dynamicObject = new TestObject(selectForm).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
            selectForm, true)

        WebUI.delay(5)

        boolean present = WebUI.verifyElementNotPresent(dynamicObject, 4, FailureHandling.CONTINUE_ON_FAILURE)

        if (String.valueOf(present) == 'false') {
            WebUI.click(dynamicObject)

            WebUI.delay(3)

            WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/delete_view_button'))

            WebUI.delay(4)

            WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/dialogbx'))

            WebUI.delay(3)

            WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/deleted_ok'))

            println('DELETED')
        } else {
            println('No View exist')
        }
    }
    
    return 'done'
}

String deleteApp(int j) {
    String path = 'D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Grid_view_id.xls'

    FileInputStream fis = new FileInputStream(path)

    HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis)

    int sc = hssfWorkbook.getNumberOfSheets()

    println(sc)

    HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0)

    HSSFRow hssfRow = hssfSheet.getRow(1)

    for (int i = 0; i <= j; i++) {
        HSSFCell id = hssfRow.getCell(i)

        String selectForm = ('(//span[contains(text(),\'' + String.valueOf(id)) + '\')])[1]'

        println(selectForm)

        TestObject dynamicObject = new TestObject(selectForm).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
            selectForm, true)

        WebUI.delay(5)

        boolean present = WebUI.verifyElementNotPresent(dynamicObject, 4, FailureHandling.CONTINUE_ON_FAILURE)

        if (String.valueOf(present) == 'false') {
            WebUI.rightClick(dynamicObject)

            WebUI.delay(3)

            WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/delete_app'))

            WebUI.delay(4)

            WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/dialogbx'))

            WebUI.delay(3)

            WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/deleted_ok'))

            println('DELETED')
        } else {
            println('No View exist')
        }
    }
    
    return 'done'
}

String deleteWS() {
    String path = 'D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Grid_view_id.xls'

    FileInputStream fis = new FileInputStream(path)

    HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis)

    int sc = hssfWorkbook.getNumberOfSheets()

    println(sc)

    HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0)

    HSSFRow hssfRow = hssfSheet.getRow(1)

    HSSFCell id = hssfRow.getCell(6)

    String selectWS = ('//span[contains(text(),\'' + id) + '\')]'

    println(selectWS)

    TestObject ws = new TestObject(selectWS).addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, 
        selectWS, true)

    WebUI.delay(3)

    boolean present = WebUI.verifyElementNotPresent(ws, 4, FailureHandling.CONTINUE_ON_FAILURE)

    if (String.valueOf(present) == 'false') {
        WebUI.rightClick(ws)

        WebUI.delay(3)

        WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/delete_ws'))

        WebUI.delay(3)

        WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/delete_confirm'))

        WebUI.delay(4)

        WebUI.click(findTestObject('New_Test_Create_List_Grid/Page_Canvas World/deleted_ok'))

        println('DELETED')
    } else {
        println('No WS exist')
    }
    
    return 'done'
}

