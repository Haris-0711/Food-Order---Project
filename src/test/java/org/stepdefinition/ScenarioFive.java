package org.stepdefinition;

import java.awt.AWTException;

import org.bs.BaseClass;
import org.rc.ClassFive;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioFive extends BaseClass {
	@Given("User launching the Chrome web browser")
	public void userLaunchingTheChromeWebBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@When("User hits the testing website")
	public void userHitsTheTestingWebsite() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("Click the search")
	public void clickTheSearch() throws InterruptedException {
		ClassFive c5 = new ClassFive();
		sleep();
		clickBtn(c5.getSrchicon());
	}

	@When("Search the Spanish Omelte")
	public void searchTheSpanishOmelte() throws AWTException {
		ClassFive c5 = new ClassFive();
		passingText("Spanish Omelet", c5.getSrch());
		pressEnter();
		releaseEnter();
	}

	@When("Click the Spanish Omelte")
	public void clickTheSpanishOmelte() throws InterruptedException {
		ClassFive c5 = new ClassFive();
		sleep();
		clickBtn(c5.getSobtn());
	}

	@When("Check the price before probability")
	public void checkThePriceBeforeProbability() throws InterruptedException {
		ClassFive c5 = new ClassFive();
		sleep();

		String r = c5.getPr().getText();
		System.out.println("\n The price before probability : " + r);
	}

	@When("Select and get the toppings option by probability")
	public void selectAndGetTheToppingsOptionByProbability() {
		ClassFive c5 = new ClassFive();
		clickBtn(c5.getT0());
		String t0 = c5.getT0().getText();

		clickBtn(c5.getT1());
		String t1 = c5.getT1().getText();

		clickBtn(c5.getT2());
		String t2 = c5.getT2().getText();

		System.out.printf("\n The probabilities are : " +  t0  +  t1  +  t2 );
	}

	@Then("Check the price after probability")
	public void checkThePriceAfterProbability() throws InterruptedException {
		ClassFive c5 = new ClassFive();
		sleep();

		String r1 = c5.getPr().getText();
		System.out.println("\n The price after probability : " + r1);
	}

}
