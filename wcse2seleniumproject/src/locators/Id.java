package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/Textbox%20username.HTML");
		driver.findElement(By.tagName("input")).sendKeys("manager");
		Thread.sleep(3000);
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/password.html");
		Thread.sleep(3000);
		driver.findElement(By.id("i1")).sendKeys("admin");
		
	}

}
