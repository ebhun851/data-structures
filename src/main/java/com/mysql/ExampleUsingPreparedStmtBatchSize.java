package com.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleUsingPreparedStmtBatchSize {

	 public static void main(String[] args) throws SQLException {
			Connection connection = ConnectionObject.getConnection();
			String SQL = "insert into PERSONS values (?,?,?,?)";
			int batchSize = 50;
			int count = 0;
			int[] result;
			
			connection.setAutoCommit(false);
			PreparedStatement pstmt = connection.prepareStatement(SQL);
			for(int i=1;i<= 1000;i++){
			  pstmt.setString(1,"Java");
			  pstmt.setString(2,"CodeGeeks");
			  pstmt.setInt(3,i);
			  pstmt.setInt(4, i);
			  pstmt.addBatch();
			  
			  count++;
			  
			  if(count % batchSize == 0){
				  System.out.println("Commit the batch");
				  result = pstmt.executeBatch();
				  System.out.println("Number of rows inserted: "+ result.length);
				  connection.commit();
			  }			  
			}
						
			if(pstmt!=null)
				pstmt.close();
			if(connection!=null)
				connection.close();
		  }
}
