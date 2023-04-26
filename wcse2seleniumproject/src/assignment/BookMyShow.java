package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='mobileNo']")).sendKeys("578912345");
		driver.findElement(By.cssSelector("button[class='sc-daURTG hZAtFl']")).click();
		
}
}
