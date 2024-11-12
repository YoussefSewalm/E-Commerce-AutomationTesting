package org.sample.TestingEcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PaymentPage extends Utility {

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 private By EnterNameOnCard=By.cssSelector("input[class=\"form-control\"]");
 private By EnterCardNumber=By.cssSelector("input[name=\"card_number\"]");
 private By EnterCVC=By.cssSelector("input[name=\"cvc\"]");
 private By EnterExpirationMonth=By.cssSelector("input[name=\"expiry_month\"]");
 private By EnterExpirationYear=By.cssSelector("input[name=\"expiry_year\"]");
 private By PayAndConfirmOrderButton=By.cssSelector("button[class=\"form-control btn btn-primary submit-button\"]");
 private By DownloadInvoiceButtonAfterPlacingOrder=By.cssSelector("a[href=\"/download_invoice/2000\"]");
 private By ContinueButtonAfterPlacingOrder=By.xpath("(//a[@href=\"/\"])[3]");
 private WebElement EnterNameOnCardElement;
 private WebElement EnterCardNumberElement;
 private WebElement EnterCVCElement;
 private WebElement EnterExpirationMonthElement;
 private WebElement EnterExpirationYearElement;
 private WebElement PayAndConfirmOrderButtonElement;
 private WebElement DownloadInvoiceButtonAfterPlacingOrderElement;
 private WebElement ContinueButtonAfterPlacingOrderElement;
 
 public void EnterNameOnCard(String nameoncard)
 {
	 EnterNameOnCardElement=driver.findElement(EnterNameOnCard);
	 SendText(EnterNameOnCardElement,nameoncard);
 }
 public void EnterCardNumber(String cardnumber)
 {
	 EnterCardNumberElement=driver.findElement(EnterCardNumber);
	 SendText(EnterCardNumberElement,cardnumber);
 }
 public void EnterCVC(String cvc)
 {
	 EnterCVCElement=driver.findElement(EnterCVC);
	 SendText(EnterCVCElement,cvc);
 }
 public void EnterExpiryMonth(String expirymonth)
 {
	 EnterExpirationMonthElement=driver.findElement(EnterExpirationMonth);
	 SendText(EnterExpirationMonthElement,expirymonth);
 }
 public void EnterExpiryYear(String expiryyear)
 {
	 EnterExpirationYearElement=driver.findElement(EnterExpirationYear);
	 SendText(EnterExpirationYearElement,expiryyear);
 }
 public void ClickingPayAndConfirmOrder()
 {
	 PayAndConfirmOrderButtonElement=driver.findElement(PayAndConfirmOrderButton);
	 Clicking(PayAndConfirmOrderButtonElement);	 
 }
 public void ClickingDownloadInVoice()
 {
	 DownloadInvoiceButtonAfterPlacingOrderElement=driver.findElement(DownloadInvoiceButtonAfterPlacingOrder);
	 Clicking(DownloadInvoiceButtonAfterPlacingOrderElement);
 }
 public HomePage ClickingContinueAfterPlacingOrder()
 {
	 ContinueButtonAfterPlacingOrderElement=driver.findElement(ContinueButtonAfterPlacingOrder);
	 Clicking(ContinueButtonAfterPlacingOrderElement);
	 return new HomePage(driver);
 }
 public void VerifyingPaymentPage()
 {
 	Assert.assertTrue(driver.findElement(By.cssSelector("li[class=\"active\"]")).getText().contains("Payment"));
 }
 public void FillingPaymentInfo(String cardname,String cardnumber,String cvc,String expirymonth,String expiryyear)
 {
 	EnterNameOnCard(cardname);
 	EnterCardNumber(cardnumber);
 	EnterCVC(cvc);
 	EnterExpiryMonth(expirymonth);
 	EnterExpiryYear(expiryyear);
 }
 public void VerifyingOrderPlaced()
 {
 	Assert.assertTrue(driver.findElement(By.cssSelector("h2[class=\"title text-center\"]>b")).getText().contains("ORDER PLACED!"));
 }
 
}
