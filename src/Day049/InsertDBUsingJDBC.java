/*Write a java program to insert data into a table of a database using JDBC*/

package Day049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDBUsingJDBC {
	private static Connection connection = null;	//Creating instance of Connection interface and initialize it.
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Scanner sc = new Scanner(System.in);
	
	private void insertRecord() throws SQLException, IOException {
		
		//Writing the insert command for database in mySQL.
		String sql = "insert into student(Roll_no, First_name, Last_name, Contact_no, Address) values (?, ?, ?, ?, ?)";
		
		//Preparing the insert statement by creating instance of PreparedStatement interface.
		PreparedStatement ps  = connection.prepareStatement(sql);
		
		//Entering the values for database elements.
		System.out.print("Enter Roll_no: ");
		int Roll_no = sc.nextInt();
		ps.setInt(1, Roll_no);
		
		System.out.print("Enter First_name:");
		String First_name = br.readLine();
		ps.setString(2, First_name);
		
		System.out.print("Enter Last_name:");
		String Last_name = br.readLine();
		ps.setString(3, Last_name);
		
		System.out.print("Enter Conatact_no: ");
		long Contact_no = sc.nextLong();
		ps.setLong(4, Contact_no);
		
		System.out.print("Enter Address: ");
		String Address = br.readLine();
		ps.setString(5, Address);
		int rows = ps.executeUpdate();
		
		if(rows > 0) {
			System.out.println("Record inserted successfully.");
		}
	}
	public static void main(String[] args) throws IOException {
		InsertDBUsingJDBC db = new InsertDBUsingJDBC();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Entering the database credentials.
			String dbURL = "jdbc:mysql://localhost:3306/jdbcdb";
			String username = "root";
			String password = "1234";
			connection = DriverManager.getConnection(dbURL, username, password);
			
			db.insertRecord();
		} 
		catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Class not found.");
		}
	}
}


//-------------Test Case------------

//TestCase1:
//Enter Roll_no: 10
//Enter First_name:Bristi
//Enter Last_name:Das
//Enter Conatact_no: 6788952100
//Enter Address: Shimurali

//TestCase2: 
//Enter Roll_no: 11
//Enter First_name:Abhishek
//Enter Last_name:Bhattacharjee
//Enter Conatact_no: 8790665123
//Enter Address: Dumdum