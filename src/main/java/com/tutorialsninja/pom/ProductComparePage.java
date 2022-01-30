package com.tutorialsninja.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductComparePage {
	
	@FindBy (xpath = "//div[@id='content']//tbody[1]//tr[1]//td[2]")
	private WebElement productname;
	
	@FindBy (xpath = "//div[@id='content']//h1")
	private WebElement productCompareTitle;
	
	
	public ProductComparePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public String  VerifyProductAddedTOComparison()
	{
		String prodToComparison = productname.getText();
		System.out.println("The Items is added to product Comparison List : "+prodToComparison);
		return prodToComparison ;
	}
	
	
	

}
