package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/checkbox.html");
		driver.findElement(By.name("n4")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("n3")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("n2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("i1")).click();
	}

}
