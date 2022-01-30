package com.tutorialsninja.testCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.tutorialsninja.pom.LoginPage;
import com.tutorialsninja.pom.SearchPage;

public class TC_001_SF_SearchPage extends BaseClass {

	LoginPage lp;
	SearchPage sp;

	@BeforeMethod
	public void LoginTest() throws InterruptedException {
		lp = new LoginPage(driver);

		lp.ClickOnMyAccount();
		lp.ClinkOnLoginLink();
		lp.enterEmailAddress(username);
		lp.enterPassword(password);
		Thread.sleep(2000);

	}

	@Test(priority = 1)
	public void VerifySearchFunctionality() throws InterruptedException {
		sp = new SearchPage(driver);

		sp.searchProduct("iMac");

		Thread.sleep(2000);
		boolean flag = sp.VerifyProduct();

		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void nonExistingProductSearch() throws InterruptedException {
		sp = new SearchPage(driver);

		sp.searchProduct("Oneplus");
		Thread.sleep(2000);

		String result = sp.VerifySearchResultCriteria();

		Assert.assertEquals(result, "There is no product that matches the search criteria.");

	}

	@Test(priority = 3)
	public void VerifySearchWithMultpleResult() throws InterruptedException {
		sp = new SearchPage(driver);

		sp.searchProduct("Mac");
		Thread.sleep(2000);

		String Search_Product = sp.VerifySearchResultTitle();

		System.out.println("Related Product Search :" + Search_Product);

		List<WebElement> resultList = driver
				.findElements(By.xpath("//div[@class='row']//div[contains(@class,'product-layout')]//h4//a"));

		for (WebElement result : resultList) {
			String productNmame = result.getText();
			System.out.println(productNmame);
		}

	}

	@Test(priority = 4)
	public void VerifySearchProductWithDescAndCategory() throws InterruptedException {
		
		sp = new SearchPage(driver);
		sp.searchProduct(" ");

		sp.EnterProductDescription("Mac");
		Thread.sleep(2000);
		sp.SelectProductCategory("Laptops & Notebooks");
		Thread.sleep(2000);

		String Search_Product = sp.VerifySearchResultTitle();

		System.out.println("Related Product Search :" + Search_Product);

		List<WebElement> resultList = driver
				.findElements(By.xpath("//div[@class='row']//div[contains(@class,'product-layout')]//h4//a"));

		for (WebElement result : resultList) 
		{
			String productNmame = result.getText();
			System.out.println(productNmame);

		}

	}
}
