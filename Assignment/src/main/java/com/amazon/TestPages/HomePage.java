package com.amazon.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.TestBase.TestBase;

public class HomePage extends TestBase
{
  
	  @FindBy(xpath="//input[@id='twotabsearchtextbox']")
	  WebElement Search;
	  
	  @FindBy(xpath="//input[@id='nav-search-submit-button']")
	  WebElement SubmitButton;
	  
	  public HomePage() 
	  {
		  PageFactory.initElements(driver,this);
	  }
	  
	  void clickonSeachLink()
	  {
		  Search.click();
	  }
	  public void Search(String ProductName)
	  {
		  Search.sendKeys(ProductName);
		  SubmitButton.click();
	  }
	  
	  
  }
  

