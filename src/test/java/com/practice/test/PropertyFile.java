package com.practice.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws Throwable {
		//Writing data
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
Properties p=new Properties();
p.load(fis);
System.out.println("Browser--> "+p.getProperty("browser"));
System.out.println("URL--> "+p.getProperty("url"));
System.out.println("Admin Username--> "+p.getProperty("adusername"));
System.out.println("Admin Password--> "+p.getProperty("adpassword"));
System.out.println("User Username--> "+p.getProperty("ususername"));
System.out.println("User Password--> "+p.getProperty("uspassword"));
	}

}
