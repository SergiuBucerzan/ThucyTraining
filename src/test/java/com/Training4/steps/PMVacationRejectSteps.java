package com.Training4.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.LoginPage;
import com.Training4.pages.MainMenuPage;
import com.Training4.pages.NewVacationPage;
import com.Training4.pages.PMVacationApprovePage;
import com.Training4.pages.VacationManagementInboxPage;

public class PMVacationRejectSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	LoginPage loginPage;
	MainMenuPage mainMenuPage;
	NewVacationPage newVacationRequestPage;
	PMVacationRejectSteps selectItemToRejectFromChecklistButton;
	PMVacationRejectSteps rejectVacationButton;
	
	
	@Step
	public void PMVacationRejectPage(){
		selectItemToRejectFromChecklistButton.clickSelectItemFromChecklistButton();
	}
	private void clickSelectItemFromChecklistButton() {
		// TODO Auto-generated method stub
		
	}
	@Step
	public void go_to_PM_Vacation_Reject_Page(){
		rejectVacationButton.clickRejectVacationButton();
	}
	private void clickRejectVacationButton() {
		// TODO Auto-generated method stub
		
	}
	VacationManagementInboxPage vacationManagementIndexPage;
	@Step
	public void clickVacationManagementItem() {
		vacationManagementIndexPage.clickVacationManagementItem();
		
	}

}