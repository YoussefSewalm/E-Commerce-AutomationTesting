package org.sample.TestingEcommerce;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ContactUsTest extends TestBase{
	
	HomePage homepage;
	Contact_Us contact_us;
	
	@DataProvider(name="Contact Us Content")
	public String [][] contactuscontent() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadContactUsContent();
	}
	@Test(dataProvider="Contact Us Content")
	public void ContactUsForm(String contactusname,String ContactUsEmail,String ContactUsSubject,String message)
	{
		homepage=new HomePage(driver);
		contact_us=homepage.ClickingContactUs();
                contact_us.VerifyingContactUsPage();
                contact_us.FillingContactUsInfo(contactusname, ContactUsEmail, ContactUsSubject, message);
		contact_us.ClickingSubmitContactUs();
                contact_us.VerifyingSuccessfulContacting();
	        homepage.ClickingHomePage();
	}

}
