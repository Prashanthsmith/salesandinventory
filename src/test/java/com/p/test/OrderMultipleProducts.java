package com.p.test;
import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.sales.objectrepo.HomePage;
import com.sales.objectrepo.LoginPage;
import com.sales.objectrepo.POSPage;
import com.sales.objectrepo.TransactionPage;
import com.salesandinventory.generic.BaseClass;
import com.salesandinventory.generic.Excelutility;
import com.salesandinventory.generic.FileUtility;
import com.salesandinventory.generic.JavaUtility;
import com.salesandinventory.generic.WebdriverUtility;

public class OrderMultipleProducts extends BaseClass {
	 
@Test(alwaysRun = true)		

public void orderMultipleProducts() {

		
		HomePage hp=new HomePage(driver);
		hp.postab();

		POSPage pg=new POSPage(driver);
		pg.orderMultiProduct("328", 250,"Success.",driver);

		String cust="Prashanth smith  ";

		hp.transactionTab();
		TransactionPage tp=new TransactionPage(driver);
		tp.searcbtn(cust);
   // Assert.fail();
		List<WebElement> trans = driver.findElements(By.xpath("//tr/td[2]"));
		boolean flag=false;
		for (WebElement ele : trans) {
			String text = ele.getText();
			if(cust.contains(text)) {
				flag=true;
				break;
			}
		}
		Assert.assertTrue(flag,"Order transaction is  not displaying ");
			/*System.out.println("Order transaction is displaying sucessfully");
		else
			System.out.println("Order transaction is  not displaying ");*/

		

	}

}


