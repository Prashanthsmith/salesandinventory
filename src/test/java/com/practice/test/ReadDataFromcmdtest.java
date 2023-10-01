package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromcmdtest {
@Test
public void cmdTest() {
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
	}
}
