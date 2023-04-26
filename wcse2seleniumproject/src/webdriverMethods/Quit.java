package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://omayo.blogspot.com");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("a[.='Open a popup window']")).click();
	    driver.close();
		}
}

