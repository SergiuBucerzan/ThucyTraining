package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.PMVacationApprovePage;
import com.Training4.pages.VacationManagementInboxPage;

public class PMVacationApproveSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	PMVacationApprovePage approveVacationButton;
	VacationManagementInboxPage vacationManagementIndexPage;

	@Step
	public void PMVacationApprovePage() {
		approveVacationButton.clickSelectItemFromChecklistButton();
	}

	@Step
	public void go_to_PM_Vacation_Approve_Page() {
		approveVacationButton.clickApproveVacationButton();
	}

	@Step
	public void clickVacationManagementItem() {
		vacationManagementIndexPage.clickVacationManagementItem();

	}

	@Step
	public void clickVacationApropve() {
		approveVacationButton.clickApproveVacationButton();

	}

}