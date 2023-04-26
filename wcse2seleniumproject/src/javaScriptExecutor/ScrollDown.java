package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for (int i=0;i<3;i++) 
		{
			
			//scroll down on the webpage
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,1000)");
		}
		
		for (int i=0;i<3;i++)
		{
			//scroll up on the webpage
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,-800)");

		
	}

}
}