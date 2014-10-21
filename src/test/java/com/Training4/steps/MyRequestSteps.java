package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.MyRequestPage;

public class MyRequestSteps extends ScenarioSteps {

	MyRequestPage myrequestspage;
	MyRequestPage holidaybox;
	MyRequestPage daysnumber;
	MyRequestPage status;
	MyRequestPage apply;
	
	
	@Step
	public void go_to_MyRequestPage(){
		myrequestspage.clickMyRequestItem();
	}
	
	@Step
	public String get_content_title(){
		return myrequestspage.getContentTitle();
	}
    
	@Step
    public void select_Holiday(){
		holidaybox.clickHoliday();
	}
	
	@Step
	public void select_OneToFive(){
		daysnumber.clickOneToFive();
		
	}
	
	@Step
	public void select_ApprovedStatus(){
		status.clickApprovedstatus();
	}
	
	@Step
	public void select_ApplyButton(){
		apply.clickApplyButton();
	}
}