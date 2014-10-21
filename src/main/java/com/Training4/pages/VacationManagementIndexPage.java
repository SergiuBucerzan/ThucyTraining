package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class VacationManagementIndexPage extends PageObject {

	@FindBy(css="a[href*='menuItem=inbox']")
	private WebElement vacationManagementItem;
	
	
	public void clickVacationManagementItem(){
		element(vacationManagementItem).waitUntilVisible();
		vacationManagementItem.click();
	}

}