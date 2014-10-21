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

	@FindBy(css = "a[href*='menuItem=vacation-tracker']")
	private WebElement trackItem;

	@FindBy(css = "tr[class*='results-row']")
	private List<WebElement> rows;

	@FindBy(css = "span[class='aui-paginator-current-page-report aui-paginator-total']")
	private WebElement pagesContainer;

	@FindBy(css = "a[class='aui-paginator-link aui-paginator-next-link']")
	private WebElement nextButton;
	
	@FindBy(css = "span[class'aui_3_4_0_1_2665']")
	private WebElement buildingsAll;
	
	@FindBy(css = )

	public void clickTrackItem() {
		element(trackItem).waitUntilVisible();
		trackItem.click();

	}
	
	public void clickBuildingsAll(){
		element(buildingsAll).waitUntilVisible();
		buildingsAll.click();
	}
	
	

	 public void verifyThatTableContainsElement(
	        String... terms) {List<Integer> numberOfPagesList = StringUtils.getAllIntegerNumbersFromString(pagesContainer.getText());
			int pagesNumber = numberOfPagesList.get(1);
			System.out.println(pagesNumber);
			waitABit(2000);
			 boolean foundTerms = false;
	        for (int i = 0; i < pagesNumber; i++) {
	        	List<WebElement> items = getDriver().findElements(By.cssSelector("tr[class*='results-row']"));
	        	System.out.println(items.size());
	        	items.remove(0);
				System.out.println(items.size());
	    
	            for (WebElement item : items) {
	                boolean containsTerms = true;
	                $(item).waitUntilVisible();
	                for (String term : terms) {
	                    if (!item.getText().toLowerCase().contains(term.toLowerCase())) {
	                        containsTerms = false;
	                        break;
	                    }
	                }
	                if (containsTerms) {
                       foundTerms = true;
	                    break;
	                }
	            }
	            if (i < pagesNumber - 1 && !foundTerms) {
	            	nextButton.click();

	               
	            } else
	                break;
	        }
	        Assert.assertTrue(
	                "No record containing the searched terms was found in the table!",
	                foundTerms);

	    }

}