package com.tutorialsninja.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy (xpath = "//a[@title='My Account']")
	private WebElement  myAccount ;
	
	@FindBy (xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li[2]")
	private WebElement loginLink ;
	
//	@FindBy (xpath = "//a[text()='Login']")
//	private WebElement loginLink;
//	
	@FindBy (css ="[name=email]")
	private WebElement emailaddress;
	
	@FindBy (css ="[name=password]")
	private WebElement pwd;
	
	@FindBy (css ="[value=Login]")
	private WebElement loginBtn;
	
	@FindBy (xpath = "//ul[@class='breadcrumb']")
	private WebElement accountBreakdrum ;
	
	@FindBy (linkText = "Logout")
	private WebElement logOut ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnMyAccount()
	{
		myAccount.click();
	}
	
	public void CliOnLoginLink()
	{
		loginLink.click();
	}
	
	public void ClinkOnLoginLink()
	{
		loginLink.click();
	}
	
	public void enterEmailAddress(String emailid)
	{
		emailaddress.sendKeys(emailid);
		
	}
	
	public void enterPassword(String password)
	{
		pwd.sendKeys(password);
	}
//	public void enterEmailAddress()
//	{
//		emailaddress.sendKeys("jayesh974@gmail.com");
//	}
//	
//	
//	public void enterPassword()
//	{
//		pwd.sendKeys("Jayesh@974");
//	}
	
	public void ClickOnLoginBtn()
	{
		loginBtn.click();
	}
	
	public boolean VerifyPage()
	{
		return accountBreakdrum.isDisplayed();
	}
	
	public void ClickOnLogOut()
	{
		logOut.click();
	}
	
	
	
}





