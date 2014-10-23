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
import com.Training4.steps.NewVacationSteps;

@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class EndUser1Test {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	LoginSteps loginSteps;

	@Steps
	NewVacationSteps newVacationSteps;

	@Steps
	NewVacationSteps newVacationRequestSteps;

	

	// @Test
	public void create_vacations() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
		Assert.assertEquals("Create a new vacation request",
				newVacationSteps.get_content_title());

		newVacationRequestSteps.selectStartDate(10, 15, 2014);
		newVacationRequestSteps.selectEndDate(10, 15, 2014);
		newVacationSteps.goToSaveButton();
	}

	// @Test
	public void cancel_vacations() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
		// Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());

		newVacationRequestSteps.selectStartDate(1, 22, 2014);
		newVacationRequestSteps.selectEndDate(1, 22, 2014);
		newVacationSteps.goToSaveButton();
	}

	// @Test
	public void create_vacation_withoutPayment() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
		// Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());

		newVacationRequestSteps.selectStartDate(1, 22, 2014);
		newVacationRequestSteps.selectEndDate(1, 22, 2014);
		newVacationSteps.goVWithoutPayment();
		newVacationSteps.goToSaveButton();
	}

	// @Test
	public void create_special_vacation() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
		// Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());

		newVacationRequestSteps.selectStartDate(9, 22, 2014);
		newVacationRequestSteps.selectEndDate(9, 22, 2014);
		newVacationSteps.goSpecialVacation();
		newVacationSteps.goToSaveButton();
	}

	// @Test
	public void create_special_vacation_ChildBirth() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
		// Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());

		newVacationRequestSteps.selectStartDate(9, 22, 2014);
		newVacationRequestSteps.selectEndDate(9, 22, 2014);
		newVacationSteps.goSpecialVacation();
		newVacationSteps.chooseChildren();
		newVacationSteps.goToSaveButton();
	}

	// @Test
	public void create_sick_vacation() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
		// Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());
		newVacationRequestSteps.selectStartDate(9, 23, 2014);
		newVacationRequestSteps.selectEndDate(9, 23, 2014);
		newVacationSteps.goSickVacation();
		newVacationSteps.goToSaveButton();
	}

	// @Test
	public void create_comment() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
	//	Assert.assertEquals("Create a new vacation request",	newVacationSteps.get_content_title());
		newVacationRequestSteps.selectStartDate(10, 24, 2014);
		newVacationRequestSteps.selectEndDate(10, 24, 2014);
		newVacationSteps.addedComment();
		newVacationSteps.enters("primul comentariu");
		newVacationSteps.goToSaveButton();
	}

	// @Test
	public void create_vacations_and_withdraw() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
		newVacationRequestSteps.selectStartDate(7, 18, 2014);
		newVacationRequestSteps.selectEndDate(7, 18, 2014);
		newVacationSteps.goToSaveButton();
		newVacationSteps.goWithdraw();
		Assert.assertEquals("There are no actions for a Withdrawn vacation.",newVacationSteps.get_content_titl());
	}

	@Test
	public void create_vacations_and_edit() throws ParseException {

		loginSteps.login_and_go_to_vacation(Constants.END_USER1,
				Constants.END_PASS1);
		newVacationSteps.goToNewVacation();
	    Assert.assertEquals("Create a new vacation request",newVacationSteps.get_content_title());
		newVacationRequestSteps.selectStartDate(8, 19, 2014);
		newVacationRequestSteps.selectEndDate(8, 19, 2014);
		newVacationSteps.goToSaveButton();
		newVacationSteps.goEdit();
	
	}

}