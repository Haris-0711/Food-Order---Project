package org.stepdefinition;

import java.awt.AWTException;

import org.bs.BaseClass;
import org.rc.ClassFour;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioFour extends BaseClass {
	@Given("User launching the web browser")
	public void userLaunchingTheWebBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@When("User enters the testing website")
	public void userEntersTheTestingWebsite() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("Click the search icon")
	public void clickTheSearchIcon() throws InterruptedException {
		ClassFour c4 = new ClassFour();
		sleep();
		clickBtn(c4.getSrchicon());
	}

	@When("Search the Coke")
	public void searchTheCoke() throws AWTException {
		ClassFour c4 = new ClassFour();
		passingText("Coke", c4.getSrch());
		pressEnter();
		releaseEnter();
	}

	@Then("check the price")
	public void checkThePrice() throws InterruptedException {
		ClassFour c4 = new ClassFour();
		sleep();
		String r = c4.getRate().getText();
		System.out.println("The rate is : " + r);
	}

}
