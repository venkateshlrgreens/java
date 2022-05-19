package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.Connect to database
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");

		//3.Write SQL query
		String s="select * from employees";
		
		//4.Prepare the statement
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		
		//5.Execute query
		ResultSet rs = prepareStatement.executeQuery();
		
		//6.Iterate the Results
		while (rs.next()) {
			String string = rs.getString("First_name");
			System.out.println(string);
		}
		
		//7.Close the connection
		connection.close();
	}
}
