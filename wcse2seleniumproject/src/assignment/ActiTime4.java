package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("http://desktop-jd3kil9/login.do");
		
		WebElement usernameTB= driver.findElement(By.xpath("//input[@name='username']"));
		usernameTB.sendKeys("admin");
		
		WebElement passwordTB= driver.findElement(By.xpath("//input[@name='pwd']"));
		passwordTB.sendKeys("manager");
		
		Thread.sleep(2000);
		usernameTB.clear();
		Thread.sleep(2000);
		passwordTB.clear();
		
	}

}
