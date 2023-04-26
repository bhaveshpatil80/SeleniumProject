package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skye {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rentcafe.com/onlineleasing/skye-at-arbor-lakes/guestlogin.aspx");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='Username']")).sendKeys("bhave@mail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("wret124/;");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	}
	

}
