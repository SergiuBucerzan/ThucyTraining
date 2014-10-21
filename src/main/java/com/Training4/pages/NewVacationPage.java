package com.Training4.pages;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import ch.lambdaj.function.convert.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class NewVacationPage extends PageObject {
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade saveButton;
	
	 
	@FindBy(css="a[href*='menuItem=new-request']")
	private WebElement newvacation;
	
	@FindBy(css="div.content-title")
	private WebElement contentTitle;
	
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

	public void clickNewVacation(){
		element(newvacation).waitUntilVisible();
		newvacation.click();
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
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

		  List<WebElement> days = getDriver().findElements( // By.cssSelector("div[aria-hidden='false'] .aui-calendar-day.aui-calendar-day-month.aui-state-default"));
		    By.cssSelector("div[style*='block'] td"));
		  for (WebElement currentDay : days) {
		   if (currentDay.getText().toLowerCase()
		     .contains(String.valueOf(day).toLowerCase()))
		    currentDay.click();
		  }
	 }
	
	public void clickSaveButton(){
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}
	
}