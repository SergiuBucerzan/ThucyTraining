package com.Training4.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.junit.Assert;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;

public class NewVacationPage extends PageObject {

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade saveButton;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_cancelButton")
	private WebElementFacade cancelButton;

	@FindBy(css = "a[href*='menuItem=new-request']")
	private WebElement newvacation;

	@FindBy(css = "h1.header-title span")
	private WebElement contentTitle;
	
	@FindBy(css ="div[class='view-vacation']")
	private WebElement contentT;
	
	@FindBy(css ="div[class='content-title']")
	private WebElement content;
	
	@FindBy(css = ".action-buttons")
	private WebElement contentTitl;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade startDateBox;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_endDate")
	private WebElementFacade endDateBox;

	@FindBy(css = "div[style*='block'] td.dp_caption")
	private WebElementFacade calendarTitle;

	@FindBy(css = "div[style*='block'] td.dp_next")
	private WebElementFacade nextButton;

	@FindBy(css = "div[style*='block'] td.dp_previous")
	private WebElementFacade previousButton;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElement vWhitoutPay;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElement specialVacation;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CM")
	private WebElement sickVacation;

	@FindBy(css = "option[value='CHILD_BIRTH']")
	private WebElementFacade childbirthvacation;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_newVacationComment")
	private WebElement comment;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElementFacade commentariu;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest")
	private WebElementFacade withdraw;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_editVacationRequest")
	private WebElementFacade edit;

    @FindBy(css="input[name='startDate']")
	    private WebElementFacade startDate;
	 
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_endDate")
	    private WebElementFacade endDate;
	
	
	public void chooseChildBirth() {
		childbirthvacation.click();

	}

	public void addComment() {
		comment.click();

	}
	
	public void checkState(){
		String VacationRequst = "Vacation Request";
		boolean found = false;
		if(contentT.getText().contains(VacationRequst)){
			found = true;
		}
		Assert.assertTrue("The text was not found",found);
	}

	public void clickNewVacation() {
		element(newvacation).waitUntilVisible();
		newvacation.click();
	}

	public String getContentTitle() {
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}
	
	public String getContentTitl() {
		element(contentTitl).waitUntilVisible();
		return contentTitl.getText();
	}
	
	public String getContentT() {
		element(content).waitUntilVisible();
		return content.getText();
	}

	public void clickStartDateBox() {
		startDateBox.click();
	}

	public void clickEndDateBox() {
		endDateBox.click();
	}

	public void setDate(int month, int day, int year) throws ParseException {

		Calendar calNew = Calendar.getInstance();
		SimpleDateFormat sdfNew = new SimpleDateFormat("dd/MM/yyyy");
		calNew.setTime(sdfNew.parse("1/" + String.valueOf(month) + "/"
				+ String.valueOf(year)));

		Calendar cal = Calendar.getInstance();
		do {
			element(calendarTitle).waitUntilVisible();
			String MandY = calendarTitle.getText();
			MandY = MandY.replace(",", "");
			SimpleDateFormat sdf = new SimpleDateFormat("MMM yyyy dd");
			System.out.println(MandY + " 1");
			cal.setTime(sdf.parse(MandY + " 1"));

			if (cal.compareTo(calNew) == -1) {
				nextButton.click();
			}
			if (cal.compareTo(calNew) == 1) {
				previousButton.click();
			}
		} while (cal.compareTo(calNew) != 0);

		List<WebElement> days = getDriver().findElements( 
				By.cssSelector("div[style*='block'] td"));
		for (WebElement currentDay : days) {
			if (currentDay.getText().toLowerCase()
					.contentEquals(String.valueOf(day).toLowerCase()))
				currentDay.click();
		}
	}

	public void clickSaveButton() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}

	public void clickCancelButton() {
		element(cancelButton).waitUntilVisible();
		cancelButton.click();
	}

	ArrayList<String> list = new ArrayList<String>();

	public void clickVWhitoutPay() {
		element(vWhitoutPay).waitUntilVisible();
		vWhitoutPay.click();
	}

	public void clickSpecialVacation() {
		element(specialVacation).waitUntilVisible();
		specialVacation.click();
	}

	public void clickSickVacation() {
		element(sickVacation).waitUntilVisible();
		sickVacation.click();
	}

	public void enter_comment(String keyword) {
		commentariu.type(keyword);
	}

	public void clickWithdraw() {
		withdraw.click();

	}

	public void clickEdit() {
		edit.click();
		waitABit(5000);
	}
	
	public void clickStartDate() {
		waitABit(3000);
		getDriver().switchTo().frame(getDriver().findElement(By.cssSelector("div[aria-hidden='false'] iframe[src*='editVacation']")));
		startDate.click();
	}

	public void clickEndDate() {
		endDate.click();
	}
}