package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[(@class='_2gmUFU _3V8rao') and (.='Brand')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[(@class='_3879cV') and (.='HP')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[(.='Operating System') and (@class='_2gmUFU _3V8rao')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[(@class='_3879cV') and (.='Windows 10')]")).click();
		Thread.sleep(2000);
		
		String price=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[17]")).getText();
		System.out.println(price);
		String priceoflaptop=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[5]")).getText();
		System.out.println(priceoflaptop);
		
		driver.quit();
	}

}
