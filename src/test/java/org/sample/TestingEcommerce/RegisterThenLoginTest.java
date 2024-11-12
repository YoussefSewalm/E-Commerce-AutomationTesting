package org.sample.TestingEcommerce;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class RegisterThenLoginTest extends TestBase {
	private HomePage homepage;
	private RegisterLoginPage registerloginpage;
	private RegisterPage registerpage;
	
	@DataProvider(name="RegData_1")
	public String [][] reg_data() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadRegData();
	}
		
	
	@Test(priority=3,dataProvider="RegData_1")
	public void RegisterUser(String initialname,String email,String regname,String pw,String day,String month,String year,String checknews,
			String checkoffers,String firstname,String lastname,String company,String address1,String address2,
			String country,String state,String city,String zipcode,String mobilenumber)
	{
		homepage=new HomePage(driver);
		registerloginpage=homepage.ClickingOnRegister();
        registerloginpage.FillingInitialSignUpInfo(initialname, email);
		registerpage=registerloginpage.ClickRegisterButton();
	    registerpage.FillingRegisterInfo(regname, pw, day, month, year, checknews, checkoffers, firstname, lastname, company, address1, address2, country, state, city, zipcode, mobilenumber);
		registerpage.ClickOnCreateAccount();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    registerpage.VerifyingAccountCreated();
		registerpage.ClickingOnContiniueAfterCreatingAccount();
        registerpage.VerifyingLoggedInAfterReg();
		homepage=new HomePage(driver);
		homepage.ClickingHomePage();
	}
	
	@DataProvider(name="LoginData_1")
	public String [][] login_data() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadLoginData();
	}
		
	
	@Test(priority=4,dependsOnMethods="RegisterUser",dataProvider="LoginData_1")
	public void LoginUserWithCorrectEmailAndPassword(String loginemail,String password)
	{
		homepage=new HomePage(driver);
		homepage.ClickingHomePage();
		homepage.ClickingLogOut();
		registerloginpage.FillingLoginInfo(loginemail, password);
		registerloginpage.ClickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        registerloginpage.VerifyingSuccessfulLogin();
		homepage.DeleteAccount();
		homepage.ClickingContinue();
	}

}
