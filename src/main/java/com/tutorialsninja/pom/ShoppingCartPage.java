package com.tutorialsninja.pom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	@FindBy (xpath = "//ul[@class='breadcrumb']//li[2]")
	private WebElement breadcrumbTitle;
	
	@FindBy (xpath = "((//table[@class='table table-bordered'])[2]//tbody//tr")
	private WebElement listOfProductName ;
	
	
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void getListOfproductAdded()
	{
		List<WebElement> noOfProduct = listOfProductName.findElements(By.xpath("//td[2]//a"));
		
		for(WebElement pro : noOfProduct)
		{
			System.out.println(pro.getText());
		}

	}

	
	

}
