package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.LoginPage;
import com.Training4.pages.MainMenuPage;
import com.Training4.pages.NewVacationPage;
import com.Training4.pages.PMVacationApprovePage;
import com.Training4.pages.VacationManagementInboxPage;

public class PMVacationApproveSteps extends ScenarioSteps {

	
	private static final long serialVersionUID = 1L;
	LoginPage loginPage;
	MainMenuPage mainMenuPage;	
	NewVacationPage newVacationRequestPage;
	PMVacationApprovePage selectItemToApproveFromChecklistButton;
	PMVacationApprovePage approveVacationButton;
	
	@Step
	public void PMVacationApprovePage(){
		selectItemToApproveFromChecklistButton.clickSelectItemFromChecklistButton();
	}
	@Step
	public void go_to_PM_Vacation_Approve_Page(){
		approveVacationButton.clickApproveVacationButton();
	}
	VacationManagementInboxPage vacationManagementIndexPage;
	@Step
	public void clickVacationManagementItem() {
		vacationManagementIndexPage.clickVacationManagementItem();
		
	}


}