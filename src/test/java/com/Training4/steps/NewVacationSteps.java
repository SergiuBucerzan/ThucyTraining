package com.Training4.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.LoginPage;
import com.Training4.pages.MainMenuPage;
import com.Training4.pages.NewVacationPage;

public class NewVacationSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LoginPage loginPage;
	MainMenuPage mainMenuPage;
	NewVacationPage newvacationpage;
	NewVacationPage butonul;
	NewVacationPage newVacationRequestPage;
	NewVacationPage vacationFara;
	NewVacationPage special;
	NewVacationPage sick;
	NewVacationPage child;
	NewVacationPage comm;
	NewVacationPage withDraw;
	
	@Step
	public void goToNewVacation(){
		newvacationpage.clickNewVacation();
	}
	
	@Step
	public String get_content_title(){
		return newvacationpage.getContentTitle();
	}

	@Step
	 public void selectStartDate(int month, int day, int year) throws ParseException
	 {
	  newVacationRequestPage.clickStartDateBox();
	  newVacationRequestPage.setDate(month, day, year);
	  
	 }
	
	 public void selectEndDate(int month, int day, int year) throws ParseException {
		  newVacationRequestPage.clickEndDateBox();
		  newVacationRequestPage.setDate(month, day, year);
		  
		 }
	
	 @Step
		public void goToSaveButton(){
			butonul.clickSaveButton();
		}
	 
	 @Step
		public void goToCancelButton(){
			butonul.clickCancelButton();
		}
	 
	 @Step
		public void goVWithoutPayment(){
		 vacationFara.clickVWhitoutPay();
		}
	 
	 @Step
		public void goSpecialVacation(){
		 special.clickSpecialVacation();
		}
	 
	 @Step
		public void goSickVacation(){
		 sick.clickSickVacation();
		}
	 
	 @Step
		public void chooseChildren(){
		 child.chooseChildBirth();
		}
	 
	 @Step
		public void addedComment(){
			comm.addComment();
		}
		
	 @Step
	    public void enters(String keyword) {
	        comm.enter_comment(keyword);
	    }
	 
	 @Step
		public void goWithdraw(){
		 withDraw.clickWithdraw();
		}
}