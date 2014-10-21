package com.Training4.pages;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Training4.tools.StringUtils;

public class TableViewPage extends PageObject {

	@FindBy(css="a[href*='menuItem=vacation-tracker']")
	private WebElement trackItem;
	
	@FindBy(css="a[href*='resetCur=false@=cur2']")
	private WebElement nextPage;
	
	
	public void clickTrackItem() {
		element(trackItem).waitUntilVisible();
		trackItem.click();
		
	}
	
	public void clickNextPage(){
		element(nextPage).waitUntilVisible();
		nextPage.click();
	}
	
	public void verifyThatTableContainsElement(String... terms){
		boolean found=false;
		List<Integer> numberOfPagesList=StringUtils.getAllIntegerNumbersFromString(getDriver().findElement(By.cssSelector("span[class='aui-paginator-current-page-report aui-paginator-total']")).getText());
		int pagesNumber=numberOfPagesList.get(1);
		System.out.println(pagesNumber);
		List<WebElement> items = getDriver().findElements(By.cssSelector("tr[class*='results-row']"));
		for(int i=1;i<=pagesNumber;i++){
			for(WebElement item:items){
				System.out.println(item.getText());
				if(item.getText().toLowerCase().contains(terms.toString().toLowerCase())){
					found=true;
					break;
				}
				if(!found || i<pagesNumber){
					getDriver().findElement(By.cssSelector("a[class='aui-paginator-link aui-paginator-next-link']")).click();
					waitABit(2000);
				}
				else
					break;
			}
			Assert.assertTrue("Element was not found!", found);
		}
	}
	
}