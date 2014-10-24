package com.Training4.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.protobuf.TextFormat.ParseException;
import com.kenai.jffi.Array;

public class MyRequestPage extends PageObject {

	@FindBy(css = "a[href*='menuItem=my-requests']")
	private WebElement myRequestItem;

	@FindBy(css = "div.content-title")
	private WebElement contentTitle;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_HOLIDAYCheckbox")
	private WebElement holidayBox;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_SPECIAL_VACATIONCheckbox")
	private WebElement specialVacationBox;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_SICK_LEAVECheckbox")
	private WebElement SickLeaveBox;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_VACATION_WITHOUT_PAYMENTCheckbox")
	private WebElement VacationWithoutPaymentBox;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElement onetofive;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_TENTHCheckbox")
	private WebElement sixtoten;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_TWENTIETHCheckbox")
	private WebElement eleventotwenty;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_FIFTIETHCheckbox")
	private WebElement twentyone;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_RESTCheckbox")
	private WebElement fiftyone;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_APPROVEDCheckbox")
	private WebElement ApprovedStatus;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_PENDINGCheckbox")
	private WebElement pendingStatus;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_REJECTEDCheckbox")
	private WebElement rejectedStatus;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_WITHDRAWNCheckbox")
	private WebElement withdrawStatus;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_CANCELLEDCheckbox")
	private WebElement cancelledStatus;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement applyButton;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_vacationTypeALLCheckbox")
	private WebElement allVacationType;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_daysNumberALLCheckbox")
	private WebElement allDays;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_vacationStatusALLCheckbox")
	private WebElement allStatus;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement apply;

	@FindBy(css = "a[href*='orderByCol=startDate']")
	private WebElement startDate;

	public void clickMyRequestItem() {
		element(myRequestItem).waitUntilVisible();
		myRequestItem.click();
	}

	public String getContentTitle() {
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}

	public void clickHoliday() {
		element(holidayBox).waitUntilVisible();
		holidayBox.click();
	}

	public void clickOneToFive() {
		element(onetofive).waitUntilVisible();
		onetofive.click();
	}

	public void clickApprovedstatus() {
		element(ApprovedStatus).waitUntilVisible();
		ApprovedStatus.click();
	}

	public void clickApplyButton() {
		element(applyButton).waitUntilVisible();
		applyButton.click();
	}

	public void clickallVacationType() {
		element(allVacationType).waitUntilVisible();
		allVacationType.click();
	}

	public void clickallDays() {
		element(allDays).waitUntilVisible();
		allDays.click();
	}

	public void clickallStatus() {
		element(allStatus).waitUntilVisible();
		allStatus.click();
	}

	public void clickApply() {
		element(apply).waitUntilVisible();
		apply.click();
	}
		
	public void clickElevenToTwenty(){
			element(eleventotwenty).waitUntilVisible();
			eleventotwenty.click();
	}

	public void clickTwentyOne(){
		element(twentyone).waitUntilVisible();
		twentyone.click();
}
	
	public void clickFiftyOne(){
		element(fiftyone).waitUntilVisible();
		fiftyone.click();
}
	
	public void clickPendingStatus(){
		element(pendingStatus).waitUntilVisible();
		pendingStatus.click();
}
	
	public void clickRejectedStatus(){
		element(rejectedStatus).waitUntilVisible();
		rejectedStatus.click();
}
	
	public void clickWithdrawStatus(){
		element(withdrawStatus).waitUntilVisible();
		withdrawStatus.click();
}
	
	public void clickCancelledStatus(){
		element(cancelledStatus).waitUntilVisible();
		cancelledStatus.click();
}
	
	public void clickSpecialVacationBox(){
		element(specialVacationBox).waitUntilVisible();
		specialVacationBox.click();
}	
	
	public void clickSickLeaveBox(){
		element(SickLeaveBox).waitUntilVisible();
		SickLeaveBox.click();
}
	
	public void clickSixToTen(){
		element(sixtoten).waitUntilVisible();
		sixtoten.click();
}
	public void clickVacationWithoutPayment(){
		element(VacationWithoutPaymentBox).waitUntilVisible();
		VacationWithoutPaymentBox.click();
}
	

	public List<String> returnVacationTypeList() {
		List<WebElement> vacationTypeList = getDriver().findElements(
				By.cssSelector("td[class*='header.type'] a"));
		List<String> vacationTypeStrList = new ArrayList<String>();
		for (WebElement i : vacationTypeList) {
			vacationTypeStrList.add(i.getText());
		}
		return vacationTypeStrList;
	}

	public List<Integer> returnDaysNumberList() {
		List<WebElement> daysNumberList = getDriver().findElements(
				By.cssSelector("td[class*='day.number'] a"));
		List<Integer> daysNumberIntList = new ArrayList<Integer>();
		for (WebElement i : daysNumberList) {
			daysNumberIntList.add(Integer.parseInt(i.getText()));
		}
		return daysNumberIntList;
	}

	public List<String> returnvacationStatusList() {
		List<WebElement> vacationStatusList = getDriver().findElements(
				By.cssSelector("td[class*='header.status'] a"));
		List<String> vacationStatusStrList = new ArrayList<String>();
		for (WebElement i : vacationStatusList) {
			vacationStatusStrList.add(i.getText());
		}
		return vacationStatusStrList;
	}

	// public static Date dateFromString(String dateString)
	// throws java.text.ParseException, ParseException {
	// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy",
	// Locale.US);
	// Date date = null;
	// date = formatter.parse(dateString);
	// return date;
	// }

	public static Date stringToDate(String dateInString)
			throws java.text.ParseException, ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date date = formatter.parse(dateInString);
		System.out.println(date);
		System.out.println(formatter.format(date));
		return date;
	}

	public List<Date> returnDataList() throws ParseException,
			java.text.ParseException {
		List<WebElement> dataList = getDriver().findElements(
				By.cssSelector("td[class*='start.date'] a"));
		List<Date> listOfDates = new ArrayList<Date>();
		for (WebElement data : dataList) {
			System.out.println(data.getText());
			listOfDates.add((Date) stringToDate(data.getText())); // aici e
																	// bai!!
		}
		return listOfDates;

	}

	public void verifyThatDatesAreAscendentSorted() throws ParseException,
			java.text.ParseException {

		List<Date> list = returnDataList();
		for (int i = 0; i < list.size() - 2; i++) { // sau list.size()-2 avand
													// in vedere ca compara i cu
													// i+1 si sa nu dea
													// outOfIndex
			Date current = list.get(i);
			Date next = list.get(i + 1);
			Assert.assertTrue("Dates are not ascending!!!!",
					current.compareTo(next) < 0);
		}

	}

	public void clickStartDate() {
		element(startDate).waitUntilVisible();
		startDate.click();
	}

	public void verifyThatDatesAreDescendentSorted() throws ParseException,
			java.text.ParseException {

		List<Date> list = returnDataList();
		List<Date> orderedList = new ArrayList<Date>(list);
		
		orderedList.sort( new DateComparator());
		
		Assert.assertTrue("Dates are not descending!!!!", list.equals(orderedList));
		
		
		
//		for (int i = 0; i > list.size() - 2; i++) { // sau list.size()-2 avand
//													// in vedere ca compara i cu
//													// i+1 si sa nu dea
//													// outOfIndex
//			Date current = list.get(i);
//			Date next = list.get(i + 1);
//			Assert.assertTrue("Dates are not descending!!!!",
//					current.compareTo(next) > 0);
//			System.out.println("data este" + current);
//		}


	}

	public List<String> returnVacTypeList() {
		List<WebElement> vacTypeList = getDriver().findElements(
				By.cssSelector("div[class='aui-column-content aui-column-content-first column-three-content ']"));
		List<String> vacationTypeStrList = new ArrayList<String>();
		for (WebElement i : vacTypeList) {
			vacationTypeStrList.add(i.getText());
		}
		return vacationTypeStrList;
	}

	public List<String> returnVacationDayNumberList() {
		List<WebElement> vacationDayNumberList = getDriver().findElements(
				By.cssSelector("div[class='aui-column-content column-three-content column-center-content ']"));
		List<String> vacationDayNumList = new ArrayList<String>();
		for (WebElement i : vacationDayNumberList) {
			vacationDayNumList.add(i.getText());
		}
		return vacationDayNumList;
	}
	
	public List<String> returnvacaStatusList() {
		List<WebElement> vacStatusList = getDriver().findElements(
				By.cssSelector("div[class='aui-column column-three column-center aui-column-last']"));
		List<String> vacationStatusStrList = new ArrayList<String>();
		for (WebElement i : vacStatusList) {
			vacationStatusStrList.add(i.getText());
		}
		return vacationStatusStrList;
	}
	
	public void selectOperation(String type) {
	 boolean found = false;
	   List<WebElement> elements = getDriver().findElements(By.cssSelector("div[class='aui-column-content aui-column-content-first column-three-content '] div div[class='column-content'] label"));
	   for (WebElement element : elements) {
	    System.out.println(element.getText());

	    if (element.getText().replaceAll("\\s","").toLowerCase()
	    		.equals(type.replaceAll("\\s","").toLowerCase())) {
	     found = true;
	     if (!element.isSelected())
	      element.click();
	     break;
	    }

	   }
	   Assert.assertTrue("type not found", found);
	  }
	
	public void selectDaysNumber(String day) {
		 boolean found = false;
		   List<WebElement> elements = getDriver().findElements(By.cssSelector("div[class='aui-column-content column-three-content column-center-content '] div div[class='column-content'] label"));
		   for (WebElement element : elements) {
		    System.out.println(element.getText());

		    if (element.getText().replaceAll("\\s","").toLowerCase()
		    		.equals(day.replaceAll("\\s","").toLowerCase())) {
		     found = true;
		     if (!element.isSelected())
		      element.click();
		     break;
		    }

		   }
		   Assert.assertTrue("days not found", found);
		  }
	
	public void selectStatus(String status) {
		 boolean found = false;
		   List<WebElement> elements = getDriver().findElements(By.cssSelector("div[class='aui-column-content column-three-content column-center-content '] div div[class='column-content'] label"));
		   for (WebElement element : elements) {
		    System.out.println(element.getText());

		    if (element.getText().replaceAll("\\s","").toLowerCase()
		    		.equals(status.replaceAll("\\s","").toLowerCase())) {
		     found = true;
		     if (!element.isSelected())
		      element.click();
		     break;
		    }

		   }
		   Assert.assertTrue("status not found", found);
		  }
}



