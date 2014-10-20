package com.Training4.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Training4.pages.MyRequestPage;

public class MyRequestSteps extends ScenarioSteps {

	MyRequestPage myrequestspage;
	
	@Step
	public void go_to_MyRequestsPage(){
		myrequestspage.clickMyRequestItem();
	}
	
	@Step
	public String get_content_title(){
		return myrequestspage.getContentTitle();
	}
}