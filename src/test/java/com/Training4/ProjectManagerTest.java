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
import com.Training4.steps.PMVacationApproveSteps;
import com.Training4.steps.PMVacationRejectSteps;
import com.Training4.steps.VacationManagementInboxSteps;
import com.Training4.steps.VacationManagementViewVacationPageSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class ProjectManagerTest {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;
    
    @Steps
    LoginSteps loginSteps;
    
    @Steps
    VacationManagementInboxSteps viewInboxSteps;
    @Steps
    VacationManagementViewVacationPageSteps viewVacationSteps;
    @Steps
    PMVacationApproveSteps selectItemToApproveFromChecklistButton;
    @Steps
    PMVacationApproveSteps approveVacationButton;
    @Steps
    PMVacationRejectSteps selectItemToRejectFromChecklistButton;
    @Steps
    PMVacationRejectSteps rejectVacationButton;
    
    @Test
    public void create_vacation(){
    	loginSteps.login_and_go_to_vacation(Constants.PM_USER, Constants.PM_PASS);
    	viewInboxSteps.clickVacationManagementInboxItem();
    	viewVacationSteps.clickViewVacationItem();
    	selectItemToApproveFromChecklistButton.clickVacationManagementItem();
    	approveVacationButton.clickVacationManagementItem();
    }
} 