package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("http://desktop-jd3kil9/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
	    WebElement target = driver.findElement(By.xpath("//a[.='Logo & Color Scheme']"));
	   
	    Actions act = new Actions(driver);
	    //MouseHover Action
	    act.moveToElement(target).perform();
	    target.click();
	    
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='uploadNewReportLogoOption']")).click();
	   
	    Thread.sleep(2000);
	    //Double Click Action
	    WebElement target1 = driver.findElement(By.xpath("//input[@name='formCustomReportLogo.logo']"));
	    act.doubleClick(target1).perform();
	  }
}