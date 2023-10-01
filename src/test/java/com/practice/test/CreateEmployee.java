package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateEmployee {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("user")).sendKeys("unguardable");
driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.name("btnlogin")).click();
Alert a = driver.switchTo().alert();
a.accept();
driver.findElement(By.xpath("//span[.='Employee']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]")).click();
driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='First Name'] 	 ")).sendKeys("Steven");
driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Last Name']")).sendKeys("smith");
WebElement gender = driver.findElement(By.name("gender"));
Select s=new Select(gender);
s.selectByVisibleText("Male");
driver.findElement(By.name("email")).sendKeys("praddnd123@gmail.com");
driver.findElement(By.xpath("//form[@action='emp_transac.php?action=add']/descendant::input[@placeholder='Phone Number']")).sendKeys("9176382082");
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
