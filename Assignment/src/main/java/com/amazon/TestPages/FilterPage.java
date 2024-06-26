package com.amazon.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.TestBase.TestBase;

public class FilterPage extends TestBase
{
  @FindBy(xpath="//input[@id='p_36/range-slider_slider-item_lower-bound-slider']")
  WebElement Filter;
  
  @FindBy(xpath="//input[@id='p_36/range-slider_slider-item_lower-bound-slider']")
  WebElement Scroll;
  
  @FindBy(xpath="//span[contains(text(),'Price')]")
  WebElement Price;
  
  @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/span[1]/span[1]/input[1]")
  WebElement Go;
  
  
  public FilterPage()
  {
	  PageFactory.initElements(driver, this);
  }
  void clickonFilterLink()
  {
	  Filter.click();
  }
  
  public String Verifytitle()
  {
	  String Title=driver.getTitle();
	  return Title;
  }
  public FilterPage(String Title)
  {
  
	  Filter.click();
      Filter.sendKeys("Range");
      Go.click();
  }
  
  }
  
  
 
