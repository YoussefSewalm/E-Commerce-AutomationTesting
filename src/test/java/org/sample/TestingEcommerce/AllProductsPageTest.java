package org.sample.TestingEcommerce;

import java.time.Duration;

import org.testng.annotations.Test;

public class AllProductsPageTest extends TestBase {

	HomePage homepage;
	AllProductsPage allproductspage;
	
	@Test(priority=1)
	public void VerifyingAllProductsPage()
	{
		homepage=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		allproductspage=homepage.ClickingProducts();
	}
	
	@Test(priority=2,dependsOnMethods="VerifyingAllProductsPage")
	public void VerifyingProductDetailsPage()
	{
		homepage=new HomePage(driver);
		allproductspage=homepage.ClickingProducts();
		allproductspage.ClickingViewProduct();
	}
	
	@Test(priority=3)
    public void SearchProduct()
    {
		homepage=new HomePage(driver);
		allproductspage=homepage.ClickingProducts();
		allproductspage.CheckingSearchingProduct("T-Shirt");
    }
	

}
