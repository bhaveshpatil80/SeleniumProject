package handlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/AlertPopUp.html");
		
		//generate the alert popup
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//switch the controls to alert popup
		//Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		
		// 1)Accept the alert popup
		Thread.sleep(2000);
		//al.accept();
		
		
		// 2)dismiss the Alert PopUp
		Thread.sleep(2000);
		al.dismiss();
		
		// 3)Text the alert popup
		Thread.sleep(2000);
		//al.getText();
		
		// 4) Sendkeys of the Alert PopUp
		Thread.sleep(2000);
		al.sendKeys("Ok");
        }

}
