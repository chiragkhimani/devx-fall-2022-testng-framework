package com.automation.framework.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.framework.pages.ContactUsPage;
import com.automation.framework.pages.HomePage;
import com.automation.framework.pages.JobObservationAnalysisPage;
import com.automation.framework.utils.ConfigReader;
import com.automation.framework.utils.WebDriverUtils;

/**
 * BaseTest annotation will be executed before and after each test
 * 
 * @author Vishwa
 *
 */
public abstract class BaseTest {

	/**
	 * These are the page object to access method of each page
	 * 
	 * @author Vishwa
	 */

	ContactUsPage contactUsPage;
	HomePage homePage;
	JobObservationAnalysisPage jobObservationAnalysisPage;
	ConfigReader configReader;

	/**
	 * This method will be executed before each test
	 * 
	 * @author Vishwa
	 */

	@BeforeMethod
	public void setUp() {
		WebDriverUtils.initDriver();
		contactUsPage = new ContactUsPage();
		homePage = new HomePage();
		jobObservationAnalysisPage = new JobObservationAnalysisPage();
		configReader = new ConfigReader();
	}

	/**
	 * This method will be executed after each test and we're cleaning up
	 * driver(browser)
	 * 
	 * @author Vishwa
	 */

	@AfterMethod
	public void cleanUp() {
		WebDriverUtils.getDriver().quit();
	}
}
