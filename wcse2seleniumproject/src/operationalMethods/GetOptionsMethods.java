package operationalMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/single%20select%20dropdown.html");
		
		WebElement dropdownElement= driver.findElement(By.id("i1"));
	    Select sel = new Select(dropdownElement);
	    //operational methods
	    
	    System.out.println(sel.isMultiple());
	    
	    List<WebElement> allOps =sel.getOptions();
	    
	    for (WebElement we:allOps)
	    {
	    	String options = we.getText();
	    	System.out.println(options);
	    
        }
	    driver.navigate().to("file:///C:/Users/Admin/Desktop/Selenium%20Data/webelement/multi%20select%20dropdown.html");
	    WebElement dropdownElement1 = driver.findElement(By.id("i1"));
	    Select sel1 = new Select(dropdownElement1);
	    System.out.println(sel1.isMultiple());
	    
	    List<WebElement> allOps1 = sel1.getOptions();
	    
	    for(int i=0;i<allOps1.size();i++)
	    {
	    	String options1 = allOps1.get(i).getText();
	    	System.out.println(options1);
	    }
}
}
