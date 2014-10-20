package com.Training4.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

//@DefaultUrl("http://192.168.1.68:9090/login")
public class LoginPage extends PageObject {

	@FindBy(css="#_58_login")
	private WebElement userTxt;
	
	@FindBy(css="#_58_password")
	private WebElement passwordTxt;
	
	@FindBy(css=".aui-button-holder span input[type='submit']")
	private WebElement signInBtn;
	
	public void typePass(String pass){
		element(passwordTxt).type(pass);
	}
	public void typeUser(String user){
		element(userTxt).type(user);
	}
	public void clickSignIn(){
		signInBtn.click();
	
	}
	

}