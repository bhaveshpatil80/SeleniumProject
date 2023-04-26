package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swizzy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/auth");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='mobile']")).sendKeys("8794561203");
		driver.findElement(By.cssSelector("button[class='_1vTVI _2UPEv']")).click();

}
}
