package com.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleUsingStatement {
	
    public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionObject.getConnection();
		Statement stmt = connection.createStatement();
		connection.setAutoCommit(false);
		addStatements(stmt);			
		int[] result = stmt.executeBatch();
		System.out.println("The number of rows affected: "+ result.length);
		connection.commit();
		if(stmt!=null)
			stmt.close();
		if(connection!=null)
			connection.close();
	}

	private static void addStatements(Statement stmt) throws SQLException {
		for(int i=0;i<=10;i++){
			stmt.addBatch("insert into test_report values  ('12345','2020042911','test_cluster','test_store')");	
		}
		
	}
}
