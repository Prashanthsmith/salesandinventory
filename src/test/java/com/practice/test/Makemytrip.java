package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();
//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Actions a=new Actions(driver);
a.doubleClick().perform();
Thread.sleep(3000);
a.moveByOffset(0, 80).click().perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//label[@for='departure']")).click();
String monthandyear="August 2024";
int date=15;
String actual = "//div[text()='"+monthandyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";
String nextarrow = "//span[@aria-label='Next Month']";
for(;;) {
	try {
		driver.findElement(By.xpath(actual)).click();
		break;
	}
	catch(Exception e) {
		driver.findElement(By.xpath(nextarrow)).click();
	}
}
}
}