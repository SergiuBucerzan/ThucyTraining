package com.Training4.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class MainMenuPage extends PageObject {

	@FindBy(css="a[href*='vacation']")
	private WebElement vacationMenuItem;
	
	
	public void clickVacationMenuItem(){
		element(vacationMenuItem).waitUntilVisible();
		vacationMenuItem.click();
	}
	
}