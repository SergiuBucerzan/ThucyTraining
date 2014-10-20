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

import com.Training4.pages.VacationManagementIndexPage;
import com.Training4.requirements.Application;
import com.Training4.steps.LoginSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class VacationManagementItemSteps {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;

    LoginSteps loginSteps;

    VacationManagementIndexPage vacationManagementIndexPage;
    
	public void clickVacationManagementItem() {
		vacationManagementIndexPage.clickVacationManagementItem();
		
	}
   
}