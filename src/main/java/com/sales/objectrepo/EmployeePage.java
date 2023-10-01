package com.sales.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;
import com.salesandinventory.generic.WebdriverUtility;

public class EmployeePage extends WebdriverUtility{

	@FindBy(xpath = "(//a[@data-toggle='modal'])[2]")
	private WebElement addempbtnedt;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchbtnedt;
	
	@FindBy(xpath = "(//a[.=' Details'])[1]")
	private WebElement detailsbtnedt;
	
	@FindBy (xpath = "(//a[@data-toggle='dropdown'])[1]")
	private WebElement elipsisbtnedt;
	
	@FindBy (xpath = "(//i[@class='fas fa-fw fa-edit'])[1]")
	private WebElement editbtnedt;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='First Name']")
	private WebElement firstnameedt;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Last Name']")
	private WebElement lastnamedt;
	
	@FindBy(xpath = "(//select[@name='gender'])[1]")
	private WebElement genderDDedt;
	
	@FindBy(name = "jobs")
	private WebElement jobDDedt;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Hired Date']")
	private WebElement hiredatetxtedt;
	
	@FindBy (xpath = "//form[@action='emp_transac.php?action=add']/descendant::select[@name='province']")
	private WebElement provinceDDedt;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::select[@name='city']")
	private WebElement cityDDedt;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::button[text()='Save']")
	private WebElement savebtnedt;
	 
	@FindBy (xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@name='email']")
	private WebElement emailtxtedt;
	
	@FindBy(xpath = "//form[@action='emp_transac.php?action=add']/descendant::input[@name='phonenumber']")
	private WebElement phntxtedt;
	
	public EmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getEmailtxtedt() {
		return emailtxtedt;
	}


	public WebElement getPhntxtedt() {
		return phntxtedt;
	}


	

	public WebElement getAddempbtnedt() {
		return addempbtnedt;
	}


	public WebElement getSearchbtnedt() {
		return searchbtnedt;
	}


	public WebElement getDetailsbtnedt() {
		return detailsbtnedt;
	}


	public WebElement getElipsisbtnedt() {
		return elipsisbtnedt;
	}


	public WebElement getEditbtnedt() {
		return editbtnedt;
	}


	public WebElement getFirstnameedt() {
		return firstnameedt;
	}


	public WebElement getLastnamedt() {
		return lastnamedt;
	}


	public WebElement getGenderDDedt() {
		return genderDDedt;
	}


	public WebElement getJobDDedt() {
		return jobDDedt;
	}


	public WebElement getHiredatetxtedt() {
		return hiredatetxtedt;
	}


	public WebElement getProvinceDDedt() {
		return provinceDDedt;
	}


	public WebElement getCityDDedt() {
		return cityDDedt;
	}


	public WebElement getSavebtnedt() {
		return savebtnedt;
	}
	
	//Business Library
	
	public void toCreateEmp (String firstName, String lastName, String gender,String job, String day, String month, String year, String province, String city, String phonenumber, String email){
		addempbtnedt.click();
		firstnameedt.sendKeys(firstName);
		lastnamedt.sendKeys(lastName);
		selectDropDown(gender, genderDDedt);
		selectDropDown(job, jobDDedt);
		phntxtedt.sendKeys(phonenumber);
		emailtxtedt.sendKeys(email);
		hiredatetxtedt.click();
		hiredatetxtedt.sendKeys(day);
		hiredatetxtedt.sendKeys(month);
		hiredatetxtedt.sendKeys(year);
		selectDropDown(province, provinceDDedt);
		selectDropDown(city, cityDDedt);
		savebtnedt.click();
		
	}
	public void searchBtn(String text) {
		searchbtnedt.sendKeys(text);
	}
	
	
	
	
	
		
}
