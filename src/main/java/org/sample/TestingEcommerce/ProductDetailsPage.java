package org.sample.TestingEcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class ProductDetailsPage extends Utility {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By EnterReviewName=By.cssSelector("form[id=\"review-form\"]>span>input[id=\"name\"]");
	private By EnterReviewEmail=By.cssSelector("form[id=\"review-form\"]>span>input[id=\"email\"]");
	private By EnterReviewMessage=By.cssSelector("textarea[name=\"review\"]");
	private By SubmitReview=By.id("button-review");
	private By AddToCartButton=By.cssSelector("div[class=\"product-information\"]>span>button");
	private By ViewCartButton=By.cssSelector("p[class=\"text-center\"]>a");
	private By ContinueShoppingButton=By.cssSelector("div[class=\"modal-footer\"]>button");
	private By EnterProductQuantity=By.id("quantity");
	private WebElement EnterReviewNameElement;
	private WebElement EnterReviewEmailElement;
	private WebElement EnterReviewMessageElement;
	private WebElement SubmitReviewElement;
	private WebElement AddToCartButtonElement;
	private WebElement ViewCartButtonElement;
	private WebElement ContinueShoppingButtonElement;
	private WebElement EnterProductQuantityElement;
	
	public void EnterReviewNameElement(String reviewname)
	{
		String expected_24="WRITE YOUR REVIEW";
		String actual_24=driver.findElement(By.cssSelector("li[class=\"active\"]>a")).getText();
		Assert.assertEquals(actual_24, expected_24);
		EnterReviewNameElement=driver.findElement(EnterReviewName);
		SendText(EnterReviewNameElement,reviewname);
	}
	public void EnterReviewEmailElement(String reviewemail)
	{
		EnterReviewEmailElement=driver.findElement(EnterReviewEmail);
		SendText(EnterReviewEmailElement,reviewemail);
	}
	public void EnterReviewMessageElement(String reviewmessage)
	{
		EnterReviewMessageElement=driver.findElement(EnterReviewMessage);
		SendText(EnterReviewMessageElement,reviewmessage);
	}
	public void ClickingSubmitReview()
	{
		SubmitReviewElement=driver.findElement(SubmitReview);
		Clicking(SubmitReviewElement);
		String expected_25="Thank you for your review.";
		String actual_25=driver.findElement(By.cssSelector("div[class=\"alert-success alert\"]>span")).getText();
		Assert.assertEquals(actual_25, expected_25);
	}
	public void ClickingAddToCartFromProductDetails()
	{
		AddToCartButtonElement=driver.findElement(AddToCartButton);
		Clicking(AddToCartButtonElement);
		/* 
		boolean expected_26=true;
		
		boolean actual_26=driver.findElement(By.xpath("div[class=\\\"modal-footer\\\"]>button")).isDisplayed();
		Assert.assertEquals(expected_26, actual_26);
		*/
	}
	public AllProductsPage ClickingContinueShopping()
	{
		ContinueShoppingButtonElement=driver.findElement(ContinueShoppingButton);
		Clicking(ContinueShoppingButtonElement);
		return new AllProductsPage(driver);
	}
	public CartPage ClickingViewCart()
	{
		ViewCartButtonElement=driver.findElement(ViewCartButton);
		Clicking(ViewCartButtonElement);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expected_27="Shopping Cart";
		String actual_27=driver.findElement(By.cssSelector("ol[class=\"breadcrumb\"]>li[class=\"active\"]")).getText();
		Assert.assertEquals(actual_27, expected_27);
		String expected_28="Rs. 2000";//Total Price
		String actual_28=driver.findElement(By.cssSelector("td[class=\"cart_total\"]>p")).getText();
		Assert.assertEquals(actual_28, expected_28);
		String expected_29="Rs. 500";//Cart Price
		String actual_29=driver.findElement(By.cssSelector("td[class=\"cart_price\"]>p")).getText();
		Assert.assertEquals(actual_29, expected_29);
		String expected_30="4";//Quantity
		String actual_30=driver.findElement(By.cssSelector("tr[id=\"product-1\"]>td[class=\"cart_quantity\"]")).getText();
		Assert.assertEquals(actual_30, expected_30);
		return new CartPage(driver);
	}
	public void EnteringProductQuantity(String quantity)
	{
		EnterProductQuantityElement=driver.findElement(EnterProductQuantity);
		ClearText(EnterProductQuantityElement);
		SendText(EnterProductQuantityElement,quantity);
	}
	
}
