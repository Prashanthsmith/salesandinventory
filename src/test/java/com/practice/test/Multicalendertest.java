package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multicalendertest {

	public static void main(String[] args) {
		String monthanddate="November 2023";
		int date=20;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		String actual = "//div[.='"+monthanddate+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']";
		String nextarrow = "//span[@aria-label='Next Month']";
		for (; ; ) {
			try {
				driver.findElement(By.xpath(actual)).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath(nextarrow)).click();
			}

		}
		driver.findElement(By.xpath("//span[.='Done']")).click();
	}

}
