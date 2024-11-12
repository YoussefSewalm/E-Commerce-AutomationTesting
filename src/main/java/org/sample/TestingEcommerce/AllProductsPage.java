package org.sample.TestingEcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AllProductsPage extends Utility {

	public AllProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
  private By ViewProductButtonFirstProduct=By.cssSelector("a[href=\"/product_details/1\"]");
  private By AddToCartButtonFirstProduct=By.cssSelector("div[class=\"productinfo text-center\"]>a[data-product-id=\"1\"]");
  private By AddToCartButtonSecondProduct=By.cssSelector("div[class=\"productinfo text-center\"]>a[data-product-id=\"2\"]");
  private By EnterProductSearch=By.cssSelector("input[name=\"search\"]");
  private By SearchProductButton=By.cssSelector("button[id=\"submit_search\"]");
  private By ContinueShoppingButton=By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[3]/button");
  private By ViewCartButton=By.cssSelector("p[class=\"text-center\"]>a");
  private By RemoveFirstItem=By.xpath("/html/body/section/div/div[2]/table/tbody/tr[1]/td[6]/a");
  private By RemoveSecondItem=By.xpath("/html/body/section/div/div[2]/table/tbody/tr[2]/td[6]/a");
//tr[@id="product-1"]/td[@class="cart_delete"]/a
  private WebElement ViewProductButtonElement;
  private WebElement AddToCartButtonFirstProductElement;
  private WebElement EnterProductSearchElement;
  private WebElement SearchProductButtonElement;
  private WebElement AddToCartButtonSecondProductElement;
  private WebElement ContinueShoppingButtonElement;
  private WebElement ViewCartButtonElement;
  private WebElement RemoveFirstItemElement;
  private WebElement RemoveSecondItemElement;

  public ProductDetailsPage ClickingViewProduct() 
  {
	  ViewProductButtonElement=driver.findElement(ViewProductButtonFirstProduct);
	  Clicking(ViewProductButtonElement);
	  boolean expected_14=true;
	  boolean actual_14=driver.findElement(By.cssSelector("div[class=\"product-information\"]>h2")).isDisplayed();
	  Assert.assertEquals(actual_14, expected_14);
	  boolean expected_15=true;
	  boolean actual_15=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")).isDisplayed();
	  Assert.assertEquals(actual_15, expected_15);
	  boolean expected_16=true;
	  boolean actual_16=driver.findElement(By.cssSelector("div[class=\"product-information\"]>span>span")).isDisplayed();
	  Assert.assertEquals(actual_16, expected_16);
	  boolean expected_17=true;
	  boolean actual_17=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b")).isDisplayed();
	  Assert.assertEquals(actual_17, expected_17);
	  boolean expected_18=true;
	  boolean actual_18=driver.findElement(By.xpath("//p[3]")).isDisplayed();
	  Assert.assertEquals(actual_18, expected_18);
	  boolean expected_19=true;
	  boolean actual_19=driver.findElement(By.xpath("//p[4]")).isDisplayed();
	  Assert.assertEquals(actual_19, expected_19);
	  return new ProductDetailsPage(driver);
  }
  public void CheckingSearchingProduct(String product)
  {
	  EnterProductSearchElement=driver.findElement(EnterProductSearch);
	  SendText(EnterProductSearchElement,product);
	  SearchProductButtonElement=driver.findElement(SearchProductButton);
	  Clicking(SearchProductButtonElement);
	  boolean expected_20=true;
	  boolean actual_20=driver.findElement(By.cssSelector("div[class=\"features_items\"]>h2")).getText().contains("SEARCHED PRODUCTS");
	  Assert.assertEquals(actual_20, expected_20);
	  boolean expected_21=true;
	  boolean actual_21=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p")).getText().contains(product);
	  Assert.assertEquals(actual_21, expected_21);
  }
  public void ClickingAddToCartForFirstProduct()
  {
	  AddToCartButtonFirstProductElement=driver.findElement(AddToCartButtonFirstProduct);
	  Clicking(AddToCartButtonFirstProductElement);
	  new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Added!"));
  }
  public void ClickingAddToCartForSecondProduct()
  {
	  AddToCartButtonSecondProductElement=driver.findElement(AddToCartButtonSecondProduct);
	  Clicking(AddToCartButtonSecondProductElement);
	  new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.textToBe(By.cssSelector("div[class=\"modal-header\"]>h4"), "Added!"));
;
  }
	public void ClickingContinueShopping()
	{
		ContinueShoppingButtonElement=driver.findElement(ContinueShoppingButton);
		Clicking(ContinueShoppingButtonElement);
	}
	public CartPage ClickingViewCart()
	{
		ViewCartButtonElement=driver.findElement(ViewCartButton);
		Clicking(ViewCartButtonElement);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expected_27="Shopping Cart";
		String actual_27=driver.findElement(By.cssSelector("ol[class=\"breadcrumb\"]>li[class=\"active\"]")).getText();
		Assert.assertEquals(actual_27, expected_27);
		String expected_28="Rs. 500";//Total Price
		String actual_28=driver.findElement(By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_total\"]/p")).getText();
		Assert.assertEquals(actual_28, expected_28);
		String expected_29="Rs. 500";//Cart Price
		String actual_29=driver.findElement(By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_price\"]/p")).getText();
		Assert.assertEquals(actual_29, expected_29);
		String expected_30="1";//Quantity
		String actual_30=driver.findElement(By.xpath("//tr[@id=\"product-1\"]/td[@class=\"cart_quantity\"]/button")).getText();
		Assert.assertEquals(actual_30, expected_30);
		String expected_31="Rs. 400";//Total Price
		String actual_31=driver.findElement(By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_total\"]/p")).getText();
		Assert.assertEquals(actual_31, expected_31);
		String expected_32="Rs. 400";//Cart Price
		String actual_32=driver.findElement(By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_price\"]/p")).getText();
		Assert.assertEquals(actual_32, expected_32);
		String expected_33="1";//Quantity
		String actual_33=driver.findElement(By.xpath("//tr[@id=\"product-2\"]/td[@class=\"cart_quantity\"]/button")).getText();
		Assert.assertEquals(actual_33, expected_33);
		return new CartPage(driver);
	}
	public void DeletingFirstItem()
	{
		RemoveFirstItemElement=driver.findElement(RemoveFirstItem);
		Clicking(RemoveFirstItemElement);
	}
	public void DeletingSecondtItem()
	{
		RemoveSecondItemElement=driver.findElement(RemoveSecondItem);
		Clicking(RemoveSecondItemElement);
		WebElement element_1=driver.findElement(By.cssSelector("span[id=\"empty_cart\"]>p>b"));
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element_1));
	}
	
}
