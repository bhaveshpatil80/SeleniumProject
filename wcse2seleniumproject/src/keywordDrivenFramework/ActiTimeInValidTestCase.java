package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInValidTestCase extends BaseTest{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"Invalidcreds");
		
		for(int i=1;i<=rc;i++) {
			
			String invalidusn = flib.readExcelData(EXCEL_PATH,"Invalidcreds",i,0);
			String invalidpass = flib.readExcelData(EXCEL_PATH,"Invalidcreds",i,1);
			
			driver.findElement(By.name("username")).sendKeys(invalidusn);
			driver.findElement(By.name("pwd")).sendKeys(invalidpass);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		
			}
		bt.tearDown();
		}
}