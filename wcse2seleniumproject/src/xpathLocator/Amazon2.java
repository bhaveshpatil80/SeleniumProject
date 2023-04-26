package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[(@class='a-size-base a-color-base') and (.='HP')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[(@class='a-size-base a-color-base') and (.='₹30,000 – ₹40,000')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='2.00 to 2.49 GHz']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[(.='25% Off or more') and (@class='a-size-base a-color-base')]")).click();

	}

}
