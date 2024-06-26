package com.amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.TestPages.ProductPage;

public class ProductPageTest extends TestBase
{
 
  ProductPage Product;
  
  @BeforeMethod
  
  void setup()
  {
	  Initialization();
	  Product=new ProductPage();
  }
  
  public ProductPageTest()
  {
	  super();
  }
  
  @Test
  
  void VerifyTitle()
  {
	  String Title=Product.Verifytitle();
	  Assert.assertEquals(Title,"Apple iphone 13(128GB)-Blue");
  }
  
  @Test
  
  void VerifyProductPageLanding()
  {
	  boolean ElementVisible=Product.VerifyProductPage();
	  Assert.assertEquals(true,ElementVisible);
  }
  
  @AfterMethod
  
  void teradown()
  {
	  driver.quit();
  }
  
}
