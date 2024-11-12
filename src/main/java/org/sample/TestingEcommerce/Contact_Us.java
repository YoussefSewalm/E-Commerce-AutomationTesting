package org.sample.TestingEcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Contact_Us extends Utility {

	public Contact_Us(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

   private By EnterContactUsName=By.cssSelector("div[class=\"form-group col-md-6\"]>input[name=\"name\"]");
   private By EnterContactUsEmail=By.cssSelector("div[class=\"form-group col-md-6\"]>input[name=\"email\"]");
   private By EnterContactUsSubject=By.cssSelector("div[class=\"form-group col-md-12\"]>input[name=\"subject\"]");
   private By EnterContactUsMessage=By.cssSelector("div[class=\"form-group col-md-12\"]>textarea[name=\"message\"]");
   private By ContactUsSubmitButton=By.cssSelector("div[class=\"form-group col-md-12\"]>input[name=\"submit\"]");
   
   private WebElement EnterContactUsNameElement;
   private WebElement EnterContactUsEmailElement;
   private WebElement EnterContactUsSubjectElement;
   private WebElement EnterContactUsMessageElement;
   private WebElement ContactUsSubmitButtonElement;
   
   public void EnterContactUsName(String contactusname)
   {
	   EnterContactUsNameElement=driver.findElement(EnterContactUsName);
	   SendText(EnterContactUsNameElement,contactusname); 
   }
   public void EnterContactUsEmail(String contactusemail)
   {
	   EnterContactUsEmailElement=driver.findElement(EnterContactUsEmail);
	   SendText(EnterContactUsEmailElement,contactusemail); 
   }
   public void EnterContactUsSubject(String contactussubject)
   {
	   EnterContactUsSubjectElement=driver.findElement(EnterContactUsSubject);
	   SendText(EnterContactUsSubjectElement,contactussubject); 
   }
   public void EnterContactUsMessage(String contactusmessage)
   {
	   EnterContactUsMessageElement=driver.findElement(EnterContactUsMessage);
	   SendText(EnterContactUsMessageElement,contactusmessage); 
   }
   public void ClickingSubmitContactUs()
   {
	   ContactUsSubmitButtonElement=driver.findElement(ContactUsSubmitButton);
       Clicking(ContactUsSubmitButtonElement);
       driver.switchTo().alert().accept();
   }
   public void VerifyingContactUsPage()
   {
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"col-sm-12\"]>h2[class=\"title text-center\"]")).getText().contains("CONTACT"));
   }
   public void FillingContactUsInfo(String contactusname,String ContactUsEmail,String ContactUsSubject,String message)
   {
		EnterContactUsName(contactusname);
	    EnterContactUsEmail(ContactUsEmail);
		EnterContactUsSubject(ContactUsSubject);
		EnterContactUsMessage(message);
   }
   public void VerifyingSuccessfulContacting()
   {
	    Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"status alert alert-success\"]")).getText().contains("Success! Your details have been submitted successfully"));
   }
}
