package com.Training4.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.FreeDayHistoryPage;
import com.Training4.pages.LoginPage;
import com.Training4.pages.MainMenuPage;
import com.Training4.pages.MyFreeDaysPage;
import com.Training4.pages.NewVacationPage;

public class FreeDaysDanaSteps extends ScenarioSteps {

	MyFreeDaysPage freedays;
	
	@Step
	public void goToFreedays(){
		freedays.clickFreedays();
	}
	
	@Step
	public String get_content_title(){
		return freedays.getContentTitle();
	}

    @Step
    public void clickBackButton(){
    	freedays.clickBack();
    }
	
}
