package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ')]")).sendKeys("pune");   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='PUNE JN - PUNE')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ')]")).sendKeys("ahmedabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c57-9 ng-star-inserted') and (.='AHMEDABAD JN - ADI')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='13']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='AC First Class (1A) ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-12 ')]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Flexible With Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='search_btn']")).click();
		
	}

}
