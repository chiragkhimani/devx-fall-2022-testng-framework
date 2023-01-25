package com.automation.framework.tests;

import org.testng.annotations.Test;

public class CourseSearchFunctionalityTest extends BaseTest {

	@Test
	public void verifyCourseSearchFunctionality() {
		homePage.openWebsite();
		homePage.verifyHomePage();
		homePage.clickOnContactUsLink();
		contactUsPage.verifyContactUsPage();
		contactUsPage.searchWithKeywordInCourseField(configReader.getProperty("search.keyword"));
		contactUsPage.verifySearchResultWithLink(configReader.getProperty("result.link"));
		contactUsPage.clickOnSearchResultLink(configReader.getProperty("result.link"));
		jobObservationAnalysisPage.verifyJobObservationAnalysisPage();
		jobObservationAnalysisPage.verifyTextOnPage(configReader.getProperty("result.text"));
	}
}
