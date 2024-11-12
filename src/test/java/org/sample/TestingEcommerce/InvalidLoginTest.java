package org.sample.TestingEcommerce;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLoginTest extends TestBase{
	private HomePage homepage;
	private RegisterLoginPage registerloginpage;
	
	@DataProvider(name="Invalid Login Data")
	public String [][] mainlogin_data() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadInvalidLoginData();
	}
	@Test(dataProvider="Invalid Login Data")
	public void LoginWithIncorrectEmailAndPassword(String loginemail,String pw)
	{
		homepage=new HomePage(driver);
		registerloginpage=homepage.ClickingOnRegister();
                registerloginpage.VerifyingRegLoginPage();
		registerloginpage.EnterLoginEmail(loginemail);
		registerloginpage.EnterPassword(pw);
		registerloginpage.ClickLoginButton();
                registerloginpage.VerifyingUnSuccessfulLogin();
	}
}
