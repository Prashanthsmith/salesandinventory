package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesandinventory.generic.WebdriverUtility;

public class LoginPage {

	@FindBy(name="user")
	private WebElement usernametxtedt;
	@FindBy (name="password")
	private WebElement passwordtxtedt;
	@FindBy(name="btnlogin")
	private WebElement loginbtnedt;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernametxtedt() {
		return usernametxtedt;
	}

	public WebElement getPasswordtxtedt() {
		return passwordtxtedt;
	}

	public WebElement getLoginbtnedt() {
		return loginbtnedt;
	}
	
	
	//Business Library
	public void toLogin(String Username, String Password) throws Throwable {
		usernametxtedt.sendKeys(Username);
		passwordtxtedt.sendKeys(Password);
		loginbtnedt.click();
		
		
	}
	
	
	
}
