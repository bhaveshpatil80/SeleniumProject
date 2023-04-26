package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'src')]")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@class,'selected') and (.='Pune')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("shahada");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@class,'selected') and (.='Shahada')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(@class,'wd day') and (.='15')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Search Buses']")).click();
	}

}
