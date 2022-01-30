package com.tutorialsninja.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.tutorialsninja.pom.LoginPage;
import com.tutorialsninja.pom.RegisterPage;

public class TC_RegisterPage extends BaseClass {

	RegisterPage rp;
	LoginPage lp ;

	@Test(priority = 1)
	public void RegisterNew() throws InterruptedException {

		lp = new LoginPage(driver);
		rp = new RegisterPage(driver);
		
		lp.ClickOnMyAccount();
		rp.ClickOnRegister();
		rp.SetFirstname();
		rp.SetLastname();
		rp.SetEmail();
		rp.SetTelePhone();
		rp.SetPassword();
		rp.SetConfirmPassword();
		rp.ClickOnRadioBtn();
		rp.ClickOnCheckbox();
		rp.ClickOnContinueBtn();

	}

	@Test(priority = 2)
	public void ExistingUserDetails() 
	{
		rp = new RegisterPage(driver);
		
		rp.SetFirstname();		
		rp.SetLastname();	
		rp.SetEmail();	
		rp.SetTelePhone();
		rp.SetPassword();	
		rp.SetConfirmPassword();	
		rp.ClickOnRadioBtn();	
		rp.ClickOnCheckbox();	
		rp.ClickOnContinueBtn();
		
	    String actualmsg = rp.WarnigMsg();
		
		String expected = " Warning: E-Mail Address is already registered!" ;
		
//		assert.assertTrue(actualmsg.equals(expected));
		
		
	}
	

}
