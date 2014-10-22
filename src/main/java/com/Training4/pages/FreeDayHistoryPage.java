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
	
	public void clickFreeDays(){
		element(free).waitUntilVisible();
		free.click();
	}
	
	public String getContentTitle(){
		element(contentTitle).waitUntilVisible();
		return contentTitle.getText();
	}
	
}