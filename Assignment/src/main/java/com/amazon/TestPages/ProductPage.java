package com.amazon.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.TestBase.TestBase;

public class ProductPage extends TestBase
{
  @FindBy(xpath="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[2]")
  WebElement Product;
  
  
  public ProductPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  void clickonProductLink()
  {
	  Product.click();
  }
  public String Verifytitle()
  {
	  String title =driver.getTitle();
	  return title;
  }
  public boolean VerifyProductPage()
  {
	  boolean Productis =Product.isDisplayed();
	  return Productis;
  }
  
}
