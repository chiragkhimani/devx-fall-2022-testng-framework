package com.automation.framework.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	WebDriverWait wait = new WebDriverWait(WebDriverUtils.getDriver(), 30);

	public void waitForElementPresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
