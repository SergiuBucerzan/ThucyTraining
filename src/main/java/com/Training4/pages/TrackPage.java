package com.Training4.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class TrackPage extends PageObject{


	@FindBy(css = "a[href*='menuItem=vacation-tracker']")
	private WebElement trackItem;

	@FindBy(css = "tr[class*='results-row']")
	private List<WebElement> rows;


	
	@FindBy(css = "div[class='vacation-tracker-filter'] div:nth-child(2) div[id='buildings'] dl dt div")
	private WebElement buildings;
	
	@FindBy(css = "span[class='aui-button-content'] input")
	private WebElement clickApply;
	
//	@FindBy(css = "div[class='vacation-tracker-filter'] div:nth-child(2) div[id=departments] dl dt div")
//	private WebElement departments;
	


	public void clickTrackItem() {
		element(trackItem).waitUntilVisible();
		trackItem.click();

	}
	
//	public void clickBuildings(){
//		element(buildings).waitUntilVisible();
//		buildings.click();
//	
//	}
	
	public void chooseApply(){
		clickApply.click();
	}
	
//	public void clickDepartments(){
//		element(departments).waitUntilVisible();
//		departments.click();
//	}
	
	
//	public void selectABuilding(String buildingName){
//		waitABit(2000);	
//		boolean found=false;
//		List<WebElement> elements=getDriver().findElements(By.cssSelector("div[class='vacation-tracker-filter'] div:nth-child(2) div[id='buildings'] li input"));
//		for(WebElement element:elements){
//			if(element.getAttribute("value").toLowerCase().equals(buildingName.toLowerCase())){
//				if(!element.isSelected())
//				element.click();
//				found=true;
//				break;
//			}
//			else{
//				if(element.isSelected())
//					element.click();
//			}
//		}
//		Assert.assertTrue("Element was not found!",found);
//	}
	public void selectAnItemFromADropDownList(String dropDownListName,String value){
		waitABit(2000);
		List<WebElement> ddlLists=getDriver().findElements(By.cssSelector("dl div"));
		for(WebElement ddlList:ddlLists){
			boolean ddlFound = false;
		if(ddlList.getText().toLowerCase().equals(dropDownListName.toLowerCase())){
			
			ddlFound=true;
			ddlList.click();
			break;
		}
		if(ddlFound)
			break;
		}
		boolean found=false;
		List<WebElement> elements=getDriver().findElements(By.cssSelector(".mutliSelect ul li label"));
		for(WebElement element:elements){
			System.out.println(element.getText());
			if(element.getText().toLowerCase().equals(value.toLowerCase())){
				if(!element.isSelected())
				element.click();
				found=true;
				break;
			}
			else{
				if(element.isSelected())
					element.click();
			}
		}
		Assert.assertTrue("Element was not found!",found);
	}
	

}
