package com.amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.TestPages.FormPage;

public class FormPageTest extends TestBase
{
  FormPage Form;
  
  
  @BeforeMethod
  
  void setup()
  {
	  Initialization();
	  Form=new FormPage();
  }
  
  public FormPageTest()
  {
	  super();
  }
  
  @Test
  
  void VerifyTitle()
  {
	  String Title=Form.Verifytitle();
	  Assert.assertEquals(Title, "Checkout");
  }
  
  @Test
  
  void VerifyPlacedOrderPageLbanding()
  {
	  
	  boolean ElementVisible=Form.FormPage();
	  Assert.assertSame(true, Form);
  }
}
