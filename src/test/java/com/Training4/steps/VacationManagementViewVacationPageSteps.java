package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.VacationManagementViewVacationsPage;

public class VacationManagementViewVacationPageSteps extends ScenarioSteps {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	VacationManagementViewVacationsPage vacationManagementPage;
	
	@Step
	public void clickViewVacationMenuItem(){
		vacationManagementPage.clickViewVacationItem();		
	}
	
	@Step
	public void selectVacationTypeCheckbox(String type){
		vacationManagementPage.selectVacationType(type);
	}
	@Step
	public void  selectVacationStatusCheckbox(String type) {
		vacationManagementPage.selectVacationStatus(type);
	}
	
	@Step
	public void selectDaysNumberCheckbox (String type){
		vacationManagementPage.selectDaysNumber(type);
	}
	@Step
	public void clickApplyButton(){
		vacationManagementPage.clickApplyButton();
	}
	
}