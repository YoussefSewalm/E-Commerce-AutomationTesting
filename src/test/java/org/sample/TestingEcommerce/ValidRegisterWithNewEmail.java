package org.sample.TestingEcommerce;

import org.testng.annotations.Test;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;



public class ValidRegisterWithNewEmail extends TestBase {

	private HomePage homepage;
	private RegisterLoginPage registerloginpage;


	@DataProvider(name="Valid Reg Data")
	public String [][] mainlogin_data() throws InvalidFormatException, IOException
	{
		ReadDataFromExcel ReadData_1=new ReadDataFromExcel();
		return ReadData_1.ReadValidRegisterData();
	}
	
	@Test(dataProvider="Valid Reg Data")
	public void RegisterUserWithNewEmail(String name,String signupemail)
	{
		homepage=new HomePage(driver);
		registerloginpage=homepage.ClickingOnRegister();
        registerloginpage.FillingInitialSignUpInfo(name, signupemail);
		registerloginpage.ClickRegisterButton();
        registerloginpage.VerifyingSuccessfulInitialSignUp();
	}
}
