package org.rc;

import org.bs.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassThree extends BaseClass {
	
	public ClassThree() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//i[@class = 'fa fa fa-user']")
	private WebElement acc;
	
	@FindBy(name = "name")
	private WebElement nm;
	
	@FindBy(name = "email")
	private WebElement mail;
	
	@FindBy(xpath = "(//input[@autocomplete = 'phone' ])[2]")
	private WebElement phn;
	
	@FindBy(xpath = "(//input[@autocomplete = 'current-password' ])[2]")
	private WebElement pw;


	@FindBy(xpath = "(//button[@type = 'submit'])[2]")
	private WebElement lg;


	public WebElement getAcc() {
		return acc;
	}


	public WebElement getNm() {
		return nm;
	}


	public WebElement getMail() {
		return mail;
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
