package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesandinventory.generic.WebdriverUtility;

public class POSPage  extends WebdriverUtility{
	@FindBy(xpath="//a[.='Motherboard']")
	private WebElement motherboardbtnedt;
	
	@FindBy (xpath = "(//h6[.='Intel 12th gen mother board'])[1]")
	private WebElement hpaddbtn;
	
	@FindBy(xpath = "//a[.='Processor']")
	private WebElement processorbtnedt;
	
	@FindBy(xpath = "//h6[.='hp']/../input[@name='addpos']")
	private WebElement inteladdbtn;
	
	@FindBy(name = "customer")
	private WebElement customerDDedt;
	
	@FindBy(xpath = "//button[.='SUBMIT']")
	private WebElement sumbitbtnedt;
	
	@FindBy(name = "cash")
	private WebElement cashtxtbtnedt;
	
	@FindBy(xpath = "//button[.='PROCEED TO PAYMENT']")
	private WebElement paymentbtn;
	
	@FindBy(xpath =" //i[@class='fas fa-fw fa-plus']")
	private WebElement addcustbtn;
	
	@FindBy(xpath = "//i[@class='fas fa-fw fa-trash']")
	private WebElement trashbtnedt;
	
	@FindBy(xpath = "(//div[@class='modal-body'])[5]/descendant::input[@placeholder='First Name']")
	private WebElement firstnametxtbtn;
	
	@FindBy(xpath = "(//div[@class='modal-body'])[5]/descendant::input[@placeholder='Last Name']")
	private WebElement lastnametxtbtn;
	
	@FindBy(xpath = "(//div[@class='modal-body'])[5]/descendant::input[@placeholder='Phone Number']")
	private WebElement phnotxtbtn;
	
	@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::button[.='Save']")
	private WebElement savebtnedt;
	
	@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::button[.='Reset']")
	private WebElement resetbtnedt;
	
	@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::button[.='Cancel']")
	private WebElement cancelbtnedt;
	
	@FindBy(xpath = "//div[.='Sales and Inventory System']")
	private WebElement  sNibtn;
	
	@FindBy(xpath = "//a[.='Keyboard']")
	private  WebElement keybdbtn;
	
	@FindBy(xpath =  "//h6[.='Newmen E120']/../input[@name='addpos']")
	private WebElement keybdaddbtn;
	
	
	public  POSPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	public WebElement getKeybdbtn() {
		return keybdbtn;
	}



	public WebElement getsNibtn() {
		return sNibtn;
	}

	public WebElement getMotherboardbtnedt() {
		return motherboardbtnedt;
	}



	public WebElement getHpaddbtn() {
		return hpaddbtn;
	}



	public WebElement getProcessorbtnedt() {
		return processorbtnedt;
	}



	public WebElement getInteladdbtn() {
		return inteladdbtn;
	}



	public WebElement getCustomerDDedt() {
		return customerDDedt;
	}



	public WebElement getSumbitbtnedt() {
		return sumbitbtnedt;
	}



	public WebElement getCashtxtbtnedt() {
		return cashtxtbtnedt;
	}



	public WebElement getPaymentbtn() {
		return paymentbtn;
	}



	public WebElement getAddcustbtn() {
		return addcustbtn;
	}



	public WebElement getTrashbtnedt() {
		return trashbtnedt;
	}



	public WebElement getFirstnametxtbtn() {
		return firstnametxtbtn;
	}



	public WebElement getLastnametxtbtn() {
		return lastnametxtbtn;
	}



	public WebElement getPhnotxtbtn() {
		return phnotxtbtn;
	}



	public WebElement getSavebtnedt() {
		return savebtnedt;
	}



	public WebElement getResetbtnedt() {
		return resetbtnedt;
	}



	public WebElement getCancelbtnedt() {
		return cancelbtnedt;
	}
	//Business Library
	public void orderMultiProduct(String custValue, int price, String expmsg,WebDriver driver) {
		motherboardbtnedt.click();
		hpaddbtn.click();
		processorbtnedt.click();
		inteladdbtn.click();
		customerDDedt.click();
		selectDropDown(customerDDedt, custValue);
		sumbitbtnedt.click();
		cashtxtbtnedt.sendKeys(price+"");
		paymentbtn.click();
		acceptAlertPopup(driver,expmsg );
		sNibtn.click();
	}
	
	public void addProd() throws InterruptedException {
		
		keybdbtn.click();
		keybdaddbtn.click();
		addcustbtn.click();
		
	}
		
	public void orderProd(int price,String exptext,WebDriver driver) {
		customerDDedt.click();
		selectDropDown("prashanth smith", customerDDedt);
		sumbitbtnedt.click();
		cashtxtbtnedt.sendKeys(price+"");
		paymentbtn.click();
		acceptAlertPopup(driver, exptext);
		sNibtn.click();
		}
	
	public void addCust(String FirstName, String LastName,String phno) {
		firstnametxtbtn.sendKeys(FirstName);
		lastnametxtbtn.sendKeys(LastName);
		phnotxtbtn.sendKeys(phno);
		savebtnedt.click();
	}
	

}
