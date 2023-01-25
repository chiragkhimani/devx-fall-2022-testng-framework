package com.automation.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.framework.utils.ConfigReader;
import com.automation.framework.utils.WaitUtils;
import com.automation.framework.utils.WebDriverUtils;

/**
 * Page object for home page
 * 
 * @author Vishwa
 */

public abstract class BasePage {
	WebDriver driver;
	ConfigReader configUtils;
	WaitUtils waitUtils;

	public BasePage() {
		configUtils = new ConfigReader();
		driver = WebDriverUtils.getDriver();
		waitUtils = new WaitUtils();
		PageFactory.initElements(driver, this);
	}
}
