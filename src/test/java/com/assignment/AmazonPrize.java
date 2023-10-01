package com.assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;


public class AmazonPrize {
	public static void main(String[] args) throws AWTException {
		
	
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
		int expprice=80000;
		List<WebElement> Phone = driver.findElements(By.xpath("//span[@class='a-price-whole'][number(translate(text(),'₹,',''))<"+expprice+"]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		for (WebElement ele : Phone) {
			System.out.println("The mobile under "+expprice+" is ----> "+ele.getText());
			
		}
		
		
		
		
			
			
		
		driver.quit();
		
	}
}
	


