package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		//Element which needs to drag.    		
    	WebElement src=driver.findElement(By.xpath("//a[text()=' 5000']"));	
     
     //Element on which need to drop.		
     WebElement target=driver.findElement(By.xpath("(//div[@id='shoppingCart4']/descendant::li)[1]"));					
     		
     //Using Action class for drag and drop.		
     Actions act=new Actions(driver);					

//Dragged and dropped.		
     act.dragAndDrop(src,target).perform();
     

	    

}
}
