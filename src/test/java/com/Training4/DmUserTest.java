package com.Training4;

import net.thucydides.core.annotations.Managed;

import com.Training4.tools.Constants; 

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Training4.requirements.Application;
import com.Training4.steps.LoginSteps;
import com.Training4.steps.TableViewSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class DmUserTest {
    


	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;
    
    @Steps
    LoginSteps loginSteps;
    
    @Steps
    TableViewSteps tableViewSteps;
    
    @Test
    public void successfull_login_test(){
    	loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
    	tableViewSteps.go_to_track();
		tableViewSteps.verifyThatTableContainsElement("Name"); 
    }
    	  	
    
 
} 