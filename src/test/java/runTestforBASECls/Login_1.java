package runTestforBASECls;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pagesforbcls.LoginPage;

public class Login_1 extends BaseClass{
	
	@BeforeClass
	private void setUp() {
		// TODO Auto-generated method stub
		
		getBrowser("Chrome");
		getURL("https://www.facebook.com/");

	}
	
	@Test
	
	public void loginlog() {
		LoginPage lpag = new LoginPage();
		lpag.functionality("venugopalV12","Venugopal@123");
		

	}
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}

	
	
	
}
