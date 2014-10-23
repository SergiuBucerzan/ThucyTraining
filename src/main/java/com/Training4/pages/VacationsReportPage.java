package com.Training4.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class VacationsReportPage extends PageObject{


	@FindBy(css = "a[href*='vacation-report']")
	private WebElement vacationReport;
	
	@FindBy(css = "input[name='_evovacation_WAR_EvoVacationportlet_reportLastName']")
	private WebElement lastNameTxt;
	
	@FindBy(css = "input[name='_evovacation_WAR_EvoVacationportlet_reportFirstName']")
	private WebElement firstNameTxt;
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_searchButton']")
	private WebElement searchButton;
	
	@FindBy(css = "select[name='_evovacation_WAR_EvoVacationportlet_exportMonth']")
	private WebElement exportMonth;
	
	@FindBy(css = "select[name='_evovacation_WAR_EvoVacationportlet_exportYear']")
	private WebElement exportYear;

	public void clickVacationsReport() {
		element(vacationReport).waitUntilVisible();
		vacationReport.click();
		
	}
	
	public void typeLastName(String lastN){
		element(lastNameTxt).type(lastN);
	}
	
	public void typeFirstName(String firstN){
		element(firstNameTxt).type(firstN);
	}
	
	public void clickSearchButton(){
		element(searchButton).waitUntilVisible();
		searchButton.click();
	}
	
	

	
}
