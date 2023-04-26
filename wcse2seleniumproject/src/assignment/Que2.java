package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Que2 {
	
	//Close All the Browser Without the Quit Method
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.navigate().to("http://omayo.blogspot.com/");
			
			driver.findElement(By.linkText("Open a popup window")).click();
			Thread.sleep(2000);
			
			Set<String> allHandle = driver.getWindowHandles();
			
			for(String wh:allHandle)
			{
				driver.switchTo().window(wh).close();
				Thread.sleep(2000);
			}
	}
}
