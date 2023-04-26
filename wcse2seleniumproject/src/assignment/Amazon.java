package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%3Fpd_rd_w%3DRYizp%26content-id%3Damzn1.sym.ae011968-bf29-4222-921f-8c3a9824112d%3Aamzn1.sym.ae011968-bf29-4222-921f-8c3a9824112d%26pf_rd_p%3Dae011968-bf29-4222-921f-8c3a9824112d%26pf_rd_r%3DK0CYGJBZNW1Z34S8ZEEZ%26pd_rd_wg%3DZQmeb%26pd_rd_r%3D865f3a31-0215-4059-8e54-2ae029bc770a%26qid%3D1675447454%26ref%3Dsxts_aspa_qna%26c_c%3D-802937953&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    Thread.sleep(3000);
	    driver.findElement(By.id("ap_email")).sendKeys("bhavesh");
	    driver.findElement(By.id("continue")).click();
	    
	}

}
