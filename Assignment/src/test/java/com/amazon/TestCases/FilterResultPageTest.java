package com.amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.TestPages.FilterResultPage;

public class FilterResultPageTest extends TestBase
{
 FilterResultPage Result;
 
 @BeforeMethod
 
 void setup() 
 {
	 Initialization();
	 Result=new FilterResultPage();
 }
 
 public FilterResultPageTest()
 {
	 super();
 }
 
 @Test
 
 void VerifyTitle()
 {
	 String Title=Result.Verifytitle();
	 Assert.assertEquals(Title, "Samsung Galaxy S34 5G");
 }
 @AfterMethod
 
 void teradown()
 {
	 driver.quit();
 }
  
}
