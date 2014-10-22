package com.Training4.pages;

import net.thucydides.core.annotations.findby.By;
import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.findby.FindBy;
import ch.lambdaj.function.convert.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import static ch.lambdaj.Lambda.convert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.WebElementFacade;

public class FreeDayHistoryPage extends PageObject {
	
	@FindBy(css="a[href*='menuItem=free-days-history']")
	private WebElement free;
	
	@FindBy(css=".content-title")
	private WebElement contentTitle;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_COCheckbox")
	private WebElement VacationDays;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElement onetofive;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_ADDED_DAYSCheckbox")
	private WebElement AddedDays;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElement applyButton;
	
	public void clickFreeDays(){
		element(free).waitUntilVisible();
		free.click();
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}
	
	public void clickHoliday (){
		element(VacationDays).waitUntilVisible();
		VacationDays.click();
	}
	
	public void clickOneToFive(){
		element(onetofive).waitUntilVisible();
		onetofive.click();
	}
	
	public void clickApprovedstatus(){
		element(AddedDays).waitUntilVisible();
		AddedDays.click();
	}
	
	public void clickApplyButton(){
		element(applyButton).waitUntilVisible();
		applyButton.click();
	}
	
}