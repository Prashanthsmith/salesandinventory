package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.findElement(By.name("user")).sendKeys("unguardable");
driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.name("btnlogin")).click();
Alert a = driver.switchTo().alert();
a.accept();
}

}
