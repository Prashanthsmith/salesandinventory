package com.practice.test;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.india.gov.in/my-government/schemes");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total links: "+allLinks.size());
		ArrayList<String> link = new ArrayList<String>();
		for(int i=0;i<allLinks.size();i++) {
			String eachlink = allLinks.get(i).getAttribute("href");
		
			URL url = null;
			int statuscode=0;
			//System.out.println(eachlink+" --> "+statuscode);
			try {

				url=new URL(eachlink);
				HttpsURLConnection httpconn=(HttpsURLConnection)url.openConnection();
				statuscode=httpconn.getResponseCode();
				if(statuscode>=400) {

					link.add(eachlink);
					System.out.println(eachlink+" --> "+statuscode);
				}
			}
			catch(Exception e) {
				link.add(eachlink);
			}
		}
		driver.quit();

	}}
