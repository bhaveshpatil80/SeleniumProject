package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DeSelectByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/multi%20select%20dropdown.html");
		
		WebElement dropdownElement= driver.findElement(By.name("menu"));
	    Select sel = new Select(dropdownElement);
	    
	    	sel.selectByValue("v5");
	    	Thread.sleep(2000);
	   
	        sel.deselectByValue("v5");
	    	}
}

