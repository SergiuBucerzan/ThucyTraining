package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class NewVacationPage extends PageObject {

	@FindBy(css="a[href*='menuItem=new-request']")
	private WebElement newvacation;
	
	@FindBy(css="div.content-title")
	private WebElement contentTitle;
	
	public void clickNewVacation(){
		element(newvacation).waitUntilVisible();
		newvacation.click();
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}
	
}