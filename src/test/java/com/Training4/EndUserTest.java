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
import com.Training4.steps.MyRequestSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class EndUserTest {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;
    
    @Steps
    LoginSteps loginSteps;
    
    @Steps
    MyRequestSteps myRequestSteps;
    
    @Test
    public void create_vacation(){
    	loginSteps.login_and_go_to_vacation(Constants.END_USER, Constants.END_PASS);
    	myRequestSteps.go_to_MyRequestPage();
    	
    	
    	//Assert.assertEquals("Content title is not as expected!!!", myRequestSteps.get_content_title().contentEquals("Filters requests"));
    	Assert.assertEquals("Filter requests", myRequestSteps.get_content_title());
    	
    	myRequestSteps.select_Holiday();
    	myRequestSteps.select_OneToFive();
    	myRequestSteps.select_ApprovedStatus();
    	myRequestSteps.select_ApplyButton();
//    	
//    	myRequestSteps.select_allVacationType();
//    	myRequestSteps.select_allDays();
//    	myRequestSteps.select_allStatus();
//    	myRequestSteps.select_Apply();
//    	
    	myRequestSteps.checkVatationTypeDoesNotContain("Special Vacation");
    	myRequestSteps.checkVacationDaysNumberNotContain(1,5);
    	myRequestSteps.checkVacationStatusDoesNotContain("Approved");
    }
 
} 