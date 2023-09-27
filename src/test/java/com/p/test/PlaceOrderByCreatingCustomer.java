package com.p.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sales.objectrepo.HomePage;
import com.sales.objectrepo.LoginPage;
import com.sales.objectrepo.POSPage;
import com.sales.objectrepo.TransactionPage;
import com.salesandinventory.generic.BaseClass;
import com.salesandinventory.generic.Excelutility;
import com.salesandinventory.generic.FileUtility;
import com.salesandinventory.generic.JavaUtility;
import com.salesandinventory.generic.WebdriverUtility;

public class PlaceOrderByCreatingCustomer extends BaseClass {
	@Test
	public void placeOrderByCreatingCustomer() throws Throwable {
		



		 
		int res = jlib.getrandomNumber();
		HomePage hp=new HomePage(driver);
		hp.postab();
		

		String fn="prashanth";
		String ln="smith";
		String cust="prashanth smith";

		POSPage pg=new POSPage(driver);
		pg.addProd();


		pg.addCust(fn, ln, "9"+res);
		pg.orderProd(250, "Success.", driver);



		TransactionPage tp=new TransactionPage(driver);
		hp.transactionTab();
		tp.searcbtn(cust);
		List<WebElement> trans = driver.findElements(By.xpath("//tr[@role='row']/td[2]"));

		boolean flag=false;
		for (WebElement ele : trans) {
			String text = ele.getText();
			System.out.println(text);
			if(cust.contains(text)) {
				flag=true;
				break;
			}
		}
		
		Assert.assertTrue(flag, "Product has been not placed sucessfully new customer");
		/*if(flag)
			System.out.println("Product has been placed sucessfully new customer");
		else
			System.out.println("Product has been not placed sucessfully new customer");*/





	}

}
