package com.practice.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery {

	public static void main(String[] args)throws Throwable {
		Connection conn = null;
		try {
Driver driver=new Driver();
DriverManager.registerDriver(driver);
 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
Statement state = conn.createStatement();
String query = "Select * from team_deatils;";
ResultSet result = state.executeQuery(query);
while(result.next()) {
	System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
}}
		catch(Exception e) {
			

}
		finally {
			conn.close();
		}



	}

}
