package com.omrbranch.stepdefinition;

import org.junit.Assert;
import com.omrbranch.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@When("User login with {string},{string}")
	public void user_login_with(String email, String password) {
		pom.getLoginPage().validLogin(email, password);
	}

	@When("User login with {string},{string} and enter")
	public void user_login_with_and_enter(String email, String password) {
		pom.getLoginPage().validLoginWithEnterKey(email, password);
		
	}

	@Then("User verifies the logged in user profile name {string}")
	public void user_verifies_the_logged_in_user_profile_name(String ExpectedLoginWelcomMsg) {
		Assert.assertEquals("Verify Login Success Msg",ExpectedLoginWelcomMsg, pom.getExploreHotelPage().loginSuccessMsg());
	}
	

	@When("User login with {string},invalid {string}")
	public void user_login_with_invalid(String email, String password) {
		pom.getLoginPage().validLogin(email, password);
	}
	@Then("User verifies the error masg {string}")
	public void user_verifies_the_error_masg(String ExpectedErrorMsg) {
		String loginErrorMsg = pom.getLoginPage().loginErrorMsg();
		boolean b = loginErrorMsg.contains(ExpectedErrorMsg);
		Assert.assertTrue("Verify Login Error Msg",b);
	   
	}



	

}
