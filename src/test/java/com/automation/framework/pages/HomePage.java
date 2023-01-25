package com.automation.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.framework.utils.WebDriverUtils;

/**
 * Page object for home page
 * 
 * @author Vishwa
 */
public class HomePage extends BasePage {

	@FindBy(css = ".elementor-icon-list-text")
	public WebElement homePageHeader;

	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	public WebElement contactUsLink;

	public void openWebsite() {
		WebDriverUtils.getDriver().get(configUtils.getProperty("application.url"));
	}

	public void verifyHomePage() {
		Assert.assertTrue("Homepage is not displayed", homePageHeader.isDisplayed());
	}

	public void clickOnContactUsLink() {
		waitUtils.waitForElementPresent(contactUsLink);
		contactUsLink.click();
	}

}
