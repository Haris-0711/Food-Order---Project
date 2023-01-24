package org.stepdefinition;

import org.bs.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.rc.ClassOne;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ScenarioOne extends BaseClass {
	@Given("To launch the browser")
	public void to_launch_the_browser() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("The user hit the testing site")
	public void the_user_hit_the_testing_site() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("User click the account button")
	public void user_click_the_account_button() throws InterruptedException {
		Thread.sleep(3000);
		ClassOne c1 = new ClassOne();
		clickBtn(c1.getAcc());
	}

	@When("User pass the wrong username")
	public void user_pass_the_wrong_username() throws InterruptedException {
		Thread.sleep(3000);
		ClassOne c1 = new ClassOne();
		passingText("9965678732", c1.getPhn());
	}

	@When("User pass the wrong password")
	public void user_pass_the_wrong_password() {
		ClassOne c1 = new ClassOne();
		passingText("abchpk123", c1.getPw());
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		ClassOne c1 = new ClassOne();
		clickBtn(c1.getLg());
	}

	@When("User checking result")
	public void user_checking_result() {
		WebElement text = driver.findElement(By.xpath("//ul[@role= 'alert']"));
		String al = text.getText();
	//	SoftAssert s = new SoftAssert();
	//	String title = driver.getTitle();
		//s.assertTrue(title.contains("Invaild"), "Recheck creditionals : " + al );
		//Assert.assertTrue(title.contains("fb"), "Recheck : " + al);
		System.out.println(al);
		
	}

}
