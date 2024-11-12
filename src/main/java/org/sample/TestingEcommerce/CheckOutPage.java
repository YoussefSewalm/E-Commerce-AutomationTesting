package org.sample.TestingEcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckOutPage extends Utility{

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By EnterOrderComment=By.cssSelector("textarea[class=\"form-control\"]");
	private By PlaceOrderButton=By.cssSelector("a[href=\"/payment\"]");
	
	private WebElement EnterOrderCommentElement;
	private WebElement PlaceOrderButtonElement;
	
	public void EnterOrderComment(String ordercomment)
	{
		EnterOrderCommentElement=driver.findElement(EnterOrderComment);
		SendText(EnterOrderCommentElement,ordercomment);
	}
	public PaymentPage ClickingPlaceOrder()
	{
		PlaceOrderButtonElement=driver.findElement(PlaceOrderButton);
		Clicking(PlaceOrderButtonElement);
		return new PaymentPage(driver);
	}
	public void CheckingAdressDetails()
	{
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_address1 address_address2\"])[2]")).getText().contains("Mokattam"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_address1 address_address2\"])[5]")).getText().contains("Mokattam"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_address1 address_address2\"])[1]")).getText().contains("Vodoo"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_address1 address_address2\"])[4]")).getText().contains("Vodoo"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_city address_state_name address_postcode\"])[1]")).getText().contains("Mokattam"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_city address_state_name address_postcode\"])[2]")).getText().contains("Mokattam"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_firstname address_lastname\"])[1]")).getText().contains("youssef sewalm"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_firstname address_lastname\"])[2]")).getText().contains("youssef sewalm"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_country_name\"])[1]")).getText().contains("United States"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_country_name\"])[2]")).getText().contains("United States"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_phone\"])[1]")).getText().contains("01023847586"));
    	Assert.assertTrue(driver.findElement(By.xpath("(//li[@class=\"address_phone\"])[2]")).getText().contains("01023847586"));
	}

}
