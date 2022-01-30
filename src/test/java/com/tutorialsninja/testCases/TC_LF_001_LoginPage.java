package com.tutorialsninja.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialsninja.pom.LoginPage;

public class TC_LF_001_LoginPage extends BaseClass{
	
	
	LoginPage lp ;
	
	@Test
	public void VerifyLoginTest() throws InterruptedException
	{
		
		lp  = new LoginPage(driver);
		
		lp.ClickOnMyAccount();
		Thread.sleep(2000);
		lp.ClinkOnLoginLink();
		Thread.sleep(2000);
//		lp.ClinkOnLoginLink();
		lp.enterEmailAddress(username);
		Thread.sleep(2000);
		lp.enterPassword(password);
		Thread.sleep(2000);
		
//		lp.enterEmailAddress();
//		lp.enterPassword();
	 
		lp.ClickOnLoginBtn();
		Thread.sleep(2000);
		
		 boolean flag = lp.VerifyPage();
		 
		 Assert.assertTrue(flag);
		 
		 lp.ClickOnLogOut();
	
		
	}

}
