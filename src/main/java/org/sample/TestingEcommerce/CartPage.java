package org.sample.TestingEcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class CartPage extends Utility{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By ProceedToCheckoutButton=By.cssSelector("div[class=\"col-sm-6\"]>a[class=\"btn btn-default check_out\"]");
	private By RegisterOrLoginAfterCheckOutButton=By.cssSelector("p[class=\"text-center\"]>a[href=\"/login\"]");
	private By ContinueOnCartButton=By.cssSelector("div[class=\"modal-footer\"]>button");
	private By DeleteCartButton=By.cssSelector("a[class=\"cart_quantity_delete\"]");
    private By EnterSubscriptionEmailFromCart=By.cssSelector("form[class=\"searchform\"]>input[id=\"susbscribe_email\"]");
    private By SubscribeButtonFromCart=By.id("subscribe");
	private WebElement ProceedToCheckoutButtonElement;
	private WebElement RegisterOrLoginAfterCheckOutButtonElement;
	private WebElement ContinueOnCartButtonElement;
	private WebElement DeleteCartButtonElement;
	private WebElement EnterSubscriptionEmailFromCartElement;
	private WebElement SubscribeButtonFromCartElement;
	public RegisterLoginPage ClickingRegisterOrLoginFromCartPageAfterCheckOut()
	{
		RegisterOrLoginAfterCheckOutButtonElement=driver.findElement(RegisterOrLoginAfterCheckOutButton);
		Clicking(RegisterOrLoginAfterCheckOutButtonElement);
		return new RegisterLoginPage(driver);
	}
	public CheckOutPage ClickingProceedToCheckOut()
	{
		ProceedToCheckoutButtonElement=driver.findElement(ProceedToCheckoutButton);
		Clicking(ProceedToCheckoutButtonElement);
		return new CheckOutPage(driver);
	}
	public void ClickingContiniueOnCartButton()
	{
		ContinueOnCartButtonElement=driver.findElement(ContinueOnCartButton);
		Clicking(ContinueOnCartButtonElement);
	}
	public void DeletingCartItem()
	{
		DeleteCartButtonElement=driver.findElement(DeleteCartButton);
		Clicking(DeleteCartButtonElement);
		WebElement element_1=driver.findElement(By.cssSelector("span[id=\"empty_cart\"]>p>b"));
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element_1));
	}
	public void EnterSubscriptionEmailFromCart(String subscriptionemail)
	{
		String expected_22="SUBSCRIPTION";
    	String actual_22=driver.findElement(By.cssSelector("div[class=\"single-widget\"]>h2")).getText();
    	Assert.assertEquals(actual_22, expected_22);
		EnterSubscriptionEmailFromCartElement=driver.findElement(EnterSubscriptionEmailFromCart);
		SendText(EnterSubscriptionEmailFromCartElement,subscriptionemail);
	}
	public void ClickingSubscribeFromCart()
	{
		SubscribeButtonFromCartElement=driver.findElement(SubscribeButtonFromCart);
		Clicking(SubscribeButtonFromCartElement);
	  	String expected_23="You have been successfully subscribed!";
    	String actual_23=driver.findElement(By.cssSelector("div[class=\"alert-success alert\"]")).getText();
    	Assert.assertEquals(actual_23, expected_23);
	}
}
