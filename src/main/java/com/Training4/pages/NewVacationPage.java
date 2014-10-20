package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class NewVacationPage extends PageObject {

	@FindBy(css="a[href*='menuItem=new-request']")
	private WebElement newvacation;
	
	public void clickNewVacation(){
		element(newvacation).waitUntilVisible();
		newvacation.click();
	}
	
}