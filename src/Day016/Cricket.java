/*Define a class batsman in cricket team. Include the following members:
First name, Last name, Runs made, Number of fours, Number of Six
Member function:
(i) To assign initial value
(ii) To update runs made
(iii) To display batsman’s information*/

package Day016;


import java.util.*;
class BatsMan {
	//Defining the class BatsMan
	
	//Declaring the variables globally
	Scanner sc = new Scanner(System.in);
	String firstName;
	String lastName;
	int fours;
	int sixes;
	int overs;
	
	void AssignValues () {
		//Constructor for initialize the global variables
		
		System.out.print("Enter the first name of the batsman: ");
		this.firstName = sc.nextLine();
		System.out.print("Enter the second name of the batsman: ");
		this.lastName = sc.nextLine();
		System.out.print("Enter the number of fours: ");
		this.fours = sc.nextInt();
		System.out.print("Enter the number of sixes: ");
		this.sixes = sc.nextInt();
		System.out.print("Enter the total overs of the match: ");
		this.overs = sc.nextInt();
	}
	int UpdateRun () {
		//Constructor for update the runs
		int totalRuns = 0;
		for(int n = 1; n <= overs; n++) {
			System.out.println("In the " + n + " over the run is: ");
			int run = sc.nextInt();
			totalRuns += run;
		}
		return totalRuns;
	}
	void BatsmanInfo () {
		//Constructor for displaying the Batsman info
		int s = UpdateRun();
		System.out.print(this.firstName + " " + this.lastName);
		System.out.println(" Total fours in this match: " + this.fours);
		System.out.println(" Total sixes in this match: " + this.sixes);
		System.out.println(" Total runs in this match: " + s);
	}
}
public class Cricket {

	public static void main(String[] args) {
		
		BatsMan bat = new BatsMan();
		bat.AssignValues();
		bat.UpdateRun();
		bat.BatsmanInfo();
	}

}



//------------ Test Cases -----------
//TestCase1:
//Enter the first name of the batsman: Virat
//Enter the second name of the batsman: Koholi
//Enter the number of fours: 4
//Enter the number of sixes: 2
//Enter the total overs of the match: 4
//In the 1 over the run is: 
//12
//In the 2 over the run is: 
//16
//In the 3 over the run is: 
//21
//In the 4 over the run is: 
//2
//Virat Koholi Total fours in this match: 4
// Total sixes in this match: 2
// Total runs in this match: 51

//TestCase2:
//Enter the first name of the batsman: Rohit
//Enter the second name of the batsman: Sharma
//Enter the number of fours: 8
//Enter the number of sixes: 5
//Enter the total overs of the match: 6
//In the 1 over the run is: 
//21
//In the 2 over the run is: 
//12
//In the 3 over the run is: 
//24
//In the 4 over the run is: 
//26
//In the 5 over the run is: 
//8
//In the 6 over the run is: 
//10
//Rohit Sharma Total fours in this match: 8
// Total sixes in this match: 5
// Total runs in this match: 101


