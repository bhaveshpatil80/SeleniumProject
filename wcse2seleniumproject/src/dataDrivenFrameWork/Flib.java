package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//To Store Generic Reuseable Methods
	
	public String ReadExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException 
	
	{
			FileInputStream fis = new FileInputStream(excelPath);//Provide the path of file
			Workbook wb = WorkbookFactory.create(fis);//Make the file Ready for Read
			Sheet sheet = wb.getSheet(sheetName);//Get Into Sheet
			Row row = sheet.getRow(rowCount);//Get The Desired Row
			Cell cell = row.getCell(cellCount);//Get the desired Cell/Column
		    String data = cell.getStringCellValue();//Read the data from Cell
			return data;
	}
	
	//to get row count
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	//To Write data in Excel sheet
	
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,int data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		
	}
	
}
