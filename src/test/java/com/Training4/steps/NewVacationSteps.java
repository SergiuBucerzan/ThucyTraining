package com.Training4.steps;

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
	
}