package com.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class ReadingDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
Properties p=new Properties();
p.load(fis);
System.out.println("Url: "+p.getProperty("url"));
System.out.println("Admin Username: "+p.getProperty("adusername"));
System.out.println("Admin Password: "+p.getProperty("adpassword"));
System.out.println("User Username: "+p.getProperty("ususername"));
System.out.println("User Password: "+p.getProperty("uspassword sf"));
	}

}
