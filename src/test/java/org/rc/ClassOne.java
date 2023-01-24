package org.rc;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassOne extends BaseClass {
	public ClassOne() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class = 'fa fa fa-user']")
	private WebElement acc;
	
	@FindBy(id = "phone")
	private WebElement phn;
	
	@FindBy(id = "password")
	private WebElement pw;
	
	@FindBy(name = "login")
	private WebElement lg;

	public WebElement getAcc() {
		return acc;
	}

	public WebElement getPhn() {
		return phn;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getLg() {
		return lg;
	}
}
