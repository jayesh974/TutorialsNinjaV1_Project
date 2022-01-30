package com.tutorialsninja.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {

	@FindBy(css = "[placeholder='Search']")
	private WebElement searchBox;

	@FindBy(css = "div[class=caption] h4")
	private WebElement iMacProduct;

	@FindBy(css = "button[class *=btn-default]")
	private WebElement searchBtn1;

	@FindBy(xpath = "(//p)[3]")
	private WebElement searchResultCriteria;

	@FindBy(css = "div[id=content] h1")
	private WebElement resultSearchTitle;

	@FindBy (css = "div[class=col-sm-4] [name=search]")
	private WebElement productDescription ;
	
	@FindBy (css = "[name='category_id']")
	private WebElement productCategoryPopList ;
	
	@FindBy (css = "input[id=button-search]")
	private WebElement searchBtn2;
	
	@FindBy (css = "#list-view")
	private WebElement listViewBtn;
	
	@FindBy (css = "(//div[@class='row'])[5]//button[contains(@onclick,'cart.add')]")
	private WebElement addTocartBtn;
	
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void searchProduct(String pro)
	{ 
		searchBox.clear();
		searchBox.sendKeys(pro);
		searchBtn1.click();
	}

	public boolean VerifyProduct() 
	{
		return iMacProduct.isDisplayed();
	}

	public String VerifySearchResultTitle() 
	{

		return resultSearchTitle.getText();
	}

	public String VerifySearchResultCriteria()
	{
		return searchResultCriteria.getText();
	}
	
	public void EnterProductDescription(String desc)
	{
		productDescription.clear();
		productDescription.sendKeys(desc);
	}
	
	public void SelectProductCategory(String pro) throws InterruptedException
	{
		
		productCategoryPopList.click();
		
		Select pc = new Select(productCategoryPopList);
		
		List<WebElement> proList = pc.getOptions();
		
		for(int i=0 ;i<proList.size() ; i++)
		{
			 String prductCategory = proList.get(i).getText();
//			 System.out.println(prductCategory);
		
			if(prductCategory.equalsIgnoreCase(pro))
			{
				proList.get(i).click();
				Thread.sleep(2000);
			}
		}
		
		Thread.sleep(2000);
		searchBtn2.click();
		
	}
	
	public void VerifyProductSearchWithListFunctionality()
	{
		listViewBtn.click();
	}
	
	public void ClickOnAddToCartBtn()
	{
		addTocartBtn.click();
	}
	
	
	

}
