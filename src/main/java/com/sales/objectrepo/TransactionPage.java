package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage {
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchtxtedt;
	
	
	public TransactionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getSearchtxtedt() {
		return searchtxtedt;
	}
	
	public void searcbtn(String custname) {
		searchtxtedt.click();
		searchtxtedt.sendKeys(custname);
	}
	
	
	
	
	
	
	
	

}
