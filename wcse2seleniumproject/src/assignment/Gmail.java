package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AWnogHeuD0wQulKQU8B_v7lZrPBkD0L6MHzkowSHCqyjiyCgJW8ZlMoBjzDUpzLaAQ-tU8kzTKW5RA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement emailTB=driver.findElement(By.xpath("//input[@id='identifierId']"));
		emailTB.sendKeys("patil698@gmail.com");
		Thread.sleep(2000);
		
		WebElement nextButton= driver.findElement(By.xpath("//span[.='Next']"));
		nextButton.click();
		Thread.sleep(2000);
		
		WebElement passTB = driver.findElement(By.xpath("//input[@name='password']"));
		passTB.sendKeys("7002154867");
		Thread.sleep(2000);
		
		WebElement nextButton1= driver.findElement(By.xpath("//span[.='Next']"));
		nextButton1.click();
	

}
}
