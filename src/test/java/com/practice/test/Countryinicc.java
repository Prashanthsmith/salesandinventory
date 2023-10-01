package com.practice.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countryinicc {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.icc-cricket.com/rankings/mens/overview");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.findElement(By.xpath("(//a[.='Team Rankings'])[1]")).click();
String actual="Scotland";
List<WebElement> allCountries = driver.findElements(By.xpath("//table[@class='table']/descendant::tr[@class='table-body']//span[@class='u-hide-phablet']"));
for (WebElement ele : allCountries) {
	String country = ele.getText();
			if(country.equalsIgnoreCase(actual)) {
				System.out.println(actual+ " is present in the ranking table");
			}
}


	}

}
