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
import com.Training4.steps.LoginSteps;
import com.Training4.steps.MyRequestSteps;
import com.Training4.steps.NewVacationSteps;
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
	
	@Steps
	VacationsReportSteps exportMonth;
	
	@Steps
	VacationsReportSteps exportYear;
	
	@Steps
	VacationsReportSteps exportButton;
	
	@Steps
	VacationsReportSteps clickName;
	
	@Steps
	NewVacationSteps newVacationSteps;

	@Steps
	NewVacationSteps newVacationRequestSteps;
	
	
	

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
//		
//	}

//		@Test
		public void select_from_dropdown_list() throws InterruptedException {
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			trackSteps.go_to_track();
			trackSteps.selectAnItemFromADropDownList("Status" , "Withdrawn");
			trackSteps.clickApply();
			tableViewSteps.verifyThatTableContainsElement("Holiday");
	}
	
		
//		@Test
		public void search_by_name(){
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			vacationsReportSteps.go_to_vacations_report();
			enterLastName.type_last_name(Constants.LAST_N);
			enterFirstName.type_first_name(Constants.FIRST_N);
			searchButton.click_search_button();
			clickName.click_on_name();
			tableViewSteps.verifyThatTableContainsElement("Sergiu Bucerzan");
			}
		
//		@Test
		public void export_vacations(){
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			vacationsReportSteps.go_to_vacations_report();
			exportMonth.select_month();    // not finished
			exportYear.select_year();      // not finished
			trackSteps.selectAnItemFromADropDownList("August" , "2014");
			exportButton.click_export_button();
			
		}
		

		@Test
		public void create_vacations() throws ParseException {
			loginSteps.login_and_go_to_vacation(Constants.DM_USER, Constants.DM_PASS);
			newVacationSteps.goToNewVacation();			
			Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());
			newVacationRequestSteps.selectStartDate(11, 10, 2014);
			newVacationRequestSteps.selectEndDate(11, 10, 2014);
			newVacationSteps.goToSaveButton();
			newVacationSteps.get_content_t();
			newVacationSteps.goWithdraw();
			
		}
}