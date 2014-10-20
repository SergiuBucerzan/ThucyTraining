package com.Training4;

import net.thucydides.core.annotations.Managed;

import com.Training4.tools.Constants; 

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Training4.requirements.Application;
import com.Training4.steps.LoginSteps;
import com.Training4.steps.NewVacationSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class EndUser1Test {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;
    
    @Steps
    LoginSteps loginSteps;
    
    @Steps
    NewVacationSteps newVacationSteps;
    
    @Test
    public void create_vacations(){

    	loginSteps.login_and_go_to_vacation(Constants.END_USER1, Constants.END_PASS1);
    	newVacationSteps.goToNewVacation();
    	//Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());
    }
    
//    @Test
//    public void GoIntoNewVacation(){
//    	
//    }
 
} 