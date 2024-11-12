package org.sample.TestingEcommerce;

import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homepage;
    
	

	@Test
	public void VerifySubscriptionInHomePage()
	{
		homepage=new HomePage(driver);
        homepage.EnterSubscriptionEmail("7amada20@gmail.com");
        homepage.ClickingSubscribeButton();
	}
	
}