package com.automation.framework.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for home page
 * 
 * @author Vishwa
 */
public class JobObservationAnalysisPage extends BasePage {

	@FindBy(xpath = "//h1[text()='Job Observation Analysis']")
	WebElement jobObservationAnalysisPageTitle;

	@FindBy(css = ".layoutArea p")
	List<WebElement> jobObservationAnalysisPageTextSectionList;

	public void verifyJobObservationAnalysisPage() {
		waitUtils.waitForElementPresent(jobObservationAnalysisPageTitle);
		Assert.assertTrue("Job Observation Analysis page is not displayed",
				jobObservationAnalysisPageTitle.isDisplayed());
	}

	public void verifyTextOnPage(String text) {
		String textOnUi = "";
		for (WebElement textSection : jobObservationAnalysisPageTextSectionList) {
			textOnUi = textOnUi + textSection.getText();
		}
		Assert.assertTrue("Job Observation Analysis Page doesn't have text " + text, textOnUi.contains(text));
	}

}
