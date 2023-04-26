package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dmart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=dmartF-");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[(@class='gLFyf') and (@name='q')]")).sendKeys("dmart login");
		driver.findElement(By.xpath("//button[@class='Tg7LZd']"));
		driver.findElement(By.xpath("//h3[(@class='LC20lb MBeuO DKV0Md') and (.='DMart Ready')]")).click();
	
	}

}
