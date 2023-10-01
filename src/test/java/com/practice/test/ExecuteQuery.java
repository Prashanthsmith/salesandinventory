package com.practice.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQuery {

	public static void main(String[] args) throws Throwable {
Driver driver=new Driver();
 Connection conn=null;
 
DriverManager.registerDriver(driver);
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
Statement state = conn.createStatement();
String query = "insert into team_deatils  values('Abc',123456789,'bangalore','school');";
int result = state.executeUpdate(query);
if(result==1) {
	System.out.println("Data is created successfully");
	}
else
	System.out.println("Data is not created successfully");



String query1 = "Select* from team_deatils;";
ResultSet res = state.executeQuery(query1);
while(res.next()) {
	System.out.println(res.getString(1)+res.getString(2)+res.getString(3));
}


}
	

}
