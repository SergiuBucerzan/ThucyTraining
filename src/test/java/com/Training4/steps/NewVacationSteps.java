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
	/*@Step
	public void clickSignInBtn(){
		loginPage.clickSignIn();
	}
	
	@Step
	public void typeUser(String user){
		loginPage.typeUser(user);
	}
	
	@Step
	public void typePass(String pass){
		loginPage.typePass(pass);
	}
	
	@Step
	public void go_to_vacation(){
		mainMenuPage.clickVacationMenuItem();
	}
	
	@StepGroup
	public void login_and_go_to_vacation(String username, String password){
		loginPage.open();
		typeUser(username);
		typePass(password);
		clickSignInBtn();
		go_to_vacation();
	}
	*/
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
}