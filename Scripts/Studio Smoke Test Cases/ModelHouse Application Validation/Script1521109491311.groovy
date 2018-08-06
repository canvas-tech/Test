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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8082/ctmodelhouse/cacheReset.jsp')

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8082/ctmodelhouse/')

WebUI.setText(findTestObject('Model House Application/Page_Welcome to Canvas Technology/input_ctLoginID'), 'terrim')

WebUI.setText(findTestObject('Model House Application/Page_Welcome to Canvas Technology/input_loginPSW'), 'canvas')

WebUI.click(findTestObject('Model House Application/Page_Welcome to Canvas Technology/input_commit'))

if (WebUI.verifyElementText(findTestObject('Model House Application/Page_Canvas Technology/div_col-md-12 flaticon-default'), 
    'AUTO_WS_DESIGNER')) {
    WebUI.click(findTestObject('Model House Application/Page_Canvas Technology/div_col-md-12 flaticon-default' //	KeywordLogger log = new KeywordLogger()
            //	log.logInfo("Workspace is not displayed in the Modelhouse")
            ))
} else {
    println('Workspace is not displayed in the Modelhouse')
}

WebUI.verifyElementText(findTestObject('Model House Application/Page_Canvas Technology/div_clearfix'), 'AUTOMATION_CHART_VIEW01', 
    FailureHandling.CONTINUE_ON_FAILURE)

//if(WebUI.verifyTextPresent('ACCOUNT_TYPE', false) && WebUI.verifyTextPresent('AVAI_BALANCE', false))
//{
//	println('Chart data rendered correctly')
//}
WebUI.verifyElementText(findTestObject('Model House Application/Page_Canvas Technology/div_clearfix_1'), 'AUTOMATION_SHRTCUT_VIEW01', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Model House Application/Page_Canvas Technology/div_clearfix_2'), 'AUTOMATION_GRID_VIEW', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Model House Application/Page_Canvas Technology/div_clearfix_3'), 'AUTOMATION_FORMVIEW01', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

//WebUI.scrollToElement(findTestObject('Model House Application/Page_Canvas Technology/ScrollPage_toElement'), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToPosition(500, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Model House Application/Page_Canvas Technology/Logo icon'))

WebUI.delay(2)

WebUI.click(findTestObject('Model House Application/Page_Canvas Technology/PaymentWorkspace'))

WebUI.delay(2)

WebUI.click(findTestObject('Model House Application/Page_Canvas Technology/RequestModelerMenu'))

WebUI.delay(4)

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Username'), 'MUGUN')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Password'), 'TEST123')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Confirmpassword'), 'TEST123')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/AccountId'), 'TESTACC12345')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Namefield'), 'MUGUNTHAN')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Emailfield'), 'TEST@GMAIL.COM')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Phone'), '0987654321')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Gender'), 'MALE')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Address'), 'CHENNAI')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/zipcode'), '654321')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Country'), 'INDIA')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Bankname'), 'HDFC')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Branchname'), 'OMR')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/IfscCode'), 'OMR12345')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/AddNominee'), 'YES')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Nomineename'), 'TESTNOMINEE')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Nomineeminor'), 'NO')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Nomineerelationship'), 'FATHER')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Nomineeaddress'), 'CHENNAI')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/Nomineepancard'), 'PAN9876543')

WebUI.setText(findTestObject('Model House Application/Page_Canvas Technology/NomineeSSN'), 'FRR43RTY65EW')

WebUI.click(findTestObject('Model House Application/Page_Canvas Technology/InitSubmit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

//WebUI.scrollToElement(findTestObject('Model House Application/Page_Canvas Technology/ScrollPage_toElement'), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToPosition(500, 500)

WebUI.click(findTestObject('Model House Application/Page_Canvas Technology/InitSubmitConfirmation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Model House Application/Page_Canvas Technology/Confirmation OK button'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.closeBrowser()

