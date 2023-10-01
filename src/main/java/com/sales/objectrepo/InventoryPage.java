package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	@FindBy (xpath = "//td[.='sam']/../descendant::a[.=' View']")
	private WebElement viewbtnedt;
	
	@FindBy (xpath = "( //a[@class='btn btn-warning bg-gradient-warning'])[1]")
	private WebElement editbtnedt;
	
	@FindBy(xpath = "//input[@placeholder='Quantity']")
	private WebElement quantitybtnedt;
	
	@FindBy(xpath = "//input[@placeholder='On Hand']")
	private WebElement onhandbtnedt;
	
	@FindBy(xpath = "//button[.='Update']")
	private WebElement updatebtnedt;
	
	
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getViewbtnedt() {
		return viewbtnedt;
	}


	public WebElement getEditbtnedt() {
		return editbtnedt;
	}


	public WebElement getQuantitybtnedt() {
		return quantitybtnedt;
	}


	public WebElement getOnhandbtnedt() {
		return onhandbtnedt;
	}


	public WebElement getUpdatebtnedt() {
		return updatebtnedt;
	}
	//Business Libraries
	public void editInventory(String quatity, String onHand) {
		viewbtnedt.click();
		editbtnedt.click();
		quantitybtnedt.clear();
		quantitybtnedt.sendKeys(quatity);
		onhandbtnedt.clear();
		onhandbtnedt.sendKeys(onHand);
		updatebtnedt.click();
	}
	

}
