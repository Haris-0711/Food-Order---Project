package org.rc;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassTwo extends BaseClass{

	public ClassTwo() {
	PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath = "//h6[text() = 'Dosa']")
	private WebElement dicon;
	
	@FindBy(xpath = "//h2[text() = 'Masala Dosa']")
	private WebElement micon;
	
	@FindBy(xpath = "(//span[@style = 'padding: 5px 10px;border: 1px solid #e7e7e7;font-size: 12px;'])[1]")
	private WebElement time;

	public WebElement getDicon() {
		return dicon;
	}

	public WebElement getMicon() {
		return micon;
	}

	public WebElement getTime() {
		return time;
	}
	
}