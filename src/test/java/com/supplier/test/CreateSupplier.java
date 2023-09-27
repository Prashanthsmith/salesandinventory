package com.supplier.test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

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

import com.sales.objectrepo.HomePage;
import com.sales.objectrepo.LoginPage;
import com.sales.objectrepo.SupplierPage;
import com.salesandinventory.generic.BaseClass;
import com.salesandinventory.generic.Excelutility;
import com.salesandinventory.generic.FileUtility;
import com.salesandinventory.generic.JavaUtility;
import com.salesandinventory.generic.WebdriverUtility;

public class CreateSupplier extends BaseClass {
	@Test
	public void createSupplier() {
		
		String count = driver.findElement(By.xpath("//div[.='Supplier']/parent::div[@class='col mr-0']/div[@class='h6 mb-0 font-weight-bold text-gray-800']")).getText();
		HomePage hp=new HomePage(driver);
		int res = jlib.getrandomNumber();
		String company = "india";

		hp.supplierTab();
		SupplierPage sp=new SupplierPage(driver);
		sp.toCreateSupplier(company, "Abra", "Bucay", "8"+res);

		hp.homeTab();

		String count1 = driver.findElement(By.xpath("//div[.='Supplier']/parent::div[@class='col mr-0']/div[@class='h6 mb-0 font-weight-bold text-gray-800']")).getText();

		System.out.println("Supplier count before new Supplier creation:--> "+count);
		System.out.println("Supplier count after new Supplier creation:--> "+count1);
		Assert.assertNotEquals(count,count1,"Supplier is not created");
		/*if(count.equals(count1)) {
			System.out.println("Supplier is not created");

		}
		else
			System.out.println("Supplier is  created");*/
		
	}

}
