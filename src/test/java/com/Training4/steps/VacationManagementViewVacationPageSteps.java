package com.Training4.steps;

import net.thucydides.core.annotations.Managed;

import com.Training4.tools.Constants; 

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Training4.pages.VacationManagementInboxPage;
import com.Training4.pages.VacationManagementViewVacationsPage;
import com.Training4.requirements.Application;
import com.Training4.steps.LoginSteps;

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