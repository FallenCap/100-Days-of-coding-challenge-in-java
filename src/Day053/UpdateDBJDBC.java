/*Write a java program to update data of a database using jdbc.*/

package Day053;

import java.sql.*;
import java.util.*;
public class UpdateDBJDBC {
	private static Connection connection = null;	//Creating instance of Connection interface and initialize it.
	public static Scanner sc= new Scanner(System.in);
	
	//Method to perform update operation in database.
	private void updateRecord() throws SQLException {
		System.out.println("Enter the roll number to update the row:");
		int roll = sc.nextInt();
		
		String sql = "select * from student where Roll_no =" + roll;
		Statement statement = connection.createStatement();
		ResultSet result =  statement.executeQuery(sql);
		if(result.next() ) {
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
			System.out.println("Record not found...");
		}
		
		//Printing choices
		System.out.println("What you want to update?");
		System.out.println("1. First_name");
		System.out.println("2. Last_name");
		System.out.println("3. Contact_no");
		System.out.println("4. Address");
		System.out.println("Enter your choice: ");
		
		int choice = sc.nextInt(); //Entering the choice.
		String sqlQuery = "update student set ";
		switch(choice) {
		case 1: {
			//Updating first name.
			System.out.println("Enter new first name: ");
			String newFName = sc.next();
			sqlQuery = sqlQuery + "First_name = ? where Roll_no = " + roll;  //Creating the sql command to update first name.
			PreparedStatement ps1 = connection.prepareStatement(sqlQuery); //Preaparing the sql command.
			ps1.setString(1, newFName);
			
			int rows1 = ps1.executeUpdate();//Executing the command.
			if(rows1 > 0) {
				System.out.println("Record updated sucessfully...");
			}
			break;
		}
		case 2: {
			//Update last name.
			System.out.println("Enter new last name: ");
			String newLName = sc.next();
			sqlQuery = sqlQuery + "Last_name = ? where Roll_no = " + roll; //Creating the sql command to update last name.
			PreparedStatement ps2 = connection.prepareStatement(sqlQuery); //Preaparing the sql command.
			ps2.setString(1, newLName);
			
			int rows2 = ps2.executeUpdate();//Executing the command.
			if(rows2 > 0) {
				System.out.println("Record updated sucessfully...");
			}
			break;
		}
		case 3: {
			System.out.println("Enter new Contact number: ");
			Long newContact = sc.nextLong();
			sqlQuery = sqlQuery + "Contact_no = ? where Roll_no = " + roll; //Creating the sql command to update Contact number.
			PreparedStatement ps3 = connection.prepareStatement(sqlQuery); //Preaparing the sql command.
			ps3.setLong(1, newContact);
			
			int rows3 = ps3.executeUpdate(); //Executing the command.
			if(rows3 > 0) {
				System.out.println("Record updated sucessfully...");
			}
			break;
		}
		case 4: {
			System.out.println("Enter new address: ");
			String newAddress = sc.next();
			sqlQuery = sqlQuery + "Address = ? where Roll_no = " + roll; //Creating the sql command to update Address.
			PreparedStatement ps4 = connection.prepareStatement(sqlQuery);//Preaparing the sql command.
			ps4.setString(1, newAddress);
			
			int rows4 = ps4.executeUpdate();//Executing the command.
			if(rows4 > 0) {
				System.out.println("Record updated sucessfully...");
			}
			break;
		}
		}
	}
	

	public static void main(String[] args) {
		UpdateDBJDBC db = new UpdateDBJDBC();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Entering the database credentials.
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "1234";
			connection = DriverManager.getConnection(dbURL, username, password);
			
			db.updateRecord(); //Calling the method.
		} 
		catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Class not found.");
		}

	}
}


//-------------Test Case------------
//Output1:
//Enterthe roll number to update the row:
//1
//Roll number is: 1
//First name is: Subham
//Last name is: Saha
//Contact number is: 2356748990
//Address is: Chakdaha
//What you want to update?
//1. First_name
//2. Last_name
//3. Contact_no
//4. Address
//Enter your choice: 
//1
//Enter new first name: 
//Sumitra
//Record updated sucessfully...

//Output2:
//Enter the roll number to update the row:
//1
//Roll number is: 1
//First name is: Sumitra
//Last name is: Das
//Contact number is: 2356748990
//Address is: Chakdaha
//What you want to update?
//1. First_name
//2. Last_name
//3. Contact_no
//4. Address
//Enter your choice: 
//2
//Enter new last name: 
//Das
//Record updated sucessfully...

//Output3:
//Enter the roll number to update the row:
//1
//Roll number is: 1
//First name is: Sumitra
//Last name is: Das
//Contact number is: 2356748990
//Address is: Chakdaha
//What you want to update?
//1. First_name
//2. Last_name
//3. Contact_no
//4. Address
//Enter your choice: 
//3
//Enter new Contact number: 
//2453398001
//Record updated sucessfully...

//Output4:
//Enter the roll number to update the row:
//1
//Roll number is: 1
//First name is: Sumitra
//Last name is: Das
//Contact number is: 2453398001
//Address is: Chakdaha
//What you want to update?
//1. First_name
//2. Last_name
//3. Contact_no
//4. Address
//Enter your choice: 
//4
//Enter new address: 
//Shealdah
//Record updated sucessfully...


