package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		WebElement usernameTB= driver.findElement(By.xpath("//input[@name='username']"));
		usernameTB.sendKeys("patilbhavesh698@gmail.com");
		
		WebElement passwordTB=driver.findElement(By.xpath("//input[@name='password']"));
		passwordTB.sendKeys("8007011949");
		
		Thread.sleep(5000);
		usernameTB.clear();
		Thread.sleep(5000);
		passwordTB.clear();
		
		
		
		

}
}
