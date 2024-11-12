package org.sample.TestingEcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCasesPageTest extends TestBase {
    HomePage homepage;
    
	

	@Test
	public void VerifyTestCasesPage()
	{
		homepage=new HomePage(driver);
		homepage.ClickingTestCases();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"col-sm-9 col-sm-offset-1\"]>h2>b")).getText().contains("CASES"));
		homepage.ClickingHomePage();
	}
}
