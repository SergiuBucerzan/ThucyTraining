package com.Training4.pages;

import java.util.List;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class VacationManagementViewVacationsPage extends PageObject {

	@FindBy(css="a[href*='menuItem=view-vacations']")
	private WebElement viewVacationItem;
	
	@FindBy(css="div.content-title")
	private WebElement contentTitle;
	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_viewVacationsTypeALLCheckbox")
//	private WebElement AllVacationTypeBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
//	private WebElement HolydayBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
//	private WebElement VacationWithoutPaymentBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
//	private WebElement SpecialVacationBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
//	private WebElement SickLeaveBox;
//	
//	@FindBy (css="_evovacation_WAR_EvoVacationportlet_viewDaysNumberALLCheckbox")
//	private WebElement AllNumberDaysBox;
//	
//	@FindBy (css="_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
//	private WebElement oneToFiveBox;
//	
//	@FindBy (css="_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
//	private WebElement sixToTenBox;
//	
//	@FindBy (css="_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
//	private WebElement elevenToTwentyBox;
//	
//	@FindBy (css="_evovacation_WAR_EvoVacationportlet_FIFTIETHCheckbox")
//	private WebElement twentyOneToFiftyBox;
//	
//	@FindBy (css="_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
//	private WebElement fiftyPlusBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_viewVacationStatusALLCheckbox")
//	private WebElement AllVacationStatusBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
//	private WebElement PendingStatusBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
//	private WebElement ApprovedStatusBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
//	private WebElement RejectedStatusBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
//	private WebElement WithdrawnStatusBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_CANCELLEDCheckbox")
//	private WebElement CancelledStadusBox;
//	
//	@FindBy(css="_evovacation_WAR_EvoVacationportlet_inactiveUsersCheckbox")
//	private WebElement ShowInactiveUsersBox;
	
	@FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_applyButton']")
	private WebElement applyButton;
	
	public void selectVacationType(String vacationType) {
		  boolean found = false;
		  List<WebElement> elements = getDriver()
		    .findElements(
		      By.cssSelector("div[class='aui-column-content aui-column-content-first column-three-content '] div[class='column-content'] label"));
		   System.out.println(elements.size());
		  for (WebElement element : elements) {
		   System.out.println(element.getText());

		   if (element.getText().toLowerCase()
		     .contains(vacationType.toLowerCase())) {
		    found = true;
		    if (!element.isSelected())
		     element.click();
		    break;
		   }

		  }
		  Assert.assertTrue("Vacation type was not found!", found);

		 }
	
	public void selectDaysNumber(String vacationType) {
		  boolean found = false;
		  List<WebElement> elements = getDriver()
		    .findElements(
		      By.cssSelector("div[class='aui-column-content column-three-content column-center-content '] div[class='column-content'] label"));
		   System.out.println(elements.size());
		  for (WebElement element : elements) {
		   System.out.println(element.getText());

		   if (element.getText().toLowerCase()
		     .contains(vacationType.toLowerCase())) {
		    found = true;
		    if (!element.isSelected())
		     element.click();
		    break;
		   }

		  }
		  Assert.assertTrue("Vacation type was not found!", found);

		 }
	
	public void selectVacationStatus(String vacationType) {
		  boolean found = false;
		  List<WebElement> elements = getDriver()
		    .findElements(
		      By.cssSelector("div[class='aui-column-content aui-column-content-last column-three-content column-center-content '] div[class='column-content'] label"));
		   System.out.println(elements.size());
		  for (WebElement element : elements) {
		   System.out.println(element.getText());

		   if (element.getText().toLowerCase()
		     .contains(vacationType.toLowerCase())) {
		    found = true;
		    if (!element.isSelected())
		     element.click();
		    break;
		   }

		  }
		  Assert.assertTrue("Vacation type was not found!", found);

		 }
		
	public void clickViewVacationItem(){
		element(viewVacationItem).waitUntilVisible();
		viewVacationItem.click();
	}
	
	public void clickApplyButton(){
		applyButton.click(); 
	}

}