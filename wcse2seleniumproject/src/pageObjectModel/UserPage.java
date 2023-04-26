package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	@FindBy(xpath="//input[@value='Create New User']")private WebElement createNewUserButton;
	@FindBy(name="username")private WebElement usernameTB;
	@FindBy(name="passwordText")private WebElement passwordTB;
	@FindBy(name="passwordTextRetype")private WebElement reTypepasswordTB;
	@FindBy(name="firstName")private WebElement firstNameTB;
	@FindBy(name="lastName")private WebElement lastNameTB;
	@FindBy(xpath="//input[@type='submit']")private WebElement createUserButton;
	@FindBy(xpath="//input[@value='      Cancel      ']")private WebElement cancelButton;
	
	
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}


	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}


	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getReTypepasswordTB() {
		return reTypepasswordTB;
	}


	public WebElement getFirstNameTB() {
		return firstNameTB;
	}


	public WebElement getLastNameTB() {
		return lastNameTB;
	}


	public WebElement getCreateUserButton() {
		return createUserButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void create() {
		createNewUserButton.click();
	}
	
	public void firstUser(String usn,String pass,String abc,String xyz) throws InterruptedException
	{
		 usernameTB.sendKeys(usn);
		 Thread.sleep(2000);
		 passwordTB.sendKeys(pass);
		 Thread.sleep(2000);
		 reTypepasswordTB.sendKeys(pass);
		 Thread.sleep(2000);
		 firstNameTB.sendKeys(abc);
		 Thread.sleep(2000);
		 lastNameTB.sendKeys(xyz);
		 Thread.sleep(2000);
		 createUserButton.click();
		 
	}
}
