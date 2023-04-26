package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[name='inputEmail']")).sendKeys("bhaesh@gmail.com");
	    driver.findElement(By.cssSelector("input[id='inputPassword']")).sendKeys("bha123@");
	    driver.findElement(By.cssSelector("input[id='submitLogin']")).click();
}

}
