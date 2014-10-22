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

public class PMVacationApprovePage extends PageObject {
	
	@FindBy(css="_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-rowChecker_row-1")
	private WebElementFacade selectItemToApproveFromChecklistButton;
	
	@FindBy(css="evovacation_WAR_EvoVacationportlet_multipleApproveButton")
	private WebElementFacade approveVacationButton;
	
	@FindBy(css="div.content-title")
	private WebElement contentTitle;
	
	
	public void select_nth_request(int n){
		
		List<WebElement> requestsList = getDriver().findElements(By.cssSelector("input[type='checkbox'][value]"));
		
		element(requestsList.get(n)).click();
	 
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}

	
	public void clickSelectItemFromChecklistButton (){
		element(selectItemToApproveFromChecklistButton).waitUntilVisible();
		selectItemToApproveFromChecklistButton.click();
	}
	
	public void clickApproveVacationButton(){
		approveVacationButton.click();
	}

	
}
	