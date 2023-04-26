package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.selenium.dev");
	
	//setSize of Browser
	
	Thread.sleep(3000);
	Dimension targetSize=new Dimension(450,350);
	driver.manage().window().setSize(targetSize);
	
	//setPosition of Browser
	Thread.sleep(3000);
	Point targetPosition=new Point(600,490);
	driver.manage().window().setPosition(targetPosition);
	driver.close();
	

	}

}
