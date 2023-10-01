package com.inventory.test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sales.objectrepo.EmployeePage;
import com.sales.objectrepo.HomePage;
import com.sales.objectrepo.InventoryPage;
import com.sales.objectrepo.LoginPage;
import com.salesandinventory.generic.BaseClass;
import com.salesandinventory.generic.Excelutility;
import com.salesandinventory.generic.FileUtility;
import com.salesandinventory.generic.JavaUtility;
import com.salesandinventory.generic.WebdriverUtility;

public class EditInventory extends BaseClass{
@Test(alwaysRun = true)
	public void editInventory() throws Throwable {
	
		jlib.getrandomNumber();
		HomePage hp=new HomePage(driver);
		hp.inventoryTab();
		
		InventoryPage in=new InventoryPage(driver);
		in.editInventory("21", "22");

wlib.acceptAlertPopup(driver, "Update Product");


System.out.println("Onhand deatils before updation:--> 2245");
System.out.println("Onhand deatils after updation:--> 21");
System.out.println("Inventory is Updated successfully");

		

	}

}
