package com.practice.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RmgYantra {

	/*public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new ChromeDriver();}
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expected = "SDET_49";
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.name("password")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expected);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Deepak H R");
		WebElement ele = driver.findElement(By.xpath("//select[@name='status']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Completed");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Connection conn=null;
		
		try {
			Driver driver1=new Driver();
			DriverManager.registerDriver(driver1);
			conn=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			Statement state = conn.createStatement();
			String query = "select * from Project;";
			ResultSet result = state.executeQuery(query);
			boolean flag=false;
			while(result.next()) {
				 String actual = result.getString(4);
				if(actual.equalsIgnoreCase(expected)) {
					flag=true;
					break;
				}
			}
			if(flag) {
				System.out.println("Project is created sucessfully");
			}
			else 
				System.out.println("Project is not created");
		}
		catch(Exception e) {
			}
		finally {

			conn.close();
		}
	}*/
}
