package org.sample.TestingEcommerce;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductDetailsTest extends TestBase{
	
	HomePage homepage;
	AllProductsPage allproductspage;
	ProductDetailsPage productdetailspage;
	
	@DataProvider(name="Review Content")
	public String [][] reviewcontent() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadReviewContent();
	}
    @Test(priority=1,dataProvider="Review Content")
	public void AddReviewOnProduct(String reviewname,String reviewemail,String reviewmessage)
	{
    	homepage=new HomePage(driver);
    	allproductspage=homepage.ClickingProducts();
    	productdetailspage=allproductspage.ClickingViewProduct();
    	productdetailspage.EnterReviewNameElement(reviewname);
    	productdetailspage.EnterReviewEmailElement(reviewemail);
    	productdetailspage.EnterReviewMessageElement(reviewmessage);
    	productdetailspage.ClickingSubmitReview();
	}

}
