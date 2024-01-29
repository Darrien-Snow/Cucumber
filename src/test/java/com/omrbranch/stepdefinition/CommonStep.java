package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;

public class CommonStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch Login page")
	public void user_is_on_the_omr_branch_login_page() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyValue("browser"));
		enterApplnUrl(getPropertyValue("url"));
		maximizeWindow();
		implicitWaitDefault();
		
	}
}
