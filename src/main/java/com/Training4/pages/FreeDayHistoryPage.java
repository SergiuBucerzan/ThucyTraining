package com.Training4.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class FreeDayHistoryPage extends PageObject {

	@FindBy(css = "a[href*='menuItem=free-days-history']")
	private WebElement free;

	@FindBy(css = ".content-title")
	private WebElement contentTitle;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_COCheckbox")
	private WebElement VacationDays;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElement onetofive;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_ADDED_DAYSCheckbox")
	private WebElement AddedDays;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement applyButton;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_freeDaysHistoriesSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElement filter;

	@FindBy(css = "option[value='75']")
	private WebElementFacade val;

	public void clickFreeDays() {
		element(free).waitUntilVisible();
		free.click();
	}

	public String getContentTitle() {
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}

	public void clickHoliday() {
		element(VacationDays).waitUntilVisible();
		VacationDays.click();
	}

	public void clickOneToFive() {
		element(onetofive).waitUntilVisible();
		onetofive.click();
	}

	public void clickApprovedstatus() {
		element(AddedDays).waitUntilVisible();
		AddedDays.click();
	}

	public void clickApplyButton() {
		element(applyButton).waitUntilVisible();
		applyButton.click();
	}

	public void clickFilter(String label) {
		element(filter).waitUntilVisible();
		element(filter).selectByVisibleText(label);
		waitABit(3000);
	}

}