package com.Training4.pages;

import net.thucydides.core.annotations.findby.By;
import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.findby.FindBy;
import ch.lambdaj.function.convert.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import static ch.lambdaj.Lambda.convert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.WebElementFacade;

public class NewVacationPage extends PageObject {
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade saveButton;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_cancelButton")
	private WebElementFacade cancelButton;
	 
	@FindBy(css="a[href*='menuItem=new-request']")
	private WebElement newvacation;
	
	@FindBy(css="h1.header-title span")
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

	 @FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_CF")
	 private WebElement vWhitoutPay;
	 
	 @FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_CS")
	 private WebElement specialVacation;
	 
	 @FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_CM")
	 private WebElement sickVacation;
	 
	 @FindBy(css ="option[value='CHILD_BIRTH']")
	 private WebElementFacade childbirthvacation;
	 
	 @FindBy(css="#_evovacation_WAR_EvoVacationportlet_newVacationComment")
	 private WebElement comment;
	 
	 @FindBy(css="#_evovacation_WAR_EvoVacationportlet_commentContent")
	 private WebElementFacade commentariu;
	 
	 @FindBy(css="#_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest")
	 private WebElementFacade withdraw;
	 
	 public void chooseChildBirth()
	 {
		 childbirthvacation.click();
	  
	 }
	 
	 public void addComment()
	 {
		 comment.click();
	  
	 }
	 
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
	
	public void clickCancelButton(){
		element(cancelButton).waitUntilVisible();
		cancelButton.click();
	}
	
	ArrayList<String> list = new ArrayList<String>();
	
	
	public void clickVWhitoutPay(){
		element(vWhitoutPay).waitUntilVisible();
		vWhitoutPay.click();
	}
	
	public void clickSpecialVacation(){
		element(specialVacation).waitUntilVisible();
		specialVacation.click();
	}
	
	public void clickSickVacation(){
		element(sickVacation).waitUntilVisible();
		sickVacation.click();
	}
	
	public void enter_comment(String keyword) {
       commentariu.type(keyword);
    }
	
	public void clickWithdraw()
	 {
		 withdraw.click();
	  
	 }
	
}