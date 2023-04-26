package windowBasePopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
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
	    WebElement target1 = driver.findElement(By.xpath("//input[@name='formCustomReportLogo.logo']"));
	    //Double Click Action
	    //File upload popup
	    act.doubleClick(target1).perform();
	    
	    //Handle FileuploadPopUp
	    
	    File path = new File("./autoit/fileUpload.exe");
	    String apath = path.getAbsolutePath();
	    Runtime.getRuntime().exec(apath);
	    Thread.sleep(4000);
	    Runtime.getRuntime().exec(apath);
	  }
}


