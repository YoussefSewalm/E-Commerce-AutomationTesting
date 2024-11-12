package org.sample.TestingEcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterLoginPage extends Utility
{

	public RegisterLoginPage(WebDriver driver) 
	{
		
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By EnterName=By.cssSelector("form[action=\"/signup\"] > input[name=\"name\"]");
	private By EnterLoginEmail=By.cssSelector("form[action=\"/login\"]>input[name=\"email\"]");
	private By EnterSignupEmail=By.cssSelector("form[action=\"/signup\"]>input[name=\"email\"]");
	private By EnterPassword=By.cssSelector("form[action=\"/login\"]>input[name=\"password\"]");

	
	private By RegisterButton=By.cssSelector("form[action=\"/signup\"] > button[class*=\"btn-default\"]");
	private By LoginButton=By.xpath("(//button[contains(@class,btn-default)])[1]");
	
	private WebElement EnterNameElement;
	private WebElement EnterLoginEmailElement;
	private WebElement EnterSignupEmailElement;
	private WebElement EnterPasswordElement;
	private WebElement RegisterButtonElement;
	private WebElement LoginButtonElement;
    
    public void EnterName(String firstname)
    {
    	EnterNameElement=driver.findElement(EnterName);
    	SendText(EnterNameElement, firstname);
    }
 
    public void EnterLoginEmail(String loginemail)
    {
    	EnterLoginEmailElement=driver.findElement(EnterLoginEmail);
    	SendText(EnterLoginEmailElement, loginemail);
    }
    public void EnterSignupEmail(String signupemail)
    {
    	EnterSignupEmailElement=driver.findElement(EnterSignupEmail);
    	SendText(EnterSignupEmailElement, signupemail);
    }

    public void EnterPassword(String password)
    {
    	EnterPasswordElement=driver.findElement(EnterPassword);
    	SendText(EnterPasswordElement, password);
    }
 
    public RegisterPage ClickRegisterButton()
    {
    	RegisterButtonElement=driver.findElement(RegisterButton);
    	Clicking(RegisterButtonElement);
    	return new RegisterPage(driver);	
    }
    public void ClickLoginButton()
    {
    	LoginButtonElement=driver.findElement(LoginButton);
    	Clicking(LoginButtonElement);
    }
    public void ClearingLoginEmailText()
    {
    	EnterLoginEmailElement=driver.findElement(EnterLoginEmail);
    	ClearText(EnterLoginEmailElement);
    }
    public void ClearingLoginPasswordText()
    {
    	EnterPasswordElement=driver.findElement(EnterPassword);
    	ClearText(EnterPasswordElement);
    }
    public void ClearingSignUpNameText()
    {
    	EnterNameElement=driver.findElement(EnterName);
    	ClearText(EnterNameElement);
    }
    public void ClearingSignUpEmailText()
    {
    	EnterSignupEmailElement=driver.findElement(EnterSignupEmail);
    	ClearText(EnterSignupEmailElement);
    }
    public void VerifyingSuccessfulLogin()
    {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href=\"/logout\"]")).isDisplayed());
    }
    public void VerifyingUnSuccessfulLogin()
    {
		String expected_4="Your email or password is incorrect!";
		String actual_4=driver.findElement(By.cssSelector("form[action=\"/login\"]>p")).getText();
		Assert.assertEquals(actual_4, expected_4);
    }
    public void VerifyingUnSuccessfulSignUp()
    {
		String expected_9="Email Address already exist!";
		String actual_9=driver.findElement(By.cssSelector("form[action=\"/signup\"]>p")).getText();
		Assert.assertEquals(actual_9, expected_9);
    }
    public void VerifyingRegLoginPage()
    {
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"signup-form\"]>h2")).getText().contains("New User Signup!"));
    }
    public void FillingLoginInfo(String loginemail,String password)
    {
    	EnterLoginEmail(loginemail);
    	EnterPassword(password);
    }
    public void FillingInitialSignUpInfo(String initialname,String email)
    {
    	EnterName(initialname);
    	EnterSignupEmail(email);
    }
    public void VerifyingSuccessfulInitialSignUp()
    {
		String expected_6="ENTER ACCOUNT INFORMATION";
		String actual_6=driver.findElement(By.cssSelector("div[class=\"login-form\"]>h2>b")).getText();
		Assert.assertEquals(actual_6, expected_6);
    }
    
}
