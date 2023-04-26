package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/multi%20select%20dropdown.html");
		
		WebElement dropdownElement= driver.findElement(By.name("menu"));
	    Select sel = new Select(dropdownElement);
	    for(int i=0;i<5;i++)
	    {
	    	sel.selectByIndex(i);
	    }
	    
	    List<WebElement> allOps = sel.getAllSelectedOptions();
	    for(int i=0;i<allOps.size();i++)
	    {
	    	String options = allOps.get(i).getText();
	    	System.out.println(options);
	    }

}
}
