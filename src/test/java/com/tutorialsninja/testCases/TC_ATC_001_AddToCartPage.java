package com.tutorialsninja.testCases;

import org.testng.annotations.Test;

import com.tutorialsninja.pom.SearchPage;

public class TC_ATC_001_AddToCartPage extends BaseClass {
	
	SearchPage sp ;
	
	@Test
	public void VerifyAddingProductToCart()
	{
		sp = new SearchPage(driver);
		
		sp.searchProduct("MacBook Pro");
		
		
		
	}

}
