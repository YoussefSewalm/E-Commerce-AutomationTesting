package org.sample.TestingEcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class HomePage extends Utility 
{
	public HomePage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
    By RegisterLoginSelect=By.xpath("//a[@href=\"/login\"]");
    By Logout=By.xpath("//a[@href=\"/logout\"]");
    By HomeButton_2=By.xpath("(//a[@href=\"/\"])[2]");
    By HomeButton_1=By.xpath("(//a[@href=\"/\"])[1]");
    By DeleteAccountButton=By.cssSelector("a[href*=\"/delete_account\"]");
    By ContinueButton=By.cssSelector("a[data-qa=\"continue-button\"]");
    By ContactUsButton=By.cssSelector("a[href=\"/contact_us\"]");
    By TestCasesButton=By.cssSelector("a[href=\"/test_cases\"]");
    By ProductsPageButton=By.cssSelector("a[href=\"/products\"]");
    By EnterSubscriptionEmail=By.cssSelector("form[class=\"searchform\"]>input[id=\"susbscribe_email\"]");
    By SubscribeButton=By.id("subscribe");
    By CartButton=By.cssSelector("a[href=\"/view_cart\"]");
    WebElement RegisterLoginSelectElement;
    WebElement LogOutElement;
    WebElement HomeButton_1_Element;
    WebElement HomeButton_2_Element;
    WebElement DeleteAccountButtonElement;
    WebElement ContinueButtonElement; 
    WebElement ContactUsButtonElement;
    WebElement TestCasesButtonElement;
    WebElement ProductsPageButtonElement;
    WebElement EnterSubscriptionEmailElement;
    WebElement SubscribeButtonElement;
    WebElement CartButtonElement;
	public RegisterLoginPage ClickingOnRegister()
	{
		RegisterLoginSelectElement=driver.findElement(RegisterLoginSelect);
		Clicking(RegisterLoginSelectElement);
		return new RegisterLoginPage(driver);
	}
	public RegisterLoginPage ClickingLogOut()
	{
		LogOutElement=driver.findElement(Logout);
		Clicking(LogOutElement);
		return new RegisterLoginPage(driver);
	}
	public void ClickingHomePage()
	{
		HomeButton_2_Element=driver.findElement(HomeButton_2);
		Clicking(HomeButton_2_Element);
	}
	public void DeleteAccount()
	{
		DeleteAccountButtonElement=driver.findElement(DeleteAccountButton);
		Clicking(DeleteAccountButtonElement);
		String expected_47="ACCOUNT DELETED!";
		String actual_47=driver.findElement(By.cssSelector("h2[class=\"title text-center\"]>b")).getText();
	    Assert.assertEquals(expected_47, actual_47);
	}
    public void ClickingContinue()
    {
    	ContinueButtonElement=driver.findElement(ContinueButton);
    	Clicking(ContinueButtonElement);
    }
    public Contact_Us ClickingContactUs()
    {
    	ContactUsButtonElement=driver.findElement(ContactUsButton);
    	Clicking(ContactUsButtonElement);
    	return new Contact_Us(driver);
    }
    public void ClickingTestCases()
    {   TestCasesButtonElement=driver.findElement(TestCasesButton);
	    Clicking(TestCasesButtonElement);
    }
    public AllProductsPage ClickingProducts()
    {
    	ProductsPageButtonElement=driver.findElement(ProductsPageButton);
    	Clicking(ProductsPageButtonElement);
    	boolean expected_11=true;
    	boolean actual_11=driver.findElement(By.cssSelector("div[class=\"features_items\"]>h2")).getText().contains("ALL PRODUCTS");
    	Assert.assertEquals(expected_11, actual_11);
    	String expected_12="CATEGORY";
    	String actual_12=driver.findElement(By.cssSelector("div[class=\"left-sidebar\"]>h2")).getText();
    	Assert.assertEquals(actual_12, expected_12);
    	String expected_13="BRANDS";
    	String actual_13=driver.findElement(By.cssSelector("div[class=\"brands_products\"]>h2")).getText();
    	Assert.assertEquals(actual_13, expected_13);
    	return new AllProductsPage(driver);
    }
    public void EnterSubscriptionEmail(String subscriptionemail)
    {
    	String expected_22="SUBSCRIPTION";
    	String actual_22=driver.findElement(By.cssSelector("div[class=\"single-widget\"]>h2")).getText();
    	Assert.assertEquals(actual_22, expected_22);
    	EnterSubscriptionEmailElement=driver.findElement(EnterSubscriptionEmail);
    	SendText(EnterSubscriptionEmailElement,subscriptionemail);
    }
    public void ClickingSubscribeButton()
    {
    	SubscribeButtonElement=driver.findElement(SubscribeButton);
    	Clicking(SubscribeButtonElement);
    	String expected_23="You have been successfully subscribed!";
    	String actual_23=driver.findElement(By.cssSelector("div[class=\"alert-success alert\"]")).getText();
    	Assert.assertEquals(actual_23, expected_23);		
    }
    public CartPage ClickingCartButton()
    {
    	CartButtonElement=driver.findElement(CartButton);
    	Clicking(CartButtonElement);
    	return new CartPage(driver);
    }
    
    
}
	

