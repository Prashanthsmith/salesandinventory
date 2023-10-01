package com.transaction.test;

import java.io.File;
import java.io.FileInputStream;
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

import com.salesandinventory.generic.BaseClass;
import com.salesandinventory.generic.Excelutility;
import com.salesandinventory.generic.FileUtility;
import com.salesandinventory.generic.JavaUtility;
import com.salesandinventory.generic.WebdriverUtility;

public class ProductToTransaction extends BaseClass {
	@Test
	public void productToTransaction() {
		

		driver.findElement(By.xpath("//span[.='POS']")).click();
		driver.findElement(By.xpath("//a[.='Keyboard']")).click();		
		driver.findElement(By.name("addpos")).click();
		WebElement customer = driver.findElement(By.name("customer"));
		customer.click();
		wlib.selectDropDown(customer, "299");
		driver.findElement(By.xpath("//button[.='SUBMIT']")).click();
		driver.findElement(By.name("cash")).sendKeys("250");
		driver.findElement(By.xpath("//button[.='PROCEED TO PAYMENT']")).click();
		wlib.acceptAlertPopup(driver, "Success.");

		driver.findElement(By.xpath("//div[.='Sales and Inventory System']")).click();
		String cust="steven smith";


		driver.findElement(By.xpath("//span[.='Transaction']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(cust);
		List<WebElement> trans = driver.findElements(By.xpath("//td[.='steven smith']"));
		boolean flag=false;
		for (WebElement ele : trans) {
			String text = ele.getText();
			System.out.println(text);
			if(cust.contains(text)) {
				flag=true;
				break;
			}
		}
		
		Assert.assertTrue(flag,"Order transaction is  not displaying " );
		/*if(flag)
			System.out.println("Order transaction is displaying sucessfully");
		else
			System.out.println("Order transaction is  not displaying ");*/
		




	}

}
