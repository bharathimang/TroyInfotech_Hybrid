package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;

public class SampleTestCase extends Base {
	
	@Test
	public void login() throws Throwable {
		
		LoginPage lp=new LoginPage();
		lp.doValidation();
		lp.doLogin();

	}

}
