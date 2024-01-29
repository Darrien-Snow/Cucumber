package com.omrbranch.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.omrbranch.base.BaseClass;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com\\omrbranch\\stepdefinition", tags = "@InvalidLogin", dryRun = false)
public class TestRunner3 extends BaseClass {

	@org.junit.AfterClass
	public static void closeBrowse() throws InterruptedException {
		Thread.sleep(10000);
		quitdriver();

	}

}
