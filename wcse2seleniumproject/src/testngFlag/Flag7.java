package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
  @Test
  public void login() {
	  int res=5/0;
	  Reporter.log("login method!!!",true);
  }
  
  @Test(dependsOnMethods = "login",alwaysRun = true)
  public void createuser() {
	  Reporter.log("usercreated!!!",true);
  }
  
  @Test
  public void logout() {
	  Reporter.log("logout method!!!",true);
  }
}
