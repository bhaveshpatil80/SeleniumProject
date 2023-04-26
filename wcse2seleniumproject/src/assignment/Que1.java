package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Que1 {
	
	//Close All the Browser
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("http://omayo.blogspot.com/");
		
		String parenthandle = driver.getWindowHandle();
		System.out.println("this the add of parentwindow:"+parenthandle);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		driver.quit();
		}
}