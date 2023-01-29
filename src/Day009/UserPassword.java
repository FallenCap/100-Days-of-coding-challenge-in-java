/*Write a java program that let the user choose his/her username and password. The program verifies whether the chosen username and password are valid. If either one of them is invalid, it notifies the user and explain the cause of invalidity. The rules for choosing valid usernames and passwords are:
a. A username must be of length 6-15 characters.
b. A username must start with an uppercase English alphabet A to Z.
c. A password must not be shorter than 8 characters but must not exceed 256.
d. There cannot be any types of parentheses or whitespaces in a valid username or password.
e. A password cannot contain or be the same as its associated username.*/

package Day009;
import java.io.*;

class UserName {
	//Defining a class for To Check User anme
	public static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	String user;
	void AssignUserName() throws IOException {
		System.out.print("Enter the user name: ");
		this.user = br.readLine();
		if(user.length() >= 6 && user.length() <= 15) {
			//if-esle condition to check whether a username must be of length 6-15 characters.
			
			if(Character.isLowerCase(user.charAt(0))) {
				//if-esle condition to check whether a username must start with an uppercase English alphabet A to Z.
				
				System.out.println("User name  dosen't match the criteria.");
			}
			else {
					if(user.contains(" ")  || user.contains("(")  || user.contains(")")  || user.contains("{")  || user.contains("}")  || user.contains("[")  || user.contains("]")) {
						//if-esle condition to check whether a username contains any types of parentheses or whitespaces.
						System.out.println("User name dosen't match the criteria.");
					}
					else {
						System.out.println("User name match the criteria.");
					}
			}
		}
	}
}
class Password extends UserName {
	String pword;
	void AssignPassword()throws IOException {
		System.out.print("Enter password:");
		this.pword = br.readLine();
		if(pword.length() >= 8 && pword.length() <= 256) {
			//if-esle condition to check whether a password must be of length 8-256 characters.
			
			if(user.contains(" ")  || user.contains("(")  || user.contains(")")  || user.contains("{")  || user.contains("}")  || user.contains("[")  || user.contains("]")) {
				//if-esle condition to check whether a password contains any types of parentheses or whitespaces.
				
				System.out.println("Password dosen't match the criteria.");
			}
			else {
				if(pword.contains(user) || pword.contains(user.toLowerCase())) {
					//if-esle condition to check whether a password contain or be the same as its associated username.
					
					System.out.println("Password dosen't match the criteria.");
				}
					else {
						System.out.println("Password  match the criteria.");
					}
				}
			}
		}
}

public class UserPassword {
	public static void main(String[] args) throws IOException{
		Password pw = new Password();
		pw.AssignUserName();
		pw.AssignPassword();
		}
}

//------------ Test Cases ------------

//TestCase1:
//Enter the user name: Subham()
//User name dosen't match the criteria.
//Enter password:subham1234
//Password dosen't match the criteria.

//TestCase2:
//Enter the user name: Subham@123
//User name match the criteria.
//Enter password:kjsagfb123
//Password  match the criteria.

//TestCase3:
//Enter the user name: subham(123)
//User name  dosen't match the criteria.
//Enter password:1234subh
//Password dosen't match the criteria.
