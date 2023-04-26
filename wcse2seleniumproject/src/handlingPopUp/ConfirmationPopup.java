package handlingPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/Confirmation%20PopUp.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert al= driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		
		//al.dismiss();
		
		System.out.println(al.getText());
		
		
		

}
}