package com.employee.test;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sales.objectrepo.EmployeePage;
import com.sales.objectrepo.HomePage;
import com.sales.objectrepo.LoginPage;
import com.salesandinventory.generic.BaseClass;
import com.salesandinventory.generic.Excelutility;
import com.salesandinventory.generic.FileUtility;
import com.salesandinventory.generic.WebdriverUtility;
import com.salesandinventory.generic.JavaUtility;
import com.salesandinventory.generic.WebdriverUtility;

@Listeners(com.salesandinventory.generic.ListnersaImplementationclass.class)
public class CreateEmployeeTest extends BaseClass {
//static WebDriver driver;

	@Test
	public void createEmployee() throws Throwable {
		
		int res = jlib.getrandomNumber();
	
		String fn="david";
		String ln="miller";
		HomePage hp=new HomePage(driver);
		hp.employeeTab();
		EmployeePage e=new EmployeePage(driver);
		e.toCreateEmp(fn, ln, "Male", "Manager", "10","12","2001", "Albay", "Bacacay","8782"+res,"ioqwryjfbj@gmail.com");
		
		boolean flag=false;
		e.searchBtn(fn);

		List<WebElement> actual = driver.findElements(By.xpath("//tbody/tr[@role='row']"));
		//Assert.fail();

		for (WebElement ele: actual) {
			String result=ele.getText();
			if(result.contains(fn)) {
				flag=true;
				break;
			}
			}
	 
		Assert.assertTrue(flag, "Employee is not created ");
	/*	if(flag)
			System.out.println("Employee is created succesfully");
		else
			System.out.println("Employee is not created succesfully");
*/
		}
}	


