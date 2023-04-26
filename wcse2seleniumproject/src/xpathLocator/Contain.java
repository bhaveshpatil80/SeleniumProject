package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("bhave@124m");
		Thread.sleep(3000);
       driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("bhav7894");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();


}
}
