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