package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	@FindBy(xpath="//input[@name='username']")private WebElement usnTB;
	@FindBy(xpath="//input[@name='pwd']")private WebElement passTB;
	@FindBy(xpath="//a[@id='loginButton']")private WebElement loginbutton;
	@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")private WebElement checkbox;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//getter Methods
	
	public WebElement getUnTB() {
		return usnTB;
	}
	public WebElement getPassTB() {
		return passTB;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	//Operational Methods
	
	public void validLogin(String validusn,String validpass)
	{
		
		usnTB.sendKeys(validusn);
		passTB.sendKeys(validpass);
		loginbutton.click();
		
	}
	
	public void invalidLogin(String invalidusn,String invalidpass) throws InterruptedException
	{
		usnTB.sendKeys(invalidusn);
		passTB.sendKeys(invalidpass);
		loginbutton.click();
		Thread.sleep(2000);
		usnTB.clear();
	}
}
