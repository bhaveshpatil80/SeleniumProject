package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FivePaisa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.5paisa.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='loginUser']")).sendKeys("12487523");
		driver.findElement(By.cssSelector("button[id='btnGenerateOTP']")).click();
	}
}
