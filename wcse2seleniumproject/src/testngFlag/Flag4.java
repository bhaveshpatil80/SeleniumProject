package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(invocationCount = 20)
  public void ft() {
	  Reporter.log("FTC is executing",true);
  }
  
  @Test(invocationCount = 15)
  public void it() {
	  Reporter.log("ITC is executing",true);
  }
}
