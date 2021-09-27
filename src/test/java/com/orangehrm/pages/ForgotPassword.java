package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.framework.commons.WebCommons;
import com.orangehrm.framework.webdriver.WebDriverClass;

public class ForgotPassword extends WebCommons{
		
	@FindBy(linkText="Forgot your password?")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath ="//input[@id='securityAuthentication_userName']")
	private WebElement usernameTxtb;
	
	@FindBy(xpath ="//input[@id='btnSearchValues']")
	private WebElement resetPasswordBtn;
	
	@FindBy(xpath ="//input[@id='btnCancel']")
	private WebElement cancelBtn;
			
	public static ForgotPassword getForgotPassword() {
		return PageFactory.initElements(WebDriverClass.getDriver(), ForgotPassword.class);
	}

}
