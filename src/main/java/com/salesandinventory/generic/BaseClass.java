package com.salesandinventory.generic;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.sales.objectrepo.HomePage;
import com.sales.objectrepo.LoginPage;

public class BaseClass {
	 public static WebDriver  driver;
	 public  static WebDriver sdriver;
	public DataBaseUtility dlib=new DataBaseUtility();
	public Excelutility elib=new Excelutility();
	public FileUtility flib=new FileUtility();
	public JavaUtility jlib= new JavaUtility();
	public WebdriverUtility wlib=new WebdriverUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void configBS() throws Throwable {
		dlib.connectToDB();
		System.out.println("Connected to Data Base");

	}
	@BeforeClass(alwaysRun = true)
	public void  configBC ()throws Throwable {
		String browser = flib.getPropertyKeyValue("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("Browser launched");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Browser launched");

		}
		else
			System.out.println("Invalid browser");
		//sdriver=driver;
		String url=flib.getPropertyKeyValue("url");
		 driver.get(url);
		 wlib.implicitlyWait(driver, 10);
		wlib.toMaximize(driver);
	}
	@BeforeMethod(alwaysRun = true)
	public void configBM() throws Throwable {

		String Username=flib.getPropertyKeyValue("adusername");
		String Password=flib.getPropertyKeyValue("adpassword");
		
		LoginPage lp=new LoginPage(driver);
		lp.toLogin(Username, Password);
		wlib.acceptAlertPopup(driver, "Welcome!");
		
		System.out.println("Login to the application");

	}

	@AfterMethod(alwaysRun = true)
	public void configAM() {
		HomePage hp=new HomePage(driver);
		hp.toLogout(driver);
		System.out.println("Logout from the application");
	}
	@AfterClass(alwaysRun = true)
	public void congfigAC() {
		driver.quit();
		System.out.println("Browser closed");
	}
	@AfterSuite(alwaysRun = true)
	public void configAS() throws SQLException {
		dlib.closeDB();
		System.out.println("DataBase Disconnected");
	}
}
