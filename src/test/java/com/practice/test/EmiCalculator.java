package com.practice.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmiCalculator {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://emicalculator.net/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Actions a =new Actions(driver);
a.moveByOffset(0, -2000).perform();
	}

}
