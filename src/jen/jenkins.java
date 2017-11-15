package jen;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jenkins {
	
	@BeforeMethod(alwaysRun=true)
	public void Login(){
		Reporter.log("Login",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void LogOut(){
		Reporter.log("Loginout",true);
	}
	
	@Test(dependsOnMethods={"action2"})
	public void action1(){
		Reporter.log("action1",true);
	}
	
	@Test()
	public void action2(){
		System.out.println("gdgdasghd");
		Reporter.log("action2",true);
		Assert.fail();
	}
	
}
