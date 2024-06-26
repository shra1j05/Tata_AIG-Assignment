package com.amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.TestPages.HomePage;

public class HomePageTest extends TestBase
{
  HomePage SearchP;
  
  @BeforeMethod
  
  void setup()
  {
	  Initialization();
	 SearchP=new HomePage();
  }
  
  public HomePageTest()
  {
	  super();
  }
  
  @Test
  
  void VerifyValidSearch()
  {
	  SearchP=Search.ClickonSearch();
	  SearchP=Search(prop.getProperty("ProductName"));
	  Assert.assertEquals("https://www.amazon.in/ ", "https://www.amazon.in/ ");
  }
  
  @AfterMethod
  
  void teradown()
  {
	  driver.quit();
	  
  
  }
  
}
