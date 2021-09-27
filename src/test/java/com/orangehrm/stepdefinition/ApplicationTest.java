package com.orangehrm.stepdefinition;

import java.io.IOException;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationTest {

	@When("Launch the Application")
	public void launch_the_application() throws IOException {
		LoginPage loginPage = LoginPage.getLoginPage();
		loginPage.launchApplication();
	}

	@Then("Verify Application Title")
	public void verify_application_title() throws IOException {
		LoginPage loginPage = LoginPage.getLoginPage();
		loginPage.verifyTitle();
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		LoginPage loginPage = LoginPage.getLoginPage();
		loginPage.ClickOnLoginButton();
	}

	@Then("Application Login Should be Successful")
	public void application_login_should_be_successful() {
		LoginPage loginPage = LoginPage.getLoginPage();
		loginPage.VerifyLogin(); 
	}
	
	@Then("Click on Logout")
	public void click_on_logout() throws IOException {
		HomePage homePage = HomePage.getHomePage();
		homePage.logoutFromApplication(); 
	}
	
	@Then("Logout Should be Successful")
	public void logout_should_be_successful() throws IOException {
		HomePage homePage = HomePage.getHomePage();
		homePage.verifyLogout();
	}
	
	@When("^I Enter (.*) and (.*)$")
	public void i_enter_Username_and_Password(String Username, String Password) throws IOException {
		LoginPage loginPage = LoginPage.getLoginPage();
		loginPage.EnterCredentials(Username, Password);
	}
	
}
