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
import com.Training4.steps.TableViewSteps;
import com.Training4.steps.TrackSteps;
import com.Training4.steps.VacationsReportSteps;

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

	@Steps
	TrackSteps trackSteps;
	
	@Steps
	MyRequestSteps myRequestSteps;
	
	@Steps
	VacationsReportSteps vacationsReportSteps;
	
	@Steps
	VacationsReportSteps enterLastName;
	
	@Steps
	VacationsReportSteps enterFirstName;
	
	@Steps
	VacationsReportSteps searchButton;
	

	// @Test
		public void successfull_login_test() {
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);

	}

	// @Test
		public void go_to_track() {
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			trackSteps.go_to_track();

	}
	
//		@Test
		public void go_to_vacations_report() {
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			vacationsReportSteps.go_to_vacations_report();
			tableViewSteps.verifyThatTableContainsElement("Sergiu");

		}
	// @Test
		public void verify_that_table_contains_element() {
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			trackSteps.go_to_track();
			tableViewSteps.verifyThatTableContainsElement("Alexandra");

	}

//		@Test
//		public void verify_buildings() throws InterruptedException {
//			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
//			trackSteps.go_to_track();
//			trackSteps.choose_building("Alpha Building");
//			trackSteps.clickApply();
		
//	}

//		@Test
		public void select_from_dropdown_list() throws InterruptedException {
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			trackSteps.go_to_track();
			trackSteps.selectAnItemFromADropDownList("Type" , "Holiday");
			trackSteps.clickApply();
			tableViewSteps.verifyThatTableContainsElement("Holiday");
	}
	
		
		@Test
		public void search_by_name(){
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			vacationsReportSteps.go_to_vacations_report();
			enterLastName.type_last_name(Constants.LAST_N);
			enterFirstName.type_first_name(Constants.FIRST_N);
			searchButton.click_search_button();
			tableViewSteps.verifyThatTableContainsElement("Sergiu Bucerzan");
			}
}