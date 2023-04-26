package assertionsTestng;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
  @Test
  public void validLogin() {
	 
	  Reporter.log("launch the browser",true);
	  Reporter.log("launch the web appl by using url",true);
	  
	  SoftAssert sa = new SoftAssert();// soft assert
	  sa.assertEquals(false,true);
	  Reporter.log("log in page should be displayed!!",true);
	  Reporter.log("perform the login operation",true);
	  Assert.assertEquals(false,true);
	  Reporter.log("Home page will be display",true);
	  Reporter.log("log out",true);
  }
}
