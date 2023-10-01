package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomertest {
	@Test
	public void createCustomertest() {
		String Browser = System.getProperty("browser");
		String url=System.getProperty("url");
		String Username=System.getProperty("adusername");
		String Password= System.getProperty("adpassword");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("btnlogin")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//span[.='Customer']")).click();
		driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("steven");
		driver.findElement(By.name("lastname")).sendKeys("smith");
		driver.findElement(By.name("phonenumber")).sendKeys("9161567987");
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();
		}
	
	}


