package com.orangehrm.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangehrm.framework.commons.WebCommons;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverClass {
	protected static WebDriver driver;
	
	@Before
	public synchronized void SetupBrowser() {	
		String browser= WebCommons.appProperties().getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();		
	}
		
	public synchronized static WebDriver getDriver() {
		return driver;
	}
	
	@After
	public synchronized void tearDown() {
		driver.quit();

	}

}
