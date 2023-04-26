package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeInValidTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-jd3kil9/login.do");
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/Actitime.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidusername = flib.ReadExcelData("./data/Actitime.xlsx","invalidcreds",i,0);
			String invalidpassword = flib.ReadExcelData("./data/Actitime.xlsx","invalidcreds",i,1);
			
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
		driver.close();
		}
}
