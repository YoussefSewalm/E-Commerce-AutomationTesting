package org.sample.TestingEcommerce;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidRegisterWithAlreadyRegEmail extends TestBase{
	private HomePage homepage;
	private RegisterLoginPage registerloginpage;
	
	@DataProvider(name="Invalid Reg Data")
	public String [][] invalidreg_data() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadInvalidRegisterData();
	}
	@Test(dataProvider="Invalid Reg Data")
	public void RegisterUserWithExistingEmail(String name,String signupemail)
	{
		homepage=new HomePage(driver);
		registerloginpage=homepage.ClickingOnRegister();
	        registerloginpage.VerifyingRegLoginPage();
                registerloginpage.FillingInitialSignUpInfo(name, signupemail);
		registerloginpage.ClickRegisterButton();
                registerloginpage.VerifyingUnSuccessfulSignUp();
		registerloginpage.ClearingSignUpEmailText();
		registerloginpage.ClearingSignUpNameText();
	}

}
