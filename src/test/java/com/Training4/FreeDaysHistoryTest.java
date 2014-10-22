package com.Training4;

import java.text.ParseException;

import net.thucydides.core.annotations.Managed;
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
import com.Training4.steps.FreeDaysSteps;
import com.Training4.steps.LoginSteps;
import com.Training4.tools.Constants;



@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)

public class FreeDaysHistoryTest {
    
	@Managed(uniqueSession = true)
    public WebDriver webdriver;
    
    @ManagedPages(defaultUrl = Constants.BASE_URL)
    public Pages pages;
    
    @Steps
    LoginSteps loginSteps;
    
    
    @Steps
    FreeDaysSteps freeDaysH;
    
    @Test
    public void view_freedays() throws ParseException{

    	loginSteps.login_and_go_to_vacation(Constants.END_USER1, Constants.END_PASS1);
    	freeDaysH.goToFreeDays();
    	Assert.assertEquals("Filter History",freeDaysH.get_content_title());
    }
}