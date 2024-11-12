package org.sample.TestingEcommerce;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidLogInAndLogOutTest extends TestBase {
	private HomePage homepage;
	private RegisterLoginPage registerloginpage;
	
	@DataProvider(name="MainLoginData")
	public String [][] mainlogin_data() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadMainLoginData();
	}
	
	@Test(dataProvider="MainLoginData")
	public void ValidLoginAndLogout(String loginemail,String pw)
	{
		homepage=new HomePage(driver);
		registerloginpage=homepage.ClickingOnRegister();
	    registerloginpage.VerifyingRegLoginPage();
		registerloginpage.ClearingLoginEmailText();
		registerloginpage.ClearingLoginPasswordText();
		registerloginpage.EnterLoginEmail(loginemail);
		registerloginpage.EnterPassword(pw);
		registerloginpage.ClickLoginButton();
        registerloginpage.VerifyingSuccessfulLogin();
		homepage.ClickingHomePage();
		homepage.ClickingLogOut();
	}


}
