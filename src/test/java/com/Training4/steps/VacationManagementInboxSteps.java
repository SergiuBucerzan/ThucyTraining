package com.Training4.steps;

import net.thucydides.core.annotations.Managed;

import com.Training4.tools.Constants; 

import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Training4.pages.VacationManagementInboxPage;
import com.Training4.requirements.Application;
import com.Training4.steps.LoginSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class VacationManagementInboxSteps {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;

    LoginSteps loginSteps;

    VacationManagementInboxPage vacationManagementInboxPage;
    @Step
	public void clickVacationManagementInboxItem() {
		vacationManagementInboxPage.clickVacationManagementItem();
		
	}
   
}