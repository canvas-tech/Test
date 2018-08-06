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

public static int generateRandomIntRange(int min, int max) {
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
}

int digi = generateRandomInt(9999999);
int acc = generateRandomInt(999999999);


String accNo = String.valueOf(acc);
println accNo;

String form_id = 'F' +digi;
println form_id;

//String digits = form_id.replaceAll("[^0-9?!\\.]","");

String view_id = 'AV'+digi
println view_id;

String app_id = 'AA'+digi
println app_id;

String subWS_id = 'ASUB'+digi
println subWS_id;

String WS_id = 'AWS'+digi
println WS_id;

String req_id = 'AR'+digi
println req_id;


/*Expected_Label_Array= [form_id, view_id, app_id, subWS_id,WS_id]
println Expected_Label_Array.get(0)*/


/*try{
	File file = new File("D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Data Input.xls");
	if(file.delete()){

		System.out.println(file.getName() + " is deleted!");

	}
	else{
		System.out.println("Delete operation is failed.");
	}

}catch(Exception e){

	e.printStackTrace();

}*/

String filePath = "D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Data Input.xls" ;
File file=new File(filePath);
FileInputStream fis=new FileInputStream(file);
FileOutputStream fileOut = new FileOutputStream(filePath);

HSSFWorkbook workbook = new HSSFWorkbook();
HSSFSheet st = workbook.createSheet("POI Worksheet");
HSSFRow row = st.createRow(0);
HSSFCell cell0= row.createCell(0);
cell0.setCellValue("FormID");
HSSFCell cell1= row.createCell(1);
cell1.setCellValue("ViewID");
HSSFCell cell2= row.createCell(2);
cell2.setCellValue("AppID");
HSSFCell cell3= row.createCell(3);
cell3.setCellValue("SubWSID");
HSSFCell cell4= row.createCell(4);
cell4.setCellValue("WSID");
HSSFCell cell5= row.createCell(5);
cell5.setCellValue("ReqMod_id");
HSSFCell cell6= row.createCell(6);
cell6.setCellValue("Acc_No");

HSSFRow row1 = st.createRow(1);
HSSFCell cell01= row1.createCell(0);
cell01.setCellValue(form_id);
HSSFCell cell11= row1.createCell(1);
cell11.setCellValue(view_id);
HSSFCell cell21= row1.createCell(2);
cell21.setCellValue(app_id);
HSSFCell cell31= row1.createCell(3);
cell31.setCellValue(subWS_id);
HSSFCell cell41= row1.createCell(4);
cell41.setCellValue(WS_id);
HSSFCell cell51= row1.createCell(5);
cell51.setCellValue(req_id);
HSSFCell cell61= row1.createCell(6);
cell61.setCellValue(accNo);

workbook.write(fileOut);

String f_id =row1.getCell(0);
println f_id

Map Map_TC1 = [:]
Map_TC1.put('formID',f_id)
Map_TC1.put('viewID',row1.getCell(1))
Map_TC1.put('appID',row1.getCell(2))
Map_TC1.put('subWSID',row1.getCell(3))
Map_TC1.put('WSID',row1.getCell(4))
Map_TC1.put('REQID',row1.getCell(5))
Map_TC1.put('AccNo',row1.getCell(6))
fileOut.flush();
fileOut.close();
return Map_TC1



//test




