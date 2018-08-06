import java.sql.DriverManager as DriverManager
import java.sql.ResultSet as ResultSet
import java.sql.Statement as Statement
import java.sql.Connection as Connection
import java.sql.PreparedStatement as PreparedStatement
import java.sql.Driver as Driver
import com.kms.katalon.core.annotation.Keyword as Keyword
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

/*def r =CustomKeywords.'mySqlConnection.executingQuery.connection'('jdbc:mysql://localhost:3306/model_8043', 'ctuser', 'canvas', 
    'com.mysql.jdbc.Driver')
println r*/

CustomKeywords.'mySqlConnection.update_query.connection'('jdbc:mysql://localhost:3306/model_8043', 'ctuser', 'canvas',
	'com.mysql.jdbc.Driver',"update ct_json_config set JSON_STRING='{\"FORM\":{\"orientation\":\"top\",\"stepClick\":\"true\", \"backNav\": \"true\", \"forwardNav\": \"true\"}}' where CONFIG_ID='AR4284781_FORM'")
