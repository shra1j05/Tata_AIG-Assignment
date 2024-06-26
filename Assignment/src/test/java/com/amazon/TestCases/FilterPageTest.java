package com.amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.TestPages.FilterPage;

public class FilterPageTest extends TestBase
{
  
FilterPage Filter;

@BeforeMethod

void setup()
{
	Initialization();
	Filter=new FilterPage();
}

public FilterPageTest()
{
	super();
	
}

@Test

void VerifyRange()
{
	String Title=Filter.Verifytitle();
	Assert.assertEquals(Title, "Price");
}

@AfterMethod

void teradown() 
{
	driver.quit();
	
}
}
