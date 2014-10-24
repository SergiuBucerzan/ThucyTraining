package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.VacationManagementInboxPage;


public class VacationManagementInboxSteps  extends ScenarioSteps{
    
	

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    VacationManagementInboxPage vacationManagementInboxPage;
    @Step
	public void clickVacationManagementInboxItem() {
		vacationManagementInboxPage.clickVacationManagementItem();
		
	}
   
}