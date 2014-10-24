package com.Training4.steps;

import java.util.Date;
import java.util.List;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.MyRequestPage;
import com.google.protobuf.TextFormat.ParseException;

public class MyRequestSteps extends ScenarioSteps {

	MyRequestPage myrequestspage;

	@Step
	public void go_to_MyRequestPage() {
		myrequestspage.clickMyRequestItem();
	}

	@Step
	public String get_content_title() {
		return myrequestspage.getContentTitle();
	}

	@Step
	public void select_Holiday() {
		myrequestspage.clickHoliday();
	}
	
	@Step
	public void select_SickLeaveBox() {
		myrequestspage.clickSickLeaveBox();
	}
	
	@Step
	public void select_SpecialVacationBox() {
		myrequestspage.clickSpecialVacationBox();
	}
	
	@Step
	public void select_VacationWithoutPayment() {
		myrequestspage.clickVacationWithoutPayment();
	}
	
	@Step
	public void select_SixToTen() {
		myrequestspage.clickSixToTen();
	}
	
	@Step
	public void select_ElevenToTwenty() {
		myrequestspage.clickElevenToTwenty();
	}
	
	@Step
	public void select_TwentyOne() {
		myrequestspage.clickTwentyOne();
	}
	
	@Step
	public void select_FiftyOne() {
		myrequestspage.clickFiftyOne();
	}
	
	@Step
	public void select_PendingStatus() {
		myrequestspage.clickPendingStatus();
	}
	
	@Step
	public void select_CancelledStatus() {
		myrequestspage.clickCancelledStatus();
	}
	
	@Step
	public void select_WithdrawStatus() {
		myrequestspage.clickWithdrawStatus();
	}
	
	@Step
	public void select_RejectedStatus() {
		myrequestspage.clickRejectedStatus();
	}
	

	@Step
	public void select_OneToFive() {
		myrequestspage.clickOneToFive();

	}

	@Step
	public void select_ApprovedStatus() {
		myrequestspage.clickApprovedstatus();
	}

	@Step
	public void select_ApplyButton() {
		myrequestspage.clickApplyButton();
	}

	@Step
	public void select_allVacationType() {
		myrequestspage.clickallVacationType();
	}

	@Step
	public void select_allDays() {
		myrequestspage.clickallDays();
	}

	@Step
	public void select_allStatus() {
		myrequestspage.clickallStatus();
	}

	@Step
	public void select_Apply() {
		myrequestspage.clickApply();
	}

	@Step
	public void checkVatationTypeDoesNotContain(String vacationTypeNotWanted) {
		List<String> vacationTypeList = myrequestspage.returnVacationTypeList();
		Assert.assertFalse(
				"Vacation type contains element that should not be there after filter!!!",
				vacationTypeList.contains(vacationTypeNotWanted));
	}
	
	@Step
	public void checkVatationTypeOnlyContains(String vacationTypeExpected) {
		List<String> vacationTypeList = myrequestspage.returnVacationTypeList();
		Assert.assertTrue(
				"Vacation type contains element that should not be there after filter!!!",
				vacationTypeList.contains(vacationTypeExpected));
	}

	@Step
	public void checkVacationStatusOnlyContains(String vacationStatusExpected) {
		List<String> vacationStatusList = myrequestspage.returnvacationStatusList();
		Assert.assertTrue(
				"Vacation type contains element that should not be there after filter!!!",
				vacationStatusList.contains(vacationStatusExpected));
	}
	
	@Step
	public void checkVacationDaysNumberNotContain(int min, int max) {
		List<Integer> daysNumberList = myrequestspage.returnDaysNumberList();
		System.out.println(daysNumberList.size());
		for (Integer day : daysNumberList) {
			System.out.println(String.valueOf(day));

			// Assert.assertTrue("Nooooooooooooo!!!", day >= min && day <= max
			// );
			Assert.assertTrue(
					"Nooooooooooooo!!!",
					(day.compareTo(min) > 0 || day.compareTo(min) == 0)
							&& (day.compareTo(max) < 0 || day.compareTo(max) == 0));
		}
	}

//	@Step
//	public void checkVacationStatusDoesNotContain(String vacationStatusNotWanted) {
//		List<String> vacationStatusList = myrequestspage
//				.returnvacationStatusList();
//		Assert.assertTrue(
//				"Vacation type contains element that should not be there after filter!!!",
//				vacationStatusList.contains(vacationStatusNotWanted));
//	}
	
	@Step
	public void verifyThatDatesAreAscendentSorted() throws ParseException, java.text.ParseException{
		myrequestspage.verifyThatDatesAreAscendentSorted();
	}
	
	@Step
	public void select_startDate() {
		myrequestspage.clickStartDate();
	}

	@Step
	public void verifyThatDatesAreDescendentSorted() throws ParseException, java.text.ParseException{
		myrequestspage.verifyThatDatesAreDescendentSorted();
	}
	@Step
	public void checkVacationTypeContain(String vacationTypeWanted) {
		List<String> vacationTypeList = myrequestspage.returnVacationTypeList();
		for (String item:vacationTypeList){
		Assert.assertTrue("Vacation type contains element that should not be there after filter!!!",item.contentEquals(vacationTypeWanted));
		}
	}
	
	@Step
	  public void checkVacationStatusContain(String vacationStatusWanted){
	  boolean verificare = true;
	  List<String> vacationTypeList = myrequestspage.returnVacationTypeList();
	  for (String item:vacationTypeList){
	    if (!item.contentEquals(vacationStatusWanted)){
	    verificare=false;
	    } 
	  }  
	  Assert.assertTrue("Vacation type contains element that should not be there after filter!!!", verificare);
	  }


	@Step
	public void checkVacationStatusDoesNotContain(String vacationStatusNotWanted) {
		List<String> vacationStatusList = myrequestspage
				.returnvacationStatusList();
		Assert.assertTrue(
				"Vacation type contains element that should not be there after filter!!!",
				vacationStatusList.contains(vacationStatusNotWanted));
	}
	

	
	
}
