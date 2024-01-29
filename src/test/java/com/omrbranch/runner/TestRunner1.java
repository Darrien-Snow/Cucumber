package com.omrbranch.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.omrbranch.base.BaseClass;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com\\omrbranch\\stepdefinition", dryRun = false,
tags = " @WithSearchField_ErrorMsg",stepNotifications = true)
//" @Login or @SearchHotel or @selectHotel or @BookHotel or @ChangeBooking or @CancelBooking"

public class TestRunner1 extends BaseClass {


	@org.junit.After
	public static void closeBrowse() throws InterruptedException {
		Thread.sleep(30000);
		quitdriver();

	}

}
