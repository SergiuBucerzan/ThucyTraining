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
	
	@Step
	public void checkVacationDaysNumberNotContain(int min , int max){
		List<Integer> daysNumberList = myrequestspage.returnDaysNumberList();
		System.out.println(daysNumberList.size());
		for(Integer day:daysNumberList){
			System.out.println(String.valueOf(day));
		
		//	Assert.assertTrue("Nooooooooooooo!!!", day >= min && day <= max  );
			Assert.assertTrue("Nooooooooooooo!!!", (day.compareTo(min) > 0 ||day.compareTo(min) == 0) && (day.compareTo(max) < 0 || day.compareTo(max) == 0)) ;	
		}
		}
			
		@Step
		public void checkVacationStatusDoesNotContain(String vacationStatusNotWanted){
			List<String> vacationStatusList = myrequestspage. returnvacationStatusList();
			Assert.assertTrue("Vacation type contains element that should not be there after filter!!!", vacationStatusList.contains(vacationStatusNotWanted));
		}
	
}



