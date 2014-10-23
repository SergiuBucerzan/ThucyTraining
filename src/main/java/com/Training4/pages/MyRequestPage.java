package com.Training4.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.protobuf.TextFormat.ParseException;
import com.kenai.jffi.Array;

public class MyRequestPage extends PageObject {

	@FindBy(css = "a[href*='menuItem=my-requests']")
	private WebElement myRequestItem;

	@FindBy(css = "div.content-title")
	private WebElement contentTitle;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElement holidayBox;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElement onetofive;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElement ApprovedStatus;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement applyButton;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_vacationTypeALLCheckbox")
	private WebElement allVacationType;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_daysNumberALLCheckbox")
	private WebElement allDays;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_vacationStatusALLCheckbox")
	private WebElement allStatus;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement apply;

	@FindBy(css = "a[href*='orderByCol=startDate']")
	private WebElement startDate;

	public void clickMyRequestItem() {
		element(myRequestItem).waitUntilVisible();
		myRequestItem.click();
	}

	public String getContentTitle() {
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}

	public void clickHoliday() {
		element(holidayBox).waitUntilVisible();
		holidayBox.click();
	}

	public void clickOneToFive() {
		element(onetofive).waitUntilVisible();
		onetofive.click();
	}

	public void clickApprovedstatus() {
		element(ApprovedStatus).waitUntilVisible();
		ApprovedStatus.click();
	}

	public void clickApplyButton() {
		element(applyButton).waitUntilVisible();
		applyButton.click();
	}

	public void clickallVacationType() {
		element(allVacationType).waitUntilVisible();
		allVacationType.click();
	}

	public void clickallDays() {
		element(allDays).waitUntilVisible();
		allDays.click();
	}

	public void clickallStatus() {
		element(allStatus).waitUntilVisible();
		allStatus.click();
	}

	public void clickApply() {
		element(apply).waitUntilVisible();
		apply.click();
	}

	public List<String> returnVacationTypeList() {
		List<WebElement> vacationTypeList = getDriver().findElements(
				By.cssSelector("td[class*='header.type'] a"));
		List<String> vacationTypeStrList = new ArrayList<String>();
		for (WebElement i : vacationTypeList) {
			vacationTypeStrList.add(i.getText());
		}
		return vacationTypeStrList;
	}

	public List<Integer> returnDaysNumberList() {
		List<WebElement> daysNumberList = getDriver().findElements(
				By.cssSelector("td[class*='day.number'] a"));
		List<Integer> daysNumberIntList = new ArrayList<Integer>();
		for (WebElement i : daysNumberList) {
			daysNumberIntList.add(Integer.parseInt(i.getText()));
		}
		return daysNumberIntList;
	}

	public List<String> returnvacationStatusList() {
		List<WebElement> vacationStatusList = getDriver().findElements(
				By.cssSelector("td[class*='header.status'] a"));
		List<String> vacationStatusStrList = new ArrayList<String>();
		for (WebElement i : vacationStatusList) {
			vacationStatusStrList.add(i.getText());
		}
		return vacationStatusStrList;
	}

	// public static Date dateFromString(String dateString)
	// throws java.text.ParseException, ParseException {
	// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy",
	// Locale.US);
	// Date date = null;
	// date = formatter.parse(dateString);
	// return date;
	// }

	public static Date stringToDate(String dateInString)
			throws java.text.ParseException, ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date date = formatter.parse(dateInString);
		System.out.println(date);
		System.out.println(formatter.format(date));
		return date;
	}

	public List<Date> returnDataList() throws ParseException,
			java.text.ParseException {
		List<WebElement> dataList = getDriver().findElements(
				By.cssSelector("td[class*='start.date'] a"));
		List<Date> listOfDates = new ArrayList<Date>();
		for (WebElement data : dataList) {
			System.out.println(data.getText());
			listOfDates.add((Date) stringToDate(data.getText())); // aici e
																	// bai!!
		}
		return listOfDates;

	}

	public void verifyThatDatesAreAscendentSorted() throws ParseException,
			java.text.ParseException {

		List<Date> list = returnDataList();
		for (int i = 0; i < list.size() - 2; i++) { // sau list.size()-2 avand
													// in vedere ca compara i cu
													// i+1 si sa nu dea
													// outOfIndex
			Date current = list.get(i);
			Date next = list.get(i + 1);
			Assert.assertTrue("Dates are not ascending!!!!",
					current.compareTo(next) < 0);
		}

	}

	public void clickStartDate() {
		element(startDate).waitUntilVisible();
		startDate.click();
	}

	public void verifyThatDatesAreDescendentSorted() throws ParseException,
			java.text.ParseException {

		List<Date> list = returnDataList();
		for (int i = 0; i > list.size() - 2; i++) { // sau list.size()-2 avand
													// in vedere ca compara i cu
													// i+1 si sa nu dea
													// outOfIndex
			Date current = list.get(i);
			Date next = list.get(i + 1);
			Assert.assertTrue("Dates are not descending!!!!",
					current.compareTo(next) > 0);
		System.out.println("data este" + current);
		}

	}

}