package com.practice.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class InsertData {

	public static void main(String[] args) throws Throwable {
Scanner sc=new Scanner(System.in);
int id=0;
System.out.println("Enter the name you want to insert into the table");
String name=sc.nextLine();

Driver driver=new Driver();
DriverManager.registerDriver(driver);
Connection conn=null;

 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
Statement state = conn.createStatement();
String Query = "Select* from assignment;";
ResultSet res = state.executeQuery(Query);
boolean flag =false;
while(res.next()) {
	String text = res.getString(2);
	 String Resid=res.getString(1);
	 id=Integer.parseInt(Resid);
	
	if(name.equalsIgnoreCase(text)) {
		flag=true;
	}}
	
	if(flag==false) {
		 String query = "insert into assignment values("+ ++id +", '"+name+"');";
		 int result=state.executeUpdate(query);
		 System.out.println("********* "+name+" is inserted into table sucessfully *********");
	}
	else
		System.err.println("********* "+name+" is already present in the table *********");


	
	
	
	
	
	}
	


}
