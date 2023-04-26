package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.joinsuperset.com/#/s/feed");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("patilbhavesh");
		driver.findElement(By.name("password")).sendKeys("1LHK81GI");
		driver.findElement(By.cssSelector("input[class='btn btn-primary btn-block']")).click();
		
		
	}

}
