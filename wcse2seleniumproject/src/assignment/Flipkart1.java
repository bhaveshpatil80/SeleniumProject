package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipKart.com");

		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBox.sendKeys("iphone");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Starlight, 128 GB)']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[(@class='_3V2wfe') and (@id='swatch-2-storage')]")).click();

	}

}
