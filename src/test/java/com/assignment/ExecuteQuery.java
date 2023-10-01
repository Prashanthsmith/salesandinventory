package com.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {

	public static void main(String[] args) throws Throwable {
Connection conn=null;
int result=0;
try {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	Statement state = conn.createStatement();
	String query = "insert into team_deatils value('steven',98765434,'sydney','leggie')";
	result=state.executeUpdate(query);
	if(result==1) {
		System.out.println("Data is updated succesfully");
	}
	else
		System.out.println("Data is not updated");
}
catch(Exception e) {}
finally {
	conn.close();
}
System.out.println();
System.err.println("Data after Updating");
System.out.println();
Connection con=null;
try {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	Statement state = con.createStatement();
	String query = "Select * from team_deatils;";
	ResultSet res = state.executeQuery(query);
	while(res.next()) {
		System.out.println(res.getString(1)+"-->"+res.getString(2)+"-->"+res.getString(3)+"-->"+res.getString(4));
	}
}
catch(Exception e) {}
finally {
	con.close();
}
	}
}
