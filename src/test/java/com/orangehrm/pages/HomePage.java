package com.orangehrm.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.framework.commons.WebCommons;
import com.orangehrm.framework.webdriver.WebDriverClass;

public class HomePage extends WebCommons{

	@FindBy(xpath ="//a[@id='welcome']")
	private WebElement welcomeLabel;
		
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutButton;

	@FindBy(xpath="//div[@id='logInPanelHeading']")
	private WebElement logInPanelHeading;
	
	public void logoutFromApplication() throws IOException {
		Click(welcomeLabel);
		Click(logoutButton);
		
	}
	
	public void verifyLogout() throws IOException {
		if (!isElementAvailable(logInPanelHeading))
			Assert.fail("Error while Logout From the Application");
	}
	
	public static HomePage getHomePage() {
		return PageFactory.initElements(WebDriverClass.getDriver(), HomePage.class);
	}
}
