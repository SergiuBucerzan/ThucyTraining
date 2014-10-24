package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.LoginPage;
import com.Training4.pages.MainMenuPage;
import com.Training4.pages.PMVacationRejectPage;
import com.Training4.pages.VacationManagementInboxPage;

public class PMVacationRejectSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	LoginPage loginPage;
	MainMenuPage mainMenuPage;
	PMVacationRejectPage  rejectVacationButton;
	PMVacationRejectSteps selectItemToRejectFromChecklistButton;
	VacationManagementInboxPage vacationManagementInboxPage;
	
	@Step
	public void PMVacationRejectPage() {
		rejectVacationButton.clickSelectItemFromChecklistButton();
	}

	@Step
	public void go_to_PM_Vacation_RejectPage(){
		rejectVacationButton.clickRejectVacationButton();

	}

	@Step
	public void go_to_PM_Vacation_Reject_Page() {
		rejectVacationButton.clickRejectVacationButton();
	}


	@Step
	public void clickVacationManagementItem() {
		vacationManagementInboxPage.clickVacationManagementItem();
	
	}
	
	@Step
	public void clickVacationReject(){
		rejectVacationButton.clickRejectVacationButton();
	}

}