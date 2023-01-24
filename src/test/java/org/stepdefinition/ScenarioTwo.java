package org.stepdefinition;

import org.bs.BaseClass;
import org.rc.ClassTwo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ScenarioTwo extends BaseClass {
	@Given("To launch the web browser")
	public void toLaunchTheWebBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@When("To hit the website")
	public void toHitTheWebsite() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("User hit the dosa icon")
	public void userHitTheDosaIcon() throws InterruptedException {
		ClassTwo c2 = new ClassTwo();

		scrollPageTop(c2.getDicon());
		Thread.sleep(3000);
		jsClick(c2.getDicon());
	}

	@When("User then click the Masal dosa")
	public void userThenClickTheMasalDosa() throws InterruptedException {
		ClassTwo c2 = new ClassTwo();
		Thread.sleep(3000);

		clickBtn(c2.getMicon());

		Thread.sleep(3000);
	}

	@When("User checking the available time")
	public void userCheckingTheAvailableTime() throws InterruptedException {
		ClassTwo c2 = new ClassTwo();
		Thread.sleep(3000);
		String at = c2.getTime().getText();
		System.out.println(at);
	}
}
