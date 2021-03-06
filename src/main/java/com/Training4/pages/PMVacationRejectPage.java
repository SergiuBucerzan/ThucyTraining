package com.Training4.pages;

import java.util.List;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class PMVacationRejectPage extends PageObject {

	@FindBy(css = "_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-rowChecker_row-1")
	private WebElementFacade selectItemToRejectFromChecklistButton;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_multipleRejectButton")
	private WebElementFacade rejectVacationButton;

	@FindBy(css = "a[href*='menuItem=new-request']")
	private WebElement newvacation;

	@FindBy(css = "div.content-title")
	private WebElement contentTitle;


	public void select_nth_request(int n) {
		List<WebElement> requestsList = getDriver().findElements(
				By.cssSelector("input[type='checkbox'][value]"));

		element(requestsList.get(n)).click();

	}

	public String getContentTitle() {
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}

	public void clickSelectItemFromChecklistButton() {
		element (selectItemToRejectFromChecklistButton).waitUntilVisible();
		selectItemToRejectFromChecklistButton.click();
	}

	public void clickRejectVacationButton() {
		rejectVacationButton.click();
	}

}
