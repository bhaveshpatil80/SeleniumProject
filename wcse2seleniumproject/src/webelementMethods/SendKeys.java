package webelementMethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-jd3kil9/login.do");
		
		WebElement usernameTB= driver.findElement(By.name("username"));
		usernameTB.sendKeys("admin");
		WebElement passwordTB=driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager");
		WebElement loginButtton= driver.findElement(By.id("loginButton"));
		loginButtton.click();
}
}