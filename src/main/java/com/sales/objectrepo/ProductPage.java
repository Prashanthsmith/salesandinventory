package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesandinventory.generic.WebdriverUtility;

public class ProductPage extends WebdriverUtility {
@FindBy (xpath = "(//a[@data-toggle='modal'])[2]")
private WebElement addprodbtn;

@FindBy(name = "prodcode")
private WebElement prodcodetxt;

@FindBy(name = "name")
private WebElement prodnametxt;

@FindBy(xpath = "//form[@action='pro_transac.php?action=add']/descendant::textarea[@placeholder='Description']")
private WebElement descripttxt;

@FindBy(name = "quantity")
private WebElement quantitytxt;

@FindBy(name = "onhand")
private WebElement onhandtxt;

@FindBy(name = "price")
private WebElement pricetxt;

@FindBy(name = "category")
private WebElement categoryDD;

@FindBy(name ="supplier")
private WebElement supplierDD;

@FindBy(name ="datestock")
private WebElement datetxtedt;

@FindBy(xpath = "(//button[.='Save'])[5]")
private WebElement savebtnedt;

@FindBy(xpath = "//input[@type='search']")
private WebElement searchtxtedt;



public ProductPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}



public WebElement getAddprodbtn() {
	return addprodbtn;
}



public WebElement getProdcodetxt() {
	return prodcodetxt;
}



public WebElement getProdnametxt() {
	return prodnametxt;
}



public WebElement getDescripttxt() {
	return descripttxt;
}



public WebElement getQuantitytxt() {
	return quantitytxt;
}



public WebElement getOnhandtxt() {
	return onhandtxt;
}



public WebElement getPricetxt() {
	return pricetxt;
}



public WebElement getCategoryDD() {
	return categoryDD;
}



public WebElement getSupplierDD() {
	return supplierDD;
}



public WebElement getDatetxtedt() {
	return datetxtedt;
}



public WebElement getSavebtnedt() {
	return savebtnedt;
}



public WebElement getSearchtxtedt() {
	return searchtxtedt;
}

public void toCreateProduct(int prodcode, String prodName,String description,int quantity, int onHand , int Price,String catvalue, String supp,String date,String month,String year) {
	addprodbtn.click();
	prodcodetxt.sendKeys(prodcode+"");
	prodnametxt.sendKeys(prodName);
	descripttxt.sendKeys(description);
	quantitytxt.sendKeys(quantity+"");
	onhandtxt.sendKeys(onHand+"");
	pricetxt.sendKeys(Price+"");
	selectDropDown(categoryDD,catvalue );
	selectDropDown(supp, supplierDD);
	datetxtedt.click();
	datetxtedt.sendKeys(date);
	datetxtedt.sendKeys(month);
	datetxtedt.sendKeys(year);
	savebtnedt.click();}
	
	public void tosearch(String text) {
		searchtxtedt.sendKeys(text);
	}
	
	
	
	
	
	
	
	




}
