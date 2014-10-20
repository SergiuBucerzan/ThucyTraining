package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class TrackPage extends PageObject {

	@FindBy(css="a[href*='menuItem=vacation-tracker']")
	private WebElement trackItem;
	
	
	public void clickTrackItem() {
		element(trackItem).waitUntilVisible();
		trackItem.click();
		
	}
	
}