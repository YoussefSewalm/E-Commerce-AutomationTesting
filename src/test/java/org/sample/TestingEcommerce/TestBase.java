package org.sample.TestingEcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
/**
 * Unit test for simple App.
 */

public class TestBase
{
	public static WebDriver driver; //mohem awy public static 3shan lma a3ml run l kol l suites m3 ba3d
	
	@BeforeTest
	public void Setup()
	{ 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	
	@AfterTest
	public void Quit()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
