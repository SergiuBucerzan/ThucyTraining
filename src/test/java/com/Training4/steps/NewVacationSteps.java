package com.Training4.steps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.Training4.pages.LoginPage;
import com.Training4.pages.MainMenuPage;
import com.Training4.pages.NewVacationPage;
import com.Training4.tools.ReadEmail;

public class NewVacationSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	LoginPage loginPage;
	MainMenuPage mainMenuPage;
	NewVacationPage newvacationpage;
	
	ReadEmail verifyname;
	
	@Step
	public void goToNewVacation() {
		newvacationpage.clickNewVacation();
	}

	@Step
	public String get_content_title() {
		return newvacationpage.getContentTitle();
	}

	@Step
	public String get_content_titl() {
		return newvacationpage.getContentTitl();
	}
	
	@Step
	public void get_content_t() {
	 newvacationpage.checkState();
	}
	
	@Step
	public String get_content() {
	 return newvacationpage.getContentT();
	}

	@Step
	public void selectStartDate(int month, int day, int year)throws ParseException {
		newvacationpage.clickStartDateBox();
		newvacationpage.setDate(month, day, year);

	}
    @Step
	public void selectEndDate(int month, int day, int year)throws ParseException {
    	newvacationpage.clickEndDateBox();
    	newvacationpage.setDate(month, day, year);

	}

	@Step
	public void goToSaveButton() {
		newvacationpage.clickSaveButton();
	}

	@Step
	public void goToCancelButton() {
		newvacationpage.clickCancelButton();
	}

	@Step
	public void goVWithoutPayment() {
		newvacationpage.clickVWhitoutPay();
	}

	@Step
	public void goSpecialVacation() {
		newvacationpage.clickSpecialVacation();
	}

	@Step
	public void goSickVacation() {
		newvacationpage.clickSickVacation();
	}

	@Step
	public void chooseChildren() {
		newvacationpage.chooseChildBirth();
	}

	@Step
	public void addedComment() {
		newvacationpage.addComment();
	}

	@Step
	public void enters(String keyword) {
		newvacationpage.enter_comment(keyword);
	}

	@Step
	public void goWithdraw() {
		newvacationpage.clickWithdraw();
	}

	@Step
	public void goEdit() {
		newvacationpage.clickEdit();
	}
	
	@Step
	public void selectStartD(int month, int day, int year)throws ParseException {
		newvacationpage.clickStartDate();
		newvacationpage.setDate(month, day, year);

	}
    
	@Step
	public void selectEndD(int month, int day, int year)throws ParseException {
		newvacationpage.clickEndDate();
		newvacationpage.setDate(month, day, year);

	}
	
	@Step
	public void selectName(String user, String pass,String name,String startdate,String enddate){
		String bodymail= verifyname.verifyEmail(user, pass);
//		 String name="Raluca";
//		 String startdate="20/May/2015";
//		 String enddate="20/May/2015";
		// String mailul="Dear "+ name+ ", <br /><br />You have submitted a new Vacation Request. Your holiday interval is: <strong>"+startdate+"</strong> - <strong>"+enddate+"</strong>.<br />Please check if the request was approved before going on holiday, if not please contact your vacation approver, Mihai Arsin.<br/> <br/> Cheers, <br /> The EvoPortal Team";
	Assert.assertTrue("The text was not found", bodymail.contains(name));
		Assert.assertTrue("The text was not ", bodymail.contains(startdate));
		Assert.assertTrue("The text was not f", bodymail.contains(enddate));
		// Assert.assertTrue("The text was not found", bodymail.contentEquals(mailul));
		
	}
	
	
}