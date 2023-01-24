$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/Project.feature");
formatter.feature({
  "name": "As a user i want to order the food",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user gives the invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case1"
    }
  ]
});
formatter.step({
  "name": "To launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioOne.to_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user hit the testing site",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOne.the_user_hit_the_testing_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the account button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOne.user_click_the_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the wrong username",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOne.user_pass_the_wrong_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the wrong password",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOne.user_pass_the_wrong_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOne.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checking result",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOne.user_checking_result()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user successfully add the dosa",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case2"
    }
  ]
});
formatter.step({
  "name": "To launch the web browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioTwo.toLaunchTheWebBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To hit the website",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioTwo.toHitTheWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hit the dosa icon",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioTwo.userHitTheDosaIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User then click the Masal dosa",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioTwo.userThenClickTheMasalDosa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checking the available time",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioTwo.userCheckingTheAvailableTime()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user fills out the registration form and ignores the confirm password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case3"
    }
  ]
});
formatter.step({
  "name": "launching the web browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioThree.launchingTheWebBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To hit the testing website",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioThree.toHitTheTestingWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the account button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioThree.iClickTheAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the Name",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioThree.userPassTheName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the Mail",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioThree.userPassTheMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the Phnno",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioThree.userPassThePhnno()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass the Password",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioThree.userPassThePassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioThree.userClickTheRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Get the Pop Up",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioThree.userGetThePopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user search for the “Coke” can and check the price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case4"
    }
  ]
});
formatter.step({
  "name": "User launching the web browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioFour.userLaunchingTheWebBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the testing website",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioFour.userEntersTheTestingWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the search icon",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioFour.clickTheSearchIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search the Coke",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioFour.searchTheCoke()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the price",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioFour.checkThePrice()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user selects the Spanish Omelet",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case5"
    }
  ]
});
formatter.step({
  "name": "User launching the Chrome web browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ScenarioFive.userLaunchingTheChromeWebBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hits the testing website",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioFive.userHitsTheTestingWebsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the search icon",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioFour.clickTheSearchIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search the Spanish Omelte",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioFive.searchTheSpanishOmelte()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Spanish Omelte",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioFive.clickTheSpanishOmelte()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the price before probability",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioFive.checkThePriceBeforeProbability()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select and get the toppings option by probability",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioFive.selectAndGetTheToppingsOptionByProbability()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the price after probability",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioFive.checkThePriceAfterProbability()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});