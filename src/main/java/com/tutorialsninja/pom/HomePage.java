package com.tutorialsninja.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	//div[@class='row']//div[@class='button-group']//button[@data-original-title='Compare this Product']
	
//	@FindBy (xpath = "//div[@class='row']//div[@class='product-thumb transition']")
//	private WebElement featureProduct ;
	
	@FindBy (xpath = "//div[@class='row']//div[contains(@class,'product-thumb')]")
	private WebElement featuredProduct ;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successmsg ;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']//a[2]")
	private WebElement productComparisonLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddProductToProductCompareList(String prod)
	{
		//div[@class='row']//div[@class='product-thumb transition']//div[@class='button-group']//button[3]
		
		List<WebElement> productnames = featuredProduct.findElements(By.xpath("//h4"));
		
		for(int i=0; i<productnames.size(); i++)
		{
			String productname = productnames.get(i).getText();
			
			if(productname.equalsIgnoreCase(prod))
			{
//				productnames.get(i).click();
				
				List<WebElement> proCart = featuredProduct.findElements(By.xpath("//button[@data-original-title='Compare this Product']"));
				
				proCart.get(i).click();
			}
		}
	}
	
	public String verifySuccessMessage()
	{
		return successmsg.getText();
	}
	
	public void  ClickOnProductComparisonPage()
	{
		productComparisonLink.click();
		
	}
	
	

}
