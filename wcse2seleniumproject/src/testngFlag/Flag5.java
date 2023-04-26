package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Flag5 {
  @Test 
  public void login() {
	  Reporter.log("logged in",true);
  }
  
  @Test(dependsOnMethods = "login")
  public void createuser() {
	  Reporter.log("usercreated",true);
  }
  
  @Test (dependsOnMethods = "createuser")
  public void logout() {
	  Reporter.log("logged out",true);
  }
}
