package com.practice.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.xdevapi.JsonParser;

public class JsonData {

	public static void main(String[] args) throws Throwable, IOException, ParseException {
JSONParser p=new JSONParser();
Object obj = p.parse(new FileReader(".\\src\\test\\resources\\jsonfile.json"));
JSONObject map=(JSONObject) obj;
String url = (String) map.get("url");
String username = (String) map.get("adminusername");
String password=(String) map.get("adminpassword");
System.out.println(url);
System.out.println(username);
System.out.println(password);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get(url);
driver.findElement(By.name("user")).sendKeys(username);
driver.findElement(By.name("password")).sendKeys(password);
driver.findElement(By.name("btnlogin")).click();
Alert a = driver.switchTo().alert();
a.accept();



	}

}
