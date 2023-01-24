package org.rc;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassFive extends BaseClass {
      public ClassFive() {
    	  PageFactory.initElements(driver, this);
	}
      @FindBy(id = "lte-top-search-ico")
      private WebElement srchicon;

      @FindBy(xpath = "(//input[@placeholder = 'Search'])[2]")
      private WebElement srch; 
      
      @FindBy(xpath = "//h2[text() = 'Spanish omelet']")
      private WebElement sobtn;
      
      @FindBy(xpath = "(//span[@class = 'woocommerce-Price-amount amount'])[1]")
      private WebElement pr;
      
      @FindBy(xpath = "//label[@for = 'top0']")
      private WebElement t0;
      
      @FindBy(xpath = "//label[@for = 'top1']")
      private WebElement t1;
      
      @FindBy(xpath = "//label[@for = 'top2']")
      private WebElement t2;

	public WebElement getSrchicon() {
		return srchicon;
	}

	public WebElement getSrch() {
		return srch;
	}

	public WebElement getSobtn() {
		return sobtn;
	}

	public WebElement getPr() {
		return pr;
	}

	public WebElement getT0() {
		return t0;
	}

	public WebElement getT1() {
		return t1;
	}

	public WebElement getT2() {
		return t2;
	}
      
      
}
