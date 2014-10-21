package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class VacationManagementViewVacationsPage extends PageObject {

	@FindBy(css="a[href*='menuItem=view-vacations']")
	private WebElement viewVacationItem;
	
	
	public void clickViewVacationItem(){
		element(viewVacationItem).waitUntilVisible();
		viewVacationItem.click();
	}

}