package com.orangehrm.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com.orangehrm.stepdefinition",
		"com.orangehrm.framework.webdriver" }, plugin = { "pretty", "html:Reports/AutomationReport.html" })

public class TestRunner {

}
