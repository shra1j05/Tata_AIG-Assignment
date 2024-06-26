package com.amazon.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.TestBase.TestBase;

public class LoginPage extends TestBase
{
  @FindBy(xpath="//input[@id='ap_email']")
  WebElement Email;
  
  @FindBy(xpath="//input[@id='continue']")
  WebElement Continue;
  
  @FindBy(xpath="//input[@id='continue']")
  WebElement GetOTP;
  
  @FindBy(xpath="//input[@id='cvf-input-code']")
  WebElement EnterOTP;
  
  @FindBy(xpath="//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/span[1]/span[1]/input[1]")
  WebElement Continue1;
  
  
  
  public LoginPage()
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void Login(int PhoneNumber,int OTP)
  {
	  Email.sendKeys("PhoneNumber");
	  
  }
  public LoginPage ClickonLogin() 
  {
	  Continue.click();
	  return new LoginPage();
  }
  public void Login(int OTP)
  {
	  EnterOTP.click();
	  EnterOTP.sendKeys("OTP");
	  Continue1.click();
	  
  }
  
  
}
