package com.tutorialsninja.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.tutorialsninja.pom.HomePage;
import com.tutorialsninja.pom.LoginPage;
import com.tutorialsninja.pom.ProductComparePage;
import com.tutorialsninja.pom.ProductDisplayPage;
import com.tutorialsninja.pom.SearchPage;

public class TC_PDP_001_ProductDisplayPage extends BaseClass{
	

	LoginPage lp ;
	HomePage hp ;
	ProductComparePage pcp ;
	SearchPage sp;
	ProductDisplayPage pdp ;
	
	@Test
	public void VerifyThumbnailofProduct() throws InterruptedException
	{
		
		hp = new HomePage(driver);
		sp = new SearchPage(driver);
		pcp = new ProductComparePage(driver);
		pdp = new ProductDisplayPage(driver);
		
		sp.searchProduct("Mac");
		Thread.sleep(2000);

		String Search_Product = sp.VerifySearchResultTitle();

		System.out.println("Related Product Search :" + Search_Product);

		List<WebElement> resultList = driver
				.findElements(By.xpath("//div[@class='row']//div[contains(@class,'product-layout')]//h4//a"));

		for (WebElement result : resultList) 
		{
			String productNmame = result.getText();
			System.out.println(productNmame);
			
			if(productNmame.equalsIgnoreCase("MacBook Air"))
			{
				result.click();
				System.out.println(productNmame+" is selected");
				break;
			}
		}
		
		pdp.VerifyThumbnailsImgs();
		
		
		
		
		
		
	}
	
	
	
	

}
