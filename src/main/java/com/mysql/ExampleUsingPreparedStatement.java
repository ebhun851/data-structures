package com.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleUsingPreparedStatement {
  public static void main(String[] args) throws SQLException {
	Connection connection = ConnectionObject.getConnection();
	String SQL = "insert into PERSONS values (?,?,?,?)";
	
	connection.setAutoCommit(false);
	PreparedStatement pstmt = connection.prepareStatement(SQL);
	for(int i=1;i<=200;i++){
	  pstmt.setString(1,"Java");
	  pstmt.setString(2,"CodeGeeks");
	  pstmt.setInt(3,i);
	  pstmt.setInt(4, i);
	  pstmt.addBatch();
	}
	
	int[] result = pstmt.executeBatch();
	connection.commit();
	if(pstmt!=null)
		pstmt.close();
	if(connection!=null)
		connection.close();
	
	System.out.println("The number of rows inserted: "+ result.length);
  }
}
