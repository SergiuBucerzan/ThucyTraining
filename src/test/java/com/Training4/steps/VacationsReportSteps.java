package com.Training4.steps;

import com.Training4.pages.TrackPage;
import com.Training4.pages.VacationsReportPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class VacationsReportSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;

	VacationsReportPage vacationsReportPage;
	VacationsReportPage enterLastName;
	VacationsReportPage enterFirstName;
	VacationsReportPage searchButton;
	
	
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
	

	
}
