package com.product.test;

import java.io.File;
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

import com.sales.objectrepo.HomePage;
import com.sales.objectrepo.LoginPage;
import com.sales.objectrepo.ProductPage;
import com.salesandinventory.generic.BaseClass;
import com.salesandinventory.generic.Excelutility;
import com.salesandinventory.generic.FileUtility;
import com.salesandinventory.generic.JavaUtility;
import com.salesandinventory.generic.WebdriverUtility;

public class CreateProductTest extends BaseClass {
	@Test(groups = "smoke")
	public void createProductTest() {
		
		String Product = "key";
		
		HomePage hp=new HomePage(driver);
		hp.productTab();
		ProductPage pp=new ProductPage(driver);
		pp.toCreateProduct(101, "mouse",Product , 20, 20,250, "1", "chroma", "10", "12", "2000");

		 boolean flag=false;
		 pp.tosearch(Product);
		 List<WebElement> actual = driver.findElements(By.xpath("//tr[@role='row']"));
		 for (WebElement ele : actual) {
			String result = ele.getText();
			if(result.contains(Product)) {
				flag=true;
				break;
			}
		}
		
		 Assert.assertTrue(flag, "Product is not created ");
	/*	if(flag)
			System.out.println("Product is created successfully");
		else
			System.out.println("Product is not created ");*/
		
		

				
	}
	

}
