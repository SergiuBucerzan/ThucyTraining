package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.FreeDayHistoryPage;

public class FreeDaysHistorySteps extends ScenarioSteps {

	FreeDayHistoryPage freeDays;

	@Step
	public void goToFreeDays() {
		freeDays.clickFreeDays();
	}

	@Step
	public String get_content_title() {
		return freeDays.getContentTitle();

	}

	@Step
	public void select_Holiday() {
		freeDays.clickHoliday();
	}

	@Step
	public void select_OneToFive() {
		freeDays.clickOneToFive();

	}

	@Step
	public void select_ApprovedStatus() {
		freeDays.clickApprovedstatus();
	}

	@Step
	public void select_ApplyButton() {
		freeDays.clickApplyButton();
	}

	@Step
	public void select_Filter(String label) {
		freeDays.clickFilter(label);

	}

}