/*Write a java program to execute a callable statement using JDBC*/
package Day051;

import java.sql.*;
public class SelectAllUsingCallableJDBC {

	private static Connection connection = null;	//Creating instance of Connection interface and initialize it.
	
	private void selectAllRecords() throws SQLException {
		CallableStatement statement =  connection.prepareCall(" { call get_all()} "); //Setting the callable statement which I create in mySQL
		ResultSet result = statement.executeQuery(); //Executing the callable statement.
		
		while(result.next()) {
			
			//Printing the results.
			System.out.println("\n");
			System.out.println("Roll number is: " + result.getInt("Roll_no"));
			System.out.println("First name is: " + result.getString("First_name"));
			System.out.println("Last name is: " + result.getString("Last_name"));
			System.out.println("Contact number is: " + result.getLong("Contact_no"));
			System.out.println("Address is: " + result.getString("Address"));
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		
		SelectAllUsingCallableJDBC db = new SelectAllUsingCallableJDBC(); //Creating instance of that class.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Entering the database credentials.
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "1234";
			connection = DriverManager.getConnection(dbURL, username, password);
			
			db.selectAllRecords(); //Calling th method.
		} 
		catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Class not found.");
		}
	}

}



//-------------Test Case------------

//Output: 

//Roll number is: 1
//First name is: Subham
//Last name is: Saha
//Contact number is: 7908110646
//Address is: Chakdaha
//
//
//
//
//Roll number is: 2
//First name is: Rupam
//Last name is: Saha
//Contact number is: 9564037458
//Address is: Kalyani
//
//
//
//
//Roll number is: 4
//First name is: Mon
//Last name is: Dey
//Contact number is: 9002996780
//Address is: Palpara
//
//
//
//
//Roll number is: 5
//First name is: Shubhrangshu
//Last name is: Saha
//Contact number is: 8571239909
//Address is: Chakdaha
//
//
//
//
//Roll number is: 6
//First name is: Atin
//Last name is: Das
//Contact number is: 9609951078
//Address is: Birati
//
//
//
//
//Roll number is: 7
//First name is: Avik
//Last name is: Debnath
//Contact number is: 7650922018
//Address is: Kanchrapara
//
//
//
//
//Roll number is: 8
//First name is: Jit
//Last name is: Dutta
//Contact number is: 6745590887
//Address is: Madanpur
//
//
//
//
//Roll number is: 9
//First name is: Mon
//Last name is: Dey
//Contact number is: 9877664530
//Address is: Ranaghat
//
//
//
//
//Roll number is: 10
//First name is: Bristi
//Last name is: Das
//Contact number is: 6788952100
//Address is: Shimurali
//
//
//
//
//Roll number is: 11
//First name is: Abhishek
//Last name is: Bhattacharjee
//Contact number is: 8790665123
//Address is: Dumdum
//
//
