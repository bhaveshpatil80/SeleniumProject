package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingleExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// To Read a Single Data From Excel Sheet
		
		FileInputStream fis = new FileInputStream("./data/IPL.xlsx");//Provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//Make the file Ready for Read
		Sheet sheet = wb.getSheet("IPL");//Get Into Sheet
		Row row = sheet.getRow(4);//Get The Desired Row
		Cell cell = row.getCell(0);//Get the desired Cell/Column
		String data = cell.getStringCellValue();//Read the data from Cell
		
		System.out.println(data);//Print the Data
		
	}
}
