package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.VacationsReportPage;

public class VacationsReportSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;

	VacationsReportPage vacationsReportPage;
	VacationsReportPage enterLastName;
	VacationsReportPage enterFirstName;
	VacationsReportPage searchButton;
	VacationsReportPage exportMonth;
	VacationsReportPage exportYear;
	VacationsReportPage exportButton;
	VacationsReportPage clickName;
	
	
	
	@Step
	public void go_to_vacations_report() {
		vacationsReportPage.clickVacationsReport();
	}
	
	@Step
	public void type_last_name(String lastN){
		enterLastName.typeLastName(lastN);
	}
	
	@Step
	public void type_first_name(String firstN){
		enterFirstName.typeFirstName(firstN);
	}
	
	@Step 
	public void click_search_button(){
		searchButton.clickSearchButton();
	}
	
	@Step
	public void select_month(){
		exportMonth.selectMonth();
		
	}
	
	@Step
	public void select_year(){
		exportYear.selectYear();
	}
	
	@Step
	public void click_export_button(){
		exportButton.clickExportButton();
	}
	
	@Step
	public void click_on_name(){
		clickName.clickUserName();
	}
}
