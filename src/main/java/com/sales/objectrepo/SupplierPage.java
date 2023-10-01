package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.salesandinventory.generic.WebdriverUtility;

public class SupplierPage extends WebdriverUtility
{
	@FindBy(xpath = "//i[@class='fas fa-fw fa-plus']")
	private WebElement addsuppbtn;
	
	@FindBy(name = "companyname")
	private WebElement compnametxt;
	
	@FindBy(name = "province")
	private WebElement provinceDD;
	
	@FindBy(name = "city")
	private WebElement cityDD;
	
	@FindBy(xpath = "(//button[.='Save'])[1]")
	private WebElement savebtn;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchtxtedt;
	
	@FindBy (name="phonenumber")
	private WebElement phnotxt;
	
	public WebElement getPhnotxt() {
		return phnotxt;
	}

	public SupplierPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddsuppbtn() {
		return addsuppbtn;
	}

	public WebElement getCompnametxt() {
		return compnametxt;
	}

	public WebElement getProvinceDD() {
		return provinceDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSearchtxtedt() {
		return searchtxtedt;
	}

	//Business Library
	public void toCreateSupplier(String SupplierName,String Province, String city,String phnum) {
		addsuppbtn.click();
		compnametxt.sendKeys(SupplierName);
		selectDropDown(Province, provinceDD);
		selectDropDown(city, cityDD);
		phnotxt.sendKeys(phnum);
		savebtn.click();
		
		
	}
	
	
	
}
