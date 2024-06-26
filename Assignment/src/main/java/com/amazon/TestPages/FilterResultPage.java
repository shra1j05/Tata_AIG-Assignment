package com.amazon.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.TestBase.TestBase;

public class FilterResultPage extends TestBase
{
  @FindBy(xpath="//span[contains(text(),'Galaxy M34 5G (Prism Silver,6GB,128GB)|120Hz sAMOL')]")
  WebElement Result;
  
  @FindBy(xpath="//span[contains(text(),'Results')]")
  WebElement Results;
  
  public FilterResultPage()
  {
	  PageFactory.initElements(driver, this);
  }
  void clickonFilterResultLink()
  {
	  Result.click();
  }
  
  public String Verifytitle() 
  {
	  String title=driver.getTitle();
	  return title;
  }
  public boolean VerifyFilterResultPage()
  {
	  boolean Resultis=Result.isDisplayed();
	  return Resultis;
	  
  }
}
