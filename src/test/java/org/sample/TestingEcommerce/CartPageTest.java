package org.sample.TestingEcommerce;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CartPageTest extends TestBase{
	HomePage homepage;
	AllProductsPage allproductspage;
	ProductDetailsPage productdetailspage;
	CartPage cartpage;
    RegisterLoginPage registerloginpage;
    RegisterPage registerpage;
	CheckOutPage checkoutpage;
	PaymentPage paymentpage;
	

	@DataProvider(name="Payment After Reg_1")
	public String [][] paymentafterreg_1() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadPaymentAfterRegData_1();
	}
    @Test(priority=1,dataProvider="Payment After Reg_1")
    public void PlaceOrderRegisterwhileCheckout(String initialname,String email,String regname,String pw,String day,String month,String year,String checknews,
			String checkoffers,String firstname,String lastname,String company,String address1,String address2,
			String country,String state,String city,String zipcode,String mobilenumber,String cardname,
			String cardnumber,String cvc,String expirymonth,String expiryyear
			)
    {
    	homepage=new HomePage(driver);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    	allproductspage=homepage.ClickingProducts();
    	productdetailspage=allproductspage.ClickingViewProduct();
    	productdetailspage.EnteringProductQuantity("4");
    	productdetailspage.ClickingAddToCartFromProductDetails();
    	new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Added!"));
    	cartpage=productdetailspage.ClickingViewCart();
    	cartpage.ClickingProceedToCheckOut();
    	new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Checkout"));
		registerloginpage=cartpage.ClickingRegisterOrLoginFromCartPageAfterCheckOut();
        registerloginpage.FillingInitialSignUpInfo(initialname, email);
		registerpage=registerloginpage.ClickRegisterButton();
	    registerpage.FillingRegisterInfo(regname, pw, day, month, year, checknews, checkoffers, firstname, lastname, company, address1, address2, country, state, city, zipcode, mobilenumber);
		registerpage.ClickOnCreateAccount();
        registerpage.VerifyingAccountCreated();
		registerpage.ClickingOnContiniueAfterCreatingAccount();
		registerpage.VerifyingLoggedInAfterReg();
    	cartpage=homepage.ClickingCartButton();
    	checkoutpage=cartpage.ClickingProceedToCheckOut();	
        checkoutpage.CheckingAdressDetails();
    	checkoutpage.EnterOrderComment("Hyrahaerar");
    	paymentpage=checkoutpage.ClickingPlaceOrder();
        paymentpage.VerifyingPaymentPage();
        paymentpage.FillingPaymentInfo(cardname, cardnumber, cvc, expirymonth, expiryyear);
    	paymentpage.ClickingPayAndConfirmOrder();
        paymentpage.VerifyingOrderPlaced();
    	homepage=paymentpage.ClickingContinueAfterPlacingOrder();
    	homepage.DeleteAccount();
    	homepage.ClickingContinue();
    }
    
	@DataProvider(name="Payment After Reg_2")
	public String [][] paymentafterreg_2() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadPaymentAfterRegData_2();
	}
    @Test(priority=2,dataProvider="Payment After Reg_2")
    public void PlaceOrderRegisterBeforeCheckout(String initialname,String email,String regname,String pw,String day,String month,String year,String checknews,
			String checkoffers,String firstname,String lastname,String company,String address1,String address2,
			String country,String state,String city,String zipcode,String mobilenumber,String cardname,
			String cardnumber,String cvc,String expirymonth,String expiryyear
			)
    {
		homepage=new HomePage(driver);
		registerloginpage=homepage.ClickingOnRegister();
        registerloginpage.FillingInitialSignUpInfo(initialname, email);
		registerpage=registerloginpage.ClickRegisterButton();
	    registerpage.FillingRegisterInfo(regname, pw, day, month, year, checknews, checkoffers, firstname, lastname, company, address1, address2, country, state, city, zipcode, mobilenumber);
		registerpage.ClickOnCreateAccount();
        registerpage.VerifyingAccountCreated();
		registerpage.ClickingOnContiniueAfterCreatingAccount();
    	registerpage.VerifyingLoggedInAfterReg();
    	allproductspage=homepage.ClickingProducts();
    	productdetailspage=allproductspage.ClickingViewProduct();
    	productdetailspage.EnteringProductQuantity("4");
    	productdetailspage.ClickingAddToCartFromProductDetails();
    	new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Added!"));
    	cartpage=productdetailspage.ClickingViewCart();
    	checkoutpage=cartpage.ClickingProceedToCheckOut();
        checkoutpage.CheckingAdressDetails();
    	checkoutpage.EnterOrderComment("Hyrahaerar");
    	paymentpage=checkoutpage.ClickingPlaceOrder();
        paymentpage.VerifyingPaymentPage();
        paymentpage.FillingPaymentInfo(cardname, cardnumber, cvc, expirymonth, expiryyear);
    	paymentpage.ClickingPayAndConfirmOrder();
        paymentpage.VerifyingOrderPlaced();
    	homepage=paymentpage.ClickingContinueAfterPlacingOrder();
    	homepage.DeleteAccount();
    	homepage.ClickingContinue();
    }
	@DataProvider(name="Payment Already Loggedin")
	public String [][] paymentalreadylogged() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadPaymentAlreadyLogin();
	}
    @Test(priority=3,dataProvider="Payment Already Loggedin")
    public void PlaceOrderLoginBeforeCheckout(String loginemail,String pw,String cardname,
			String cardnumber,String cvc,String expirymonth,String expiryyear)
			
    {
		homepage=new HomePage(driver);
		registerloginpage=homepage.ClickingOnRegister();
		registerloginpage.FillingLoginInfo(loginemail, pw);
	    registerloginpage.ClickLoginButton();
        registerloginpage.VerifyingSuccessfulLogin();
    	allproductspage=homepage.ClickingProducts();
    	productdetailspage=allproductspage.ClickingViewProduct();
    	productdetailspage.EnteringProductQuantity("4");
    	productdetailspage.ClickingAddToCartFromProductDetails();
        new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Added!"));
    	cartpage=productdetailspage.ClickingViewCart();
    	checkoutpage=cartpage.ClickingProceedToCheckOut();
        checkoutpage.CheckingAdressDetails();
    	checkoutpage.EnterOrderComment("Hyrahaerar");
    	paymentpage=checkoutpage.ClickingPlaceOrder();
        paymentpage.VerifyingPaymentPage();
        paymentpage.FillingPaymentInfo(cardname, cardnumber, cvc, expirymonth, expiryyear);
    	paymentpage.ClickingPayAndConfirmOrder();
        paymentpage.VerifyingOrderPlaced();
    	homepage=paymentpage.ClickingContinueAfterPlacingOrder();
    	registerloginpage=homepage.ClickingLogOut();
    	homepage.ClickingHomePage();
    }
    
	@DataProvider(name="Payment After Reg_3")
	public String [][] paymentafterreg_3() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadPaymentAfterRegData_3();
	}
    @Test(priority=4,dataProvider="Payment After Reg_3")
    public void DownloadInvoiceAfterPurchase(String initialname,String email,String regname,String pw,String day,String month,String year,String checknews,
			String checkoffers,String firstname,String lastname,String company,String address1,String address2,
			String country,String state,String city,String zipcode,String mobilenumber,String cardname,
			String cardnumber,String cvc,String expirymonth,String expiryyear
			)
    {
    	homepage=new HomePage(driver);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    	allproductspage=homepage.ClickingProducts();
    	productdetailspage=allproductspage.ClickingViewProduct();
    	productdetailspage.EnteringProductQuantity("4");
    	productdetailspage.ClickingAddToCartFromProductDetails();
    	new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Added!"));
    	cartpage=productdetailspage.ClickingViewCart();
    	cartpage.ClickingProceedToCheckOut();
    	new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Checkout"));
		registerloginpage=cartpage.ClickingRegisterOrLoginFromCartPageAfterCheckOut();
        registerloginpage.FillingInitialSignUpInfo(initialname, email);
		registerpage=registerloginpage.ClickRegisterButton();
		registerpage.FillingRegisterInfo(regname, pw, day, month, year, checknews, checkoffers, firstname, lastname, company, address1, address2, country, state, city, zipcode, mobilenumber);
		registerpage.ClickOnCreateAccount();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        registerpage.VerifyingAccountCreated();
		registerpage.ClickingOnContiniueAfterCreatingAccount();
        registerpage.VerifyingLoggedInAfterReg();
    	cartpage=homepage.ClickingCartButton();
    	checkoutpage=cartpage.ClickingProceedToCheckOut();	
        checkoutpage.CheckingAdressDetails();
    	checkoutpage.EnterOrderComment("Hyrahaerar");
    	paymentpage=checkoutpage.ClickingPlaceOrder();
        paymentpage.VerifyingPaymentPage();
        paymentpage.FillingPaymentInfo(cardname, cardnumber, cvc, expirymonth, expiryyear);
    	paymentpage.ClickingPayAndConfirmOrder();
        paymentpage.VerifyingOrderPlaced();
        paymentpage.ClickingDownloadInVoice();
        homepage=paymentpage.ClickingContinueAfterPlacingOrder();
    	homepage.DeleteAccount();
    	homepage.ClickingContinue();
    }
    @Test(priority=5)
    public void VerifySubscriptionInCartPage()
    {
    	homepage=new HomePage(driver);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        cartpage=homepage.ClickingCartButton();
        cartpage.EnterSubscriptionEmailFromCart("7amada100@gmail.com");
        cartpage.ClickingSubscribeFromCart();    	
    }
    
    @Test(priority=6)
    public void AddProductsInCart()
    {
		homepage=new HomePage(driver);
		allproductspage=homepage.ClickingProducts();
		allproductspage.ClickingAddToCartForFirstProduct();	 
		allproductspage.ClickingContinueShopping();
		allproductspage.ClickingAddToCartForSecondProduct();
		allproductspage.ClickingViewCart();
		allproductspage.DeletingFirstItem();
		allproductspage.DeletingSecondtItem();	
    }
}
