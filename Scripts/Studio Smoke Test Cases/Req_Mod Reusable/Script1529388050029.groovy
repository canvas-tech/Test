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
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public int generateRandomInt(int upperRange){

	Random random = new Random();
	return random.nextInt(upperRange);
}


int digi = generateRandomInt(9999999);




String req_id = 'AR'+digi
println req_id;


String filePath = "D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Data Input.xls" ;
File file=new File(filePath);
FileInputStream fis=new FileInputStream(file);
FileOutputStream fileOut = new FileOutputStream(filePath);

HSSFWorkbook workbook = new HSSFWorkbook();
HSSFSheet st = workbook.createSheet("POI Worksheet");
HSSFRow row = st.createRow(0);
HSSFCell cell5= row.createCell(0);
cell5.setCellValue("ReqMod_id");


HSSFRow row1 = st.createRow(1);
HSSFCell cell51= row1.createCell(4);
cell51.setCellValue(req_id);

workbook.write(fileOut);


Map map = [:]

map.put('REQID',row1.getCell(5))
fileOut.flush();
fileOut.close();
return map








