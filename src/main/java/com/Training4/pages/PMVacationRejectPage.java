package com.Training4.pages;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import ch.lambdaj.function.convert.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

public class PMVacationRejectPage extends PageObject {
	
	@FindBy(css="_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-rowChecker_row-1")
	private WebElementFacade selectItemToRejectFromChecklistButton;
	
	@FindBy(css="_evovacation_WAR_EvoVacationportlet_multipleRejectButton")
	private WebElementFacade rejectVacationButton;
	 
	@FindBy(css="a[href*='menuItem=new-request']")
	private WebElement newvacation;
	
	@FindBy(css="div.content-title")
	private WebElement contentTitle;
	
	@FindBy(css = "div[style*='block'] td.dp_next")
	private WebElementFacade nextButton;

	@FindBy(css = "div[style*='block'] td.dp_previous")
	private WebElementFacade previousButton;

	 
	public void select_nth_request(int n){
		List<WebElement> requestsList = getDriver().findElements(By.cssSelector("input[type='checkbox'][value]"));
		
		element(requestsList.get(n)).click();
	 
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}
	

	public void clickSelectItemFromChecklistButton (){
		selectItemToRejectFromChecklistButton.click();
	}
	
	public void clickRejectVacationButton(){
		rejectVacationButton.click();
	}
	
}
	