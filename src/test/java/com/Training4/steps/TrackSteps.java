package com.Training4.steps;

import com.Training4.pages.TrackPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class TrackSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;

	TrackPage trackPage;

	@Step
	public void go_to_track() {
		trackPage.clickTrackItem();
	}

	// @Step
	// public void selectABuilding(String buildingName){
	// trackPage.selectABuilding(buildingName);
	// }
	//
	// @Step
	// public void clickBuildings(){
	// trackPage.clickBuildings();
	// }
	//
	// @Step
	// public void choose_building(String Option){
	// clickBuildings();
	// selectABuilding(Option);
	// }
	//

	// @Step
	// public void selectADepartmentStep(String departmentName){
	// trackPage.selectADepartment(departmentName);
	// }
	//
	// @Step
	// public void clickDepartments(){
	// trackPage.clickDepartments();
	// }
	//
	// @Step
	// public void choose_department(String Option){
	// clickDepartments();
	// selectADepartmentStep(Option);
	// }

	@Step
	public void selectAnItemFromADropDownList(String dropDownListName, String value) {
		trackPage.selectAnItemFromADropDownList(dropDownListName, value);
	}

	@Step
	public void clickApply() {
		trackPage.chooseApply();
	}
	
}
