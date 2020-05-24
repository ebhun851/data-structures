package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionObject {
   private static Connection conn = null;
   
   public static Connection getConnection(){
	   String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC";
	   try{
		   Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		   conn = DriverManager.getConnection(url,"root","mysql&mac");
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   return conn;
   }
}
