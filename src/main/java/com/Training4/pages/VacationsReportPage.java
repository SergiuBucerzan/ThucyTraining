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
	
	@FindBy(css = "select[name='_evovacation_WAR_EvoVacationportlet_exportMonth'] option:nth-child(8)")
	private WebElement exportMonth;
	
	@FindBy(css = "select[name='_evovacation_WAR_EvoVacationportlet_exportYear'] option:nth-child(9)")
	private WebElement exportYear;
	
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_exportButton']")
	private WebElement exportButton;

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
	
	public void selectMonth(){
		element(exportMonth);
		waitABit(2000);
		exportMonth.click();
	}
	
	public void selectYear(){
		element(exportYear);
		waitABit(2000);
		exportYear.click();
	}
	public void clickExportButton(){
		element(exportButton).waitUntilVisible();
		exportButton.click();
	}
	
	
	
}
