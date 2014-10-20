package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {
	//private static final long serialVersionUID = 1L;
	//LoginPage dictionaryPage;
	LoginPage loginPage;
	
	@Step
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
	
	@StepGroup
	public void login(String username, String password){
		//getDriver().get("http://192.168.1.68:9090/login");
		loginPage.open();
		typeUser(username);
		typePass(password);
		clickSignInBtn();
	}
	
//    @Step
//    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        dictionaryPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        dictionaryPage.open();
//    }
//
//    @Step
//    public void looks_for(String term) {
//        enters(term);
//        starts_search();
//    }
}