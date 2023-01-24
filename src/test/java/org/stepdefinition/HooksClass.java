package org.stepdefinition;

import org.bs.BaseClass;

import cucumber.api.java.After;

public class HooksClass extends BaseClass {
	@After
	public void postcondition1() {
		closingBrowser();

	}
}
