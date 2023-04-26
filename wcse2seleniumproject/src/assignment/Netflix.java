package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("6487120354");
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[id='id_password']")).sendKeys("bkrdfsh4782");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	}

}
