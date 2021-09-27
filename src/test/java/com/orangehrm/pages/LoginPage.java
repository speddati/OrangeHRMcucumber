package com.orangehrm.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.framework.commons.WebCommons;
import com.orangehrm.framework.webdriver.WebDriverClass;

public class LoginPage extends WebCommons {

	@FindBy(xpath = "//input[@id='txtUsername']")
	private WebElement usernameTxtb;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement passwordTxtb;

	@FindBy(xpath = "//input[@value='LOGIN']")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[@id='welcome']")
	private WebElement welcomeLabel;

	public void launchApplication() throws IOException {
		try {
			driver.get(appProperties().getProperty("Url"));
		} catch (Exception e) {			
			Assert.fail("Error while Launching the Application");
		}
	}

	public void verifyTitle() throws IOException {
		if (getTitle().equals(appProperties().getProperty("title"))) {		
		} else {
			Assert.fail("Application title is Not Correct and current title ===" + getTitle());
		}
	}

	public void EnterCredentials(String Username, String Password) throws IOException {
			EnterInfo(usernameTxtb, Username);
			EnterInfo(passwordTxtb, Password);
	}
	
	public void ClickOnLoginButton() {
		Click(loginBtn);   
	}
	
	public void VerifyLogin() {
		try {
			WaitForElement(welcomeLabel);
		} catch (Exception e) {
			Assert.fail("Error while Login Into the Application");
		}
	}

	public static LoginPage getLoginPage() {
		return PageFactory.initElements(WebDriverClass.getDriver(), LoginPage.class);
	}

}
