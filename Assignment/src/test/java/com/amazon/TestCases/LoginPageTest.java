package com.amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.TestPages.LoginPage;

public class LoginPageTest extends TestBase
{
  LoginPage Loginp;
  
  public LoginPageTest()
  {
	  super();
  }
  
  @BeforeMethod
  void setup()
  {
	  Initialization();
	  Loginp=new LoginPage();
  }
  
  @Test
  
  void VerifyvalidLogin()
  {
	  Loginp=Login.ClickonLoginPage();
	  Loginp.Login(prop.getProperty("PhoneNumber", "OTP"));
	  Assert.assertEquals("https://www.amazon.in/gp/buy/addressselect/handlers/display.html?_from=cheetah", "https://www.amazon.in/gp/buy/addressselect/handlers/display.html?_from=cheetah");
  }
  
  @AfterMethod
  
  void teradown()
  {
	  driver.quit();
  }
}

