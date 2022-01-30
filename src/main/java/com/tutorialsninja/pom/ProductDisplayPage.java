package com.tutorialsninja.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
	
	@FindBy (xpath = "//ul[@class='thumbnails']//li")
	private WebElement thumbnailImages;
	
	@FindBy (xpath = "//button[contains(@title,'Next')]")
	private WebElement imageNextBtn;
	
	@FindBy (xpath = "//button[contains(@title,'Close')]")
	private WebElement imageCloseBtn ;
	
	public ProductDisplayPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyThumbnailsImgs() throws InterruptedException
	{
		int no = thumbnailImages.findElements(By.xpath("//a[@class='thumbnail']")).size();
		System.out.println(no);
		
		for(int i=0 ; i<=no-1 ; i++)
		{
		    thumbnailImages.findElements(By.xpath("//img")).get(i).click();
		    Thread.sleep(2000);
		    imageNextBtn.click();
		    Thread.sleep(2000);
		    imageCloseBtn.click();
		    
		    if(no==i)
		    {
		    	break;
		    }
	    		
		}
	}
	
	

}
