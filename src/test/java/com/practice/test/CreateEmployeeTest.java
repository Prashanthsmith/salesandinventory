package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateEmployeeTest {
	@Test
	public void createEmployee() throws InterruptedException {
		String Browser = System.getProperty("browser");
		String url=System.getProperty("url");
		String Username=System.getProperty("adusername");
		String Password= System.getProperty("adpassword");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("user")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("btnlogin")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		
		driver.findElement(By.xpath("//span[.='Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]")).click();
		driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='First Name'] 	 ")).sendKeys("Ben");
		driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Last Name']")).sendKeys("Stokes");
		WebElement gender = driver.findElement(By.name("gender"));
		Select s=new Select(gender);
		s.selectByVisibleText("Male");
		driver.findElement(By.name("email")).sendKeys("praddnd123@gmail.com");
		driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Phone Number']")).sendKeys("82929");
		WebElement job = driver.findElement(By.name("jobs"));
		Select s1=new Select(job);
		s1.selectByVisibleText("Manager");
		WebElement date = driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Hired Date']"));
		date.click();
		date.sendKeys("10");
		date.sendKeys("02");
		date.sendKeys("2001");
		WebElement province = driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::select[@name='province']"));
		Select s2=new Select(province);
		s2.selectByVisibleText("Abra");
		WebElement city = driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::select[@name='city']"));
		Select s3=new Select(city);
		s3.selectByVisibleText("Bangued");
		driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::button[text()='Save']")).click();

		
		
		
		}
		}	
	

