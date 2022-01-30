package com.tutorialsninja.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialsninja.pom.HomePage;
import com.tutorialsninja.pom.LoginPage;
import com.tutorialsninja.pom.ProductComparePage;
import com.tutorialsninja.pom.SearchPage;

public class TC_PC_001_ProductComparisonPage extends BaseClass{
	
	LoginPage lp ;
	HomePage hp ;
	ProductComparePage pcp ;
	SearchPage sp;
	
//	@BeforeMethod
//	public void LoginTest() throws InterruptedException {
//		lp = new LoginPage(driver);
//
//		lp.ClickOnMyAccount();
//		lp.ClinkOnLoginLink();
//		lp.enterEmailAddress(username);
//		lp.enterPassword(password);
//		Thread.sleep(2000);
//		lp.ClickOnLoginBtn();
//	}
//		
		
	@Test(enabled = false)
	public void VerifyProductComparisonFunctionality() throws InterruptedException
	{
		
		hp = new HomePage(driver);
		pcp = new ProductComparePage(driver);	
		
		hp.AddProductToProductCompareList("Canon EOS 5D");
		
		System.out.println(hp.verifySuccessMessage());
		Thread.sleep(2000);
		hp.ClickOnProductComparisonPage();
		Thread.sleep(2000);
		
		System.out.println("Product Addet to comparison is :"+pcp.VerifyProductAddedTOComparison());
	
	}
	
	@Test
	public void VerifyProductComparisonListFunctionality() throws InterruptedException
	{
		hp = new HomePage(driver);
		sp = new SearchPage(driver);
		pcp = new ProductComparePage(driver);
		
		sp.searchProduct("Mac");
		Thread.sleep(2000);
		sp.VerifySearchResultTitle();
		sp.VerifyProductSearchWithListFunctionality();
		Thread.sleep(2000);
		
		hp.AddProductToProductCompareList("MacBook Air");
		Thread.sleep(2000);
		hp.ClickOnProductComparisonPage();
		Thread.sleep(2000);
		
		pcp.VerifyProductAddedTOComparison();
		
		
		
	}
	

}
