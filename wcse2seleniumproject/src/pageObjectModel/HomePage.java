package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[@class='logout']")private WebElement LogoutLink;
	@FindBy(xpath="//select[@name='usersSelector.selectedUser']")private WebElement EnterTimeTrackDropdown;
	@FindBy(xpath="//input[@id='SubmitTTButton']")private WebElement saveLeaveButton;
	@FindBy(xpath="//a[@class='content users']")private WebElement usersTab;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//Utilization
	
	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getEnterTimeTrackDropdown() {
		return EnterTimeTrackDropdown;
	}

	public WebElement getSaveLeaveButton() {
		return saveLeaveButton;
	}

	public WebElement getUsersTab() {
		return usersTab;
	}
	
	//Operational Methods 
	
	public void Logout()
	{
		LogoutLink.click();
	}
	
	public void clickOnusers()
	{
		if(usersTab.isDisplayed())
		{
			usersTab.click();
		}
		else
		{
			System.out.println("we got the exception!!!");
		}
	}
}
