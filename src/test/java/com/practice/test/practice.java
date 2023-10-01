package com.practice.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class practice {

	public static void main(String[] args) throws Throwable {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the name you want to insert into the table");
		//String name=sc.next();

		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement state = conn.createStatement();
		String Query = "Select * from assignment;";
		ResultSet res = state.executeQuery(Query);
		boolean flag =false;
		while(res.next()) {
			String text = res.getString(2);
			System.out.println(text);
		}
			
			
	}

}
