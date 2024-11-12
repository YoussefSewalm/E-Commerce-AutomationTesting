package org.sample.TestingEcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage extends Utility{

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	private By GenderMaleSelect=By.id("id_gender1");
	private By GenderFemaleSelect=By.id("id_gender2");
	private By EnterRegisterName=By.id("name");
	private By EnterRegisterPassword=By.id("password");
	private By DaysDropMenu=By.id("days");
	private By MonthsDropMenu=By.id("months");
	private By YearsDropMenu=By.id("years");
	private By CheckNewsLetters=By.id("newsletter");
	private By CheckRecieveOffers=By.id("optin");
	
	private By EnterFirstName=By.id("first_name");
	private By EnterLastName=By.id("last_name");
	private By EnterCompanyName=By.id("company");
	private By EnterFirstAddress=By.id("address1");
	private By EnterSecondAddress=By.id("address2");
	private By CountryDropMenu=By.id("country");
	private By EnterState=By.id("state");
	private By EnterCity=By.id("city");
	private By EnterZipCode=By.id("zipcode");
	private By EnterMobileNumber=By.id("mobile_number");
	
	private By ContinueButtonAfterSignUp=By.cssSelector("a[class=\"btn btn-primary\"]");
	private By CreateAccountButton=By.xpath("//button[@data-qa=\"create-account\"]");
	
	private WebElement GenderMaleSelectElement;
	private WebElement GenderFemaleSelectElement;
	private WebElement EnterRegisterNameElement;
	private WebElement EnterRegisterPasswordElement;
	private WebElement DaysDropMenuElement;
	private WebElement MonthsDropMenuElement;
	private WebElement YearsDropMenuElement;
	private WebElement CheckNewsLettersElement;
	private WebElement CheckRecieveOffersElement;
	private WebElement EnterFirstNameElement;
	private WebElement EnterLastNameElement;
	private WebElement EnterCompanyNameElement;
	private WebElement EnterFirstAddressElement;
	private WebElement EnterSecondAddressElement;
	private WebElement CountryDropMenuElement;
	private WebElement EnterStateElement;
	private WebElement EnterCityElement;
	private WebElement EnterZipCodeElement;
	private WebElement EnterMobileNumberElement;
	private WebElement CreateAccountButtonElement;
	private WebElement ContinueButtonAfterSignUpElement;
	
	public void SelectMaleGender()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		GenderMaleSelectElement=driver.findElement(GenderMaleSelect);
		GenderMaleSelectElement.click();
	}
	public void SelectFemaleGender()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		GenderFemaleSelectElement=driver.findElement(GenderFemaleSelect);
		GenderFemaleSelectElement.click();
	}
	public void EnterRegName(String name)
	{
		EnterRegisterNameElement=driver.findElement(EnterRegisterName);
		EnterRegisterNameElement.clear();
		SendText(EnterRegisterNameElement,name);
	}
    public void EnterRegPassword(String password)
    {
    	EnterRegisterPasswordElement=driver.findElement(EnterRegisterPassword);
		SendText(EnterRegisterPasswordElement,password);
    }
    public void SelectDayOfBirth(String day)
    {
    	DaysDropMenuElement=driver.findElement(DaysDropMenu);
    	Select dropmenu_1=new Select(DaysDropMenuElement);
    	dropmenu_1.selectByVisibleText(day);
    }
    public void SelectMonthOfBirth(String month)
    {
    	MonthsDropMenuElement=driver.findElement(MonthsDropMenu);
    	Select dropmenu_2=new Select(MonthsDropMenuElement);
    	dropmenu_2.selectByVisibleText(month);
    }
    public void SelectYearOfBirth(String year)
    {
    	YearsDropMenuElement=driver.findElement(YearsDropMenu);
    	Select dropmenu_3=new Select(YearsDropMenuElement);
    	dropmenu_3.selectByVisibleText(year);
    }
    public void CheckNewsLetters(String checknews)
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	CheckNewsLettersElement=driver.findElement(CheckNewsLetters);
    	if(checknews=="CheckNews")
    	{
    		CheckNewsLettersElement.click();
    	}
    	else
    	{
    		//leave it default
    	}
    }
    public void CheckRecieveOffers(String checkoffers)
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	CheckRecieveOffersElement=driver.findElement(CheckRecieveOffers);
    	if(checkoffers=="CheckOffers")
    	{
    		CheckRecieveOffersElement.click();
    	}
    	else
    	{
    		//leave it default
    	}
    }
    public void EnterFirstName(String firstname)
    {
    	EnterFirstNameElement=driver.findElement(EnterFirstName);
    	SendText(EnterFirstNameElement,firstname);
    }
    public void EnterLastName(String lastname)
    {
    	EnterLastNameElement=driver.findElement(EnterLastName);
    	SendText(EnterLastNameElement,lastname);
    }
    public void EnterCompanyName(String companyname)
    {
    	EnterCompanyNameElement=driver.findElement(EnterCompanyName);
    	SendText(EnterCompanyNameElement,companyname);
    }
    public void EnterFirstAddress(String firstaddress)
    {
    	EnterFirstAddressElement=driver.findElement(EnterFirstAddress);
    	SendText(EnterFirstAddressElement,firstaddress);
    }
    public void EnterSecondAddress(String secondaddress)
    {
    	EnterSecondAddressElement=driver.findElement(EnterSecondAddress);
    	SendText(EnterSecondAddressElement,secondaddress);
    }
    public void SelectCountry(String country)
    {
    	CountryDropMenuElement=driver.findElement(CountryDropMenu);
    	Select dropmenu_4=new Select(CountryDropMenuElement);
    	dropmenu_4.selectByVisibleText(country);
    }
    public void EnterState(String state)
    {
    	EnterStateElement=driver.findElement(EnterState);
    	SendText(EnterStateElement,state);
    }
    public void EnterCity(String city)
    {
    	EnterCityElement=driver.findElement(EnterCity);
    	SendText(EnterCityElement,city);
    }
    public void EnterZipCode(String zipcode)
    {
    	EnterZipCodeElement=driver.findElement(EnterZipCode);
    	SendText(EnterZipCodeElement,zipcode);
    }
    public void EnterMobileNumber(String mobilenumber)
    {
    	EnterMobileNumberElement=driver.findElement(EnterMobileNumber);
    	SendText(EnterMobileNumberElement,mobilenumber);
    }
    public void ClickOnCreateAccount()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	CreateAccountButtonElement=driver.findElement(CreateAccountButton);
    	CreateAccountButtonElement.click();
    }
    public void ClickingOnContiniueAfterCreatingAccount()
    {
    	ContinueButtonAfterSignUpElement=driver.findElement(ContinueButtonAfterSignUp);
    	Clicking(ContinueButtonAfterSignUpElement);
    }
    public void FillingRegisterInfo(String regname,String pw,String day,String month,String year,String checknews,
			String checkoffers,String firstname,String lastname,String company,String address1,String address2,
			String country,String state,String city,String zipcode,String mobilenumber)
    {
		SelectMaleGender();
		EnterRegName(regname);
		EnterRegPassword(pw);
		SelectDayOfBirth(day);
		SelectMonthOfBirth(month);
		SelectYearOfBirth(year);
		CheckNewsLetters(checknews);
		CheckRecieveOffers(checkoffers);
		EnterFirstName(firstname);
		EnterLastName(lastname);
		EnterCompanyName(company);
		EnterFirstAddress(address1);
		EnterSecondAddress(address2);
		SelectCountry(country);
		EnterState(state);
		EnterCity(city);
		EnterZipCode(zipcode);
		EnterMobileNumber(mobilenumber);
    }
    public void VerifyingAccountCreated()
    {
		String expected_1="ACCOUNT CREATED!";
		String actual_1=driver.findElement(By.cssSelector("h2[class=\"title text-center\"]>b")).getText();
		Assert.assertEquals(actual_1, expected_1);
    }
    public void VerifyingLoggedInAfterReg()
    {
    	Assert.assertTrue(driver.findElement(By.xpath("//li[10]/a")).getText().contains("Logged in as"));
    }
}
