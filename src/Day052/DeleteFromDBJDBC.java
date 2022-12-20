/*Write a java program to delete data from a database using jdbc.*/

package Day052;

import java.sql.*;
import java.util.*;

public class DeleteFromDBJDBC {
	
	private static Connection connection = null;	//Creating instance of Connection interface and initialize it.
	public static Scanner sc= new Scanner(System.in);
	
	//Method to perform delete operation from database.
	private void deleteRecord() throws SQLException {
		
		//Taking input for deleting that item.
		System.out.print("Enter roll number to delete the row:");
		int roll = sc.nextInt();
		
		String sql = "delete from student where Roll_no = " + roll;	//Declaring the delete command as a string.
		
		Statement statement = connection.createStatement(); 		//Creating the statement.
		int rows = statement.executeUpdate(sql);		//Executing the command.
		if(rows > 0) {
			System.out.println("record  is deleted sucessfully...");
		}
	}

	public static void main(String[] args) {
		DeleteFromDBJDBC db = new DeleteFromDBJDBC();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Entering the database credentials.
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "1234";
			connection = DriverManager.getConnection(dbURL, username, password);
			
			db.deleteRecord(); //Calling the method.
		} 
		catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Class not found.");
		}

	}

}



//-------------Test Case------------
//Output:
//Enter roll number to delete the row:5
//record  is deleted sucessfully...
