package com.Training4.pages;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
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
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_vacationTypeALLCheckbox")
	private WebElement allVacationType;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_daysNumberALLCheckbox")
	private WebElement allDays;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_vacationStatusALLCheckbox")
	private WebElement allStatus;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement apply;
	
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
	
	public void clickallVacationType(){
		element(allVacationType).waitUntilVisible();
		allVacationType.click();
	}
	
	public void clickallDays(){
		element(allDays).waitUntilVisible();
		allDays.click();
	}

	public void clickallStatus(){
		element(allStatus).waitUntilVisible();
		allStatus.click();
	}

	public void clickApply(){
		element(apply).waitUntilVisible();
		apply.click();
	}
	
	public List<String> returnVacationTypeList(){
		List<WebElement> vacationTypeList = getDriver().findElements(By.cssSelector("td[class*='header.type'] a"));
		List<String> vacationTypeStrList = new ArrayList<String>();
		for (WebElement i : vacationTypeList){
			vacationTypeStrList.add(i.getText());
		}
		return vacationTypeStrList;
	}
	
	public List<Integer> returnDaysNumberList(){
		List<WebElement> daysNumberList = getDriver().findElements(By.cssSelector("td[class*='day.number'] a"));
		List<Integer> daysNumberIntList = new ArrayList<Integer>();
		for (WebElement i : daysNumberList){
			daysNumberIntList.add(Integer.parseInt(i.getText()));
		}
		return daysNumberIntList;
	}
	
}
