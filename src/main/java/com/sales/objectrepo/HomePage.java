package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesandinventory.generic.WebdriverUtility;

public class HomePage extends WebdriverUtility{
@FindBy(xpath = "//span[.='Home']")
private WebElement homebtnedt;

@FindBy(xpath = "//span[.='Customer']")
	private WebElement customerbtnedt;

@FindBy(xpath = "//span[.='Employee']")
private WebElement employeebtnedt;

@FindBy(xpath = "//span[.='Product']")
private WebElement productbtnedt;

@FindBy(xpath = "//span[.='Inventory']")
private WebElement inventorybtnedt;

@FindBy(xpath = "//span[.='Transaction']")
private WebElement transcationbtnedt;

@FindBy(xpath = "//span[.='Supplier']")
private WebElement supplierbtnedt;

@FindBy(xpath = "//span[.='Accounts']")
private WebElement accountsbtnedt;

@FindBy(xpath = "//span[.='POS']")
private WebElement posbtnedt;

@FindBy(xpath = "//img[@class='img-profile rounded-circle']")
private WebElement profilebtnedt;

@FindBy (xpath = "//a[@class='dropdown-item' and contains(.,'Logout')]")
private WebElement logoutbtn;

@FindBy (xpath = "(//a[.='Logout'])[1]")
private WebElement lgbtn;

public WebElement getLgbtn() {
	return lgbtn;
}


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public WebElement getLogoutbtn() {
	return logoutbtn;
}


public WebElement getHomebtnedt() {
	return homebtnedt;
}


public WebElement getCustomerbtnedt() {
	return customerbtnedt;
}


public WebElement getEmployeebtnedt() {
	return employeebtnedt;
}


public WebElement getProductbtnedt() {
	return productbtnedt;
}


public WebElement getInventorybtnedt() {
	return inventorybtnedt;
}


public WebElement getTranscationbtnedt() {
	return transcationbtnedt;
}


public WebElement getSupplierbtnedt() {
	return supplierbtnedt;
}


public WebElement getAccountsbtnedt() {
	return accountsbtnedt;
}


public WebElement getPosbtnedt() {
	return posbtnedt;
}


public WebElement getProfilebtnedt() {
	return profilebtnedt;
}

//Business Libraries

public void custTab() {
	customerbtnedt.click();
}
public void employeeTab() {
	employeebtnedt.click();
}
public void productTab() {
	productbtnedt.click();
}
public void inventoryTab() {
	inventorybtnedt.click();
}
public void transactionTab() {
	transcationbtnedt.click();
}
public void supplierTab() {
	supplierbtnedt.click();
}
public void accountsTab() {
	accountsbtnedt.click();
}
public void postab() {
	posbtnedt.click();
}

public void profileTab() {
	profilebtnedt.click();
}
public void homeTab() {
	homebtnedt.click();
}
public void toLogout(WebDriver driver) {
	profilebtnedt.click();
	moveToElement(driver, logoutbtn);
	lgbtn.click();
	//driver.quit();
	
}
}
