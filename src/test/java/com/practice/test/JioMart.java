package com.practice.test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JioMart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.findElement(By.xpath("//a[.='Groceries']")).click();
	}
	

}
