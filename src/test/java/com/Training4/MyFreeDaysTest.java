package com.Training4;

import java.text.ParseException;

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
import com.Training4.steps.FreeDaysDanaSteps;
import com.Training4.steps.FreeDaysHistorySteps;
import com.Training4.steps.LoginSteps;
import com.Training4.steps.NewVacationSteps;



@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)

public class MyFreeDaysTest {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;
    
    @Steps
    LoginSteps loginSteps;
    
    
    @Steps
    FreeDaysDanaSteps freeDays;
    
    @Test
    public void view_freedays() {

    	loginSteps.login_and_go_to_vacation(Constants.END_USER, Constants.END_PASS);
    	freeDays.goToFreedays();
    	Assert.assertEquals("My Free Days",freeDays.get_content_title());
    	freeDays.clickBackButton();
    }
}