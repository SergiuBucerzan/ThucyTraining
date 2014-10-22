package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class VacationManagementInboxPage extends PageObject {

	@FindBy(css = "a[href*='menuItem=inbox']")
	private WebElement vacationManagementInboxItem;

	public void clickVacationManagementItem() {
		element(vacationManagementInboxItem).waitUntilVisible();
		vacationManagementInboxItem.click();
	}

}