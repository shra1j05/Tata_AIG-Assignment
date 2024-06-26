package com.amazon.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.TestBase.TestBase;

public class FormPage extends TestBase
{
  @FindBy(xpath="//a[@id='add-new-address-popover-link']")
  WebElement Address;
  
  @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
  WebElement FName;
  
  @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
  WebElement MNumber;
  
  @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
  WebElement PinCode;
  
  @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
  WebElement HNo;
  
  @FindBy(css="#address-ui-widgets-enterAddressLine2")
  WebElement Area;
  
  @FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
  WebElement Landmark;
  
  @FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
  WebElement City;
  
  @FindBy(xpath="//span[contains(text(),'Choose a state')]")
  WebElement State; 
  
  @FindBy(xpath="//body/div[8]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/span[3]/span[1]/span[1]/input[1]")
  WebElement UseAdd;
  
  @FindBy(xpath="//input[@id='pp-aq0zYo-140']")
  WebElement PaymentMethod;
  
  @FindBy(xpath="//body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]")
  WebElement Usethis;
  
  @FindBy(xpath="//body/div[@id='a-page']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[1]/input[1]")
  WebElement PlaceOrder;
  
  public FormPage()
  {
	  
	  PageFactory.initElements(driver, this);
  }
  void clickonPageLink()
  {
	  Address.click();
	  Address.sendKeys("address");
	  
	  FName.click();
	  FName.sendKeys("firstname");
	  
	  MNumber.click();
	  MNumber.sendKeys("phone");
	  
	  PinCode.click();
	  PinCode.sendKeys("Pcode");
	  
	  HNo.click();
	  HNo.sendKeys("HomeNo");
	  
	  Area.click();
	  Area.sendKeys("Village");
	  
	  Landmark.click();
	  Landmark.sendKeys("Land");
	  
	  City.click();
	  City.sendKeys("CityN");
	  
	  State.click();
	  Select mlt=new Select(State);
      mlt.deselectByVisibleText("MAHARASHTRA");
      
      UseAdd.click();
      
      
      PaymentMethod.click();
      Usethis.click();
      
      
      
  }
   public String Verifytitle()
   {
	   String title=driver.getTitle();
	   return title;
   }
   
   public boolean FormPage()
   {
	   boolean formis=Address.isDisplayed();
	   return formis;
}
  
  
  
  public FormPage ClickonPlacedOrder()
 
  {
	  PlaceOrder.click();
	  return new FormPage();
      
  }
  
}

  
 
