package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhonepeLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phonepe.force.com/login");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("bhav45ve");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("besd148");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		
	}

}
