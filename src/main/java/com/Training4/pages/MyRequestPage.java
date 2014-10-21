package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class MyRequestPage extends PageObject {

	@FindBy(css="a[href*='menuItem=my-requests']")
	private WebElement myRequestItem;
	
	@FindBy(css="div.content-title")
	private WebElement contentTitle;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElement holidayBox;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElement onetofive;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElement ApprovedStatus;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement applyButton;
	
	public void clickMyRequestItem(){
		element(myRequestItem).waitUntilVisible();
		myRequestItem.click();
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}
	
	public void clickHoliday (){
		element(holidayBox).waitUntilVisible();
		holidayBox.click();
	}
	
	public void clickOneToFive(){
		element(onetofive).waitUntilVisible();
		onetofive.click();
	}
	
	public void clickApprovedstatus(){
		element(ApprovedStatus).waitUntilVisible();
		ApprovedStatus.click();
	}
	
	public void clickApplyButton(){
		element(applyButton).waitUntilVisible();
		applyButton.click();
	}
	
}