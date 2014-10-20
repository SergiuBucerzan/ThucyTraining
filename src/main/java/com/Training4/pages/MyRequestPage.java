package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class MyRequestPage extends PageObject {

	@FindBy(css="a[href*='menuItem=my-requests']")
	private WebElement myRequestItem;
	
	@FindBy(css="div.content-title")
	private WebElement contentTitle;
	
	public void clickMyRequestItem(){
		element(myRequestItem).waitUntilVisible();
		myRequestItem.click();
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}
}