package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class CreateName {

	public static void main(String[] args) throws Throwable {
Scanner s=new Scanner(System.in);
Driver driver=new Driver();
DriverManager.registerDriver(driver);
Connection conn;
boolean flag=false;
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root");
Statement state = conn.createStatement();
try {
	//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "root");
	// state = conn.createStatement();
	System.out.println("Please pass the name");
	String name = s.nextLine();
	String Query="Select name from tyss;";
	ResultSet result = state.executeQuery(Query);
	//while(result.next()) {
		String text = result.getString(2);
		System.out.println("Name in the table is: "+text);
		if(text.equalsIgnoreCase(name)) {
			flag=true;
			//break;
		
	}
	 if(flag) {
		 System.out.println(name+" is already exist in the table");
		 
	 }
	 else {
		 String query1 = "insert into tyss(name);";
		 int res = state.executeUpdate(query1);
		 System.out.println(name+" is inserted sucessfully");
		 
	 }
		 
		 
			
			

}
catch(Exception e) {}

	}

}
