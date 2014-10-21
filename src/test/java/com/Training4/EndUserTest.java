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
    
    @Steps
    MyRequestSteps holiday;
    
    @Steps
    MyRequestSteps onetofive;
    
    @Steps
    MyRequestSteps approved;
    
    @Steps
    MyRequestSteps apply;
    
    @Steps
    MyRequestSteps alltype;
    
    @Steps
    MyRequestSteps alldays;
    
    @Steps
    MyRequestSteps allstatus;
    
    @Steps
    MyRequestSteps applyButton;
    
    @Test
    public void create_vacation(){
    	loginSteps.login_and_go_to_vacation(Constants.END_USER, Constants.END_PASS);
    	myRequestSteps.go_to_MyRequestPage();
    	
    	
    	//Assert.assertEquals("Content title is not as expected!!!", myRequestSteps.get_content_title().contentEquals("Filters requests"));
    	Assert.assertEquals("Filter requests", myRequestSteps.get_content_title());
    	holiday.select_Holiday();
    	onetofive.select_OneToFive();
    	approved.select_ApprovedStatus();
    	apply.select_ApplyButton();
    	alltype.select_allVacationType();
    	alldays.select_allDays();
    	allstatus.select_allStatus();
    	applyButton.select_Apply();
    }
 
} 