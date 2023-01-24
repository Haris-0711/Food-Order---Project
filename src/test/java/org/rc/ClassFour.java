package org.rc;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassFour extends BaseClass {
public ClassFour() {
	PageFactory.initElements(driver, this);
}

@FindBy(id = "lte-top-search-ico")
private WebElement srchicon;

@FindBy(xpath = "(//input[@placeholder = 'Search'])[2]")
private WebElement srch;

@FindBy(xpath = "(//span[@class = 'woocommerce-Price-amount amount'])[1]")

private WebElement rate;

public WebElement getSrchicon() {
	return srchicon;
}

public WebElement getSrch() {
	return srch;
}

public WebElement getRate() {
	return rate;
}

}
