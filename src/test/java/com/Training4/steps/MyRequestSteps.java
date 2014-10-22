package com.Training4.steps;

import java.util.List;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.MyRequestPage;

public class MyRequestSteps extends ScenarioSteps {

	MyRequestPage myrequestspage;
	
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
		myrequestspage.clickHoliday();
	}
	
	@Step
	public void select_OneToFive(){
		myrequestspage.clickOneToFive();
		
	}
	
	@Step
	public void select_ApprovedStatus(){
		myrequestspage.clickApprovedstatus();
	}
	
	@Step
	public void select_ApplyButton(){
		myrequestspage.clickApplyButton();
	}
	
	@Step
	public void select_allVacationType(){
		myrequestspage.clickallVacationType();
	}
	
	@Step
	public void select_allDays(){
		myrequestspage.clickallDays();
	}
	
	@Step
	public void select_allStatus(){
		myrequestspage.clickallStatus();
	}
	
	@Step
	public void select_Apply(){
		myrequestspage.clickApply();
	}
	
	@Step
	public void checkVatationTypeDoesNotContain(String vacationTypeNotWanted){
		List<String> vacationTypeList = myrequestspage.returnVacationTypeList();
		Assert.assertFalse("Vacation type contains element that should not be there after filter!!!", vacationTypeList.contains(vacationTypeNotWanted));
	}
	
	
}



