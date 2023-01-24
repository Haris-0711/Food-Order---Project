package org.stepdefinition;

import org.bs.BaseClass;
import org.openqa.selenium.By;
import org.rc.ClassThree;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioThree extends BaseClass {
	@Given("launching the web browser")
	public void launchingTheWebBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@When("To hit the testing website")
	public void toHitTheTestingWebsite() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("I click the account button")
	public void iClickTheAccountButton() throws InterruptedException {
		ClassThree c3 = new ClassThree();
		sleep();
		clickBtn(c3.getAcc());
	}

	@When("User pass the Name")
	public void userPassTheName() throws InterruptedException {
		sleep();
		ClassThree c3 = new ClassThree();
		passingText("Harish", c3.getNm());
	}

	@When("User pass the Mail")
	public void userPassTheMail() {
		ClassThree c3 = new ClassThree();
		passingText("abc@gmail.com", c3.getMail());
	}

	@When("User pass the Phnno")
	public void userPassThePhnno() {
		ClassThree c3 = new ClassThree();
		passingText("9965677327", c3.getPhn());
	}

	@When("User pass the Password")
	public void userPassThePassword() {
		ClassThree c3 = new ClassThree();
		passingText("12345678", c3.getPw());
	}

	@When("User click the register button")
	public void userClickTheRegisterButton() {
		ClassThree c3 = new ClassThree();
		clickBtn(c3.getLg());
	}

	@Then("User Get the Pop Up")
	public void userGetThePopUp() {
		String msg = driver.findElement(By.id("con_password_reg")).getAttribute("validationMessage");
		System.out.println(msg);
	}

}
