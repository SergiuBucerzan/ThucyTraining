package com.Training4.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class VacationsReportPage extends PageObject{


	@FindBy(css = "a[href*='vacation-report']")
	private WebElement vacationReport;
	

	public void clickVacationsReport() {
		element(vacationReport).waitUntilVisible();
		vacationReport.click();
		
	}

	
}
