package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth?hl=en_US&co=US&continue=https%3A%2F%2Fwww.indeed.com%2Fq-Login-jobs.html&tmpl=desktop&service=mob&from=gnav-util-jobsearch--indeedmobile&jsContinue=https%3A%2F%2Fwww.indeed.com%2Fq-Login-jobs.html%3Fq%3DLogin&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess&_ga=2.152345457.937372176.1675606717-708958894.1675606717");
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[name='__email']")).sendKeys("mrautb@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
