package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shine {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("bhavesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_email')]")).sendKeys("bhavesh@145");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("bhacvesg47@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn mb-3 align-self-end w-80 right-90')]")).click();
	}

}
