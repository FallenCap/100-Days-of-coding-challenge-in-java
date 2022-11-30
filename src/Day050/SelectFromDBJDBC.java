/*Write a java program to select data into a table of a database using JDBC*/

package Day050;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectFromDBJDBC {
	
	private static Connection connection = null;	//Creating instance of Connection interface and initialize it.
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Scanner sc = new Scanner(System.in);
	
	public void selectRecord() throws SQLException {
		
		//Entering the roll number we want to find
		System.out.print("Enter roll number to find result:");
		int roll = sc.nextInt();
		
		String sql = "select * from student where Roll_no = " + roll; //Writing the select command for database in mySQL.
		
		Statement statement = connection.createStatement(); //The object used for executing a static SQL statementand returning the results it produces. 
		ResultSet result = statement.executeQuery(sql);
		
		if(result.next()) {
			//Storing the databse values into a variables.
			int rollNumber = result.getInt("Roll_no");
			String fName = result.getString("First_name");
			String lName = result.getString("Last_name");
			long number = result.getLong("Contact_no");
			String address = result.getString("Address");
			
			//Printing those variables.
			System.out.println("Roll number is: " + rollNumber);
			System.out.println("First name is: " + fName);
			System.out.println("Last name is: " + lName);
			System.out.println("Contact number is: " + number);
			System.out.println("Address is: " + address);
		}
		else {
			System.out.println("No records found.");
		}
	}

	public static void main(String[] args) {
		SelectFromDBJDBC db = new SelectFromDBJDBC();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Entering the database credentials.
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "1234";
			connection = DriverManager.getConnection(dbURL, username, password);
			
			db.selectRecord();
		} 
		catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Class not found.");
		}
	}

}

//-------------Test Case------------

//TestCase1: 
//Input: 3

//Output:
//Enter roll number to find result:3
//Roll number is: 3
//First name is: Suman
//Last name is: Dey
//Contact number is: 9664523110
//Address is: Ranaghat


//TestCase2: 
//Input: 7

//Output:
//Enter roll number to find result:7
//Roll number is: 7
//First name is: Avik
//Last name is: Debnath
//Contact number is: 7650922018
//Address is: Kanchrapara


//TestCase3:
//Input: 12

//Output: No records found.
