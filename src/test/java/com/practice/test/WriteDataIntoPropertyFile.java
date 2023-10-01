package com.practice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataIntoPropertyFile {

	public static void main(String[] args) throws Throwable {
Properties p=new Properties();
p.setProperty("browser", "chrome");
p.setProperty("url","http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
p.setProperty("adusername", "unguardable");
p.setProperty("adpassword", "admin");
p.setProperty("ususername", "test");
p.setProperty("uspassword", "test");
FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\commondata.properties");
p.store(fout,"Writing data");
fout.close();

//Read data
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
p.load(fis);
String browser = p.getProperty("brwowser");
String url=p.getProperty("url");
String adminusername=p.getProperty("adusername");
String adminpassword=p.getProperty("adpassword");
String userusername=p.getProperty("ususername");
String userpassword=p.getProperty("uspassword");

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get(url);
driver.findElement(By.name("user")).sendKeys(adminusername);
driver.findElement(By.name("password")).sendKeys(adminpassword);
driver.findElement(By.name("btnlogin")).click();
Alert a = driver.switchTo().alert();
a.accept();

	}

}
