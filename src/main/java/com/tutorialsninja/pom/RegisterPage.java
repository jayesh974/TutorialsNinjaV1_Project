package com.tutorialsninja.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li[1]")
	private WebElement register ;
	
	@FindBy (name = "firstname")
	private WebElement firstname ;
	
	@FindBy (name = "lastname")
	private WebElement lastname ;
	
	@FindBy (name = "email")
	private WebElement email ;
	
	@FindBy (name = "telephone")
	private WebElement telephone ;
	
	@FindBy (name = "password")
	private WebElement password ;
	
	@FindBy (name = "confirm")
	private WebElement confirmpwd ;
	
	@FindBy (xpath = "//input[@type = 'radio' and @value = '0']")
	private WebElement newsletterRadioBtn ;
	
	@FindBy (name = "agree")
	private WebElement agreeCheckBox ;
	
	@FindBy (css = "[value=Continue]")
	private WebElement continueBtn ;
	
	@FindBy (css = "div[class *=alert-dismissible]")
	private WebElement warningMsg ;
	
	
	public void ClickOnRegister(){

		register.click();	
	}

	public void SetFirstname(){
		
		firstname.sendKeys("Jayesh");	
	}
	
	public void SetEmail(){

		email.sendKeys("jayesh974@gmail.com");	
	}
	
	public void SetLastname(){

		lastname.sendKeys("Gangurde");	
	}
	
	public void SetTelePhone(){

		telephone.sendKeys("7276460956");	
	}
	
	public void SetPassword(){

		password.sendKeys("Jayesh@974");	
	}
	
	public void SetConfirmPassword(){

		confirmpwd.sendKeys("Jayesh@974");	
	}
	
	public void ClickOnRadioBtn(){

		newsletterRadioBtn.click();	
	}
	
	public void ClickOnCheckbox(){

		agreeCheckBox.click();	
	}
	
	public void ClickOnContinueBtn()
	{
		continueBtn.click();
	}
	
	public String WarnigMsg() 
	{
		 return warningMsg.getText();
		
	}
	
	


}
