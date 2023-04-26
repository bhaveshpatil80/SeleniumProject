package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/login");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("2458732014");
	    driver.findElement(By.cssSelector("button[class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']")).click();
}
}
	    