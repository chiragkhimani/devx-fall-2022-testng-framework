package com.automation.framework.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for home page
 * 
 * @author Vishwa
 */
public class ContactUsPage extends BasePage {

	@FindBy(xpath = "//input[@title='Search']")
	WebElement courseSearchInput;

	@FindBy(xpath = "//div[@class='page-content']//h2/a")
	List<WebElement> searchResultList;

	@FindBy(xpath = "//h1[text()='Contact Us']")
	WebElement contactUsPageTitle;

	final String SEARCH_RESULT_LINK_XPATH = "//div[@class='page-content']//h2/a[text()='%s']";

	public void verifyContactUsPage() {
		waitUtils.waitForElementPresent(contactUsPageTitle);
		Assert.assertTrue("ContactUs page is not displayed", contactUsPageTitle.isDisplayed());
	}

	public void searchWithKeywordInCourseField(String keyword) {
		courseSearchInput.sendKeys(keyword + Keys.ENTER);
	}

	public void verifySearchResultWithLink(String link) {
		Assert.assertTrue("No search result displayed", searchResultList.size() > 0);
		String loc = String.format(SEARCH_RESULT_LINK_XPATH, link);
		WebElement searchResultLinkElement = driver.findElement(By.xpath(loc));
		Assert.assertTrue("Search result doesn't have link " + link, searchResultLinkElement.isDisplayed());
	}

	public void clickOnSearchResultLink(String link) {
		String loc = String.format(SEARCH_RESULT_LINK_XPATH, link);
		WebElement searchResultLinkElement = driver.findElement(By.xpath(loc));
		searchResultLinkElement.click();
	}

}
