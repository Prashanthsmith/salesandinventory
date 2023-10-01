package com.assignment;

import java.time.Duration;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.salesandinventory.generic.WebdriverUtility;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("9164152606");
		driver.findElement(By.name("password")).sendKeys("Prashanth@16");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("sarcastic us");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='sarcastic_us']")).click();

		List<WebElement> total = driver.findElements(By.xpath("//div[@class='_aagw']"));
		int count=total.size();
		for (int i = 0; i < count; ) {
			total.get(i).click();
			String date = driver.findElement(By.xpath("//time[@class='_aaqe']")).getText();

			for (;;) {	
				if(date.contains("June")) {

					break;
				}

				
				else {
					driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Close']")).click();
					Actions a=new Actions(driver);
					a.scrollByAmount(0, 5000);
					i=count-1;
				}
				
			}
			//total=driver.findElements(By.xpath("//div[@class='_aagw']"));
			//count=total.size();}
	}

}
}
