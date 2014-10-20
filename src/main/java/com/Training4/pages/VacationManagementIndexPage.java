package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class VacationManagementIndexPage extends PageObject {

	@FindBy(css="div[class='aui-column-content aui-column-content-first '] div:nth-child(3) ul li:nth-child(3) a")
	private WebElement vacationManagementItem;
	
	
	public void clickVacationManagementItem(){
		element(vacationManagementItem).waitUntilVisible();
		vacationManagementItem.click();
	}

}