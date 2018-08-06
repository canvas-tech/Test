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


//InputStream is = new FileInputStream("D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Data Input.xls");
String path="D:\\Sheepa\\Katalon\\Studio Smoke Test\\Studio Smoke Test\\Data Files\\Data Input.xls";
FileInputStream fis=new FileInputStream(path);
HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fis);
int sc = hssfWorkbook.getNumberOfSheets();
println sc;
HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
HSSFRow hssfRow = hssfSheet.getRow(1);
HSSFCell fid = hssfRow.getCell(0);
HSSFCell vid = hssfRow.getCell(1);
HSSFCell aid = hssfRow.getCell(2);
HSSFCell subid = hssfRow.getCell(3);
HSSFCell wsid = hssfRow.getCell(4);
HSSFCell reqid = hssfRow.getCell(5);
HSSFCell accNo = hssfRow.getCell(6);

println vid

Map map = [:]
map.put('formID',fid)
map.put('viewID',vid)
map.put('appID',aid)
map.put('subWSID',subid)
map.put('WSID',wsid)
map.put('REQID',reqid)
map.put('AccNo',accNo)
return map

