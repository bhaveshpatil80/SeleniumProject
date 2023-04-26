package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/multi%20select%20dropdown.html");
		
		WebElement dropdownElement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdownElement);
		//select multiple options
		
		for(int i=0;i<6;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		for(int i=0;i<6;i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(2000);
			
		}
	}
}
