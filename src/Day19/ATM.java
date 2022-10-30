package Day19;

import java.io.*;

class Bank {
	//Creating class Bank to perform the given tasks.
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private int accountNumber;
	private String owner, accountType;
	 private double balance;
	
	 void AssignInfo(int accountNumber, String owner, String accountType, double balance) throws IOException {
		//Method for initializing the global variables
		 
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.accountType = accountType;
		this.balance = balance;
	}
	 void ShowAccountBalance() {
		 //Method for showing account balance.
		 
		 System.out.println("\n");
		 System.out.print(owner + "'s current account balance is:" + balance);
	 }
	 void ShowAccountInfo() {
		 //Method for showing account information.
		 
		 System.out.println("\n");
		 System.out.println(owner + "'s account info" +
	 "\nAccount Number: " + accountNumber +
	 "\nAccount type: " + accountType);
	 }
	 void Withdraw() throws IOException {
		 //Method for withdraw cash for account
		 
		 System.out.print("Enter the amount you want to withdraw: ");
		 double withDrawMoney = Double.parseDouble(br.readLine());
		 
		 if(balance <= withDrawMoney) {
			 
			 //If the entered amount is greater than balance account then it shows the invalid request.
			 System.out.println("Inavlid request because of insufficient balance.");
		 }
		 else {
			 
			 //if the entered amount is lesser than account balance then the withdraw will be done sucessfully.
			 System.out.println("The amount withdraw successfully.");
			 System.out.println("Do you want to show account balance?"
			 		+ "\npress 1 to yes"
			 		+ "\npress 2 to no"
			 		+ "\nEnter your choice: ");
			 int choice = Integer.parseInt(br.readLine());	
			 switch(choice) {
			 //Switch case for showing the account balance.
			 
			 case 1: {
				 System.out.println("\n");
				 System.out.println(owner + " your account balance is:" + (balance - withDrawMoney)
						 + "\nHave a nice day.");
				 break;
			 }
			 case 2: {
				 System.out.println("Have a nice day");
				 break;
			 }
			 default: System.out.println("You Entered a wrong choice.");
			 }
		}
	}
	 void Deposit() throws IOException {
		 //Method for deposit cash into the account.
		 
		 System.out.println("\n");
		 System.out.print("Enter the amount you want to deposit: ");
		 double depositMoney = Double.parseDouble(br.readLine());
		 
		 System.out.println("The amount is deposited in" + owner + "'s account");
		 System.out.println("Do you want to show account balance?"
			 		+ "\npress 1 to yes"
			 		+ "\npress 2 to no"
			 		+ "\nEnter your choice: ");
		 int choice = Integer.parseInt(br.readLine());	
		 switch(choice) {
		 //Switch case for showing the account balance.
		 
		 case 1: {
			 System.out.println("\n");
			 System.out.println(owner + " your account balance is:" + (balance + depositMoney)
					 + "\nHave a nice day.");
			 break;
		 }
		 case 2: {
			 System.out.println("Have a nice day");
			 break;
		 }
		 default: System.out.println("You Entered a wrong choice.");
		 }
	 }
	 
	
}
public class ATM {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		Bank  acc1 = new Bank();
		acc1.AssignInfo(123456789, "Subham Saha", "Savings", 12000.43);
		System.out.print("\n1. Show Current balance." +
				"\n2. Show account details." +
				"\n3. Withdraw Money." +
				"\n4. Deposit Money." + 
				"\nEnter your choice: "
				);
		int choice = Integer.parseInt(br.readLine());
		switch(choice) {
				case 1: acc1.ShowAccountBalance();
				break;
				
				case 2: acc1.ShowAccountInfo();
				break;
				
				case 3: acc1.Withdraw();
				break;
				
				case 4: acc1.Deposit();
				break;
				
				default: System.out.println("You Entered a wrong choice.");
			}
	}

}



//------------ Test Cases -----------

//TestCase1:
//Arguments: 123456789, "Subham Saha", "Savings", 12000.43
//Output1:

//1. Show Current balance.
//2. Show account details.
//3. Withdraw Money.
//4. Deposit Money.
//Enter your choice: 1
//
//
//Subham Saha's current account balance is:12000.43

//Output2:

//1. Show Current balance.
//2. Show account details.
//3. Withdraw Money.
//4. Deposit Money.
//Enter your choice: 2
//
//
//Subham Saha's account info
//Account Number: 123456789
//Account type: Savings

//Output3:

//1. Show Current balance.
//2. Show account details.
//3. Withdraw Money.
//4. Deposit Money.
//Enter your choice: 3
//Enter the amount you want to withdraw: 5000
//The amount withdraw successfully.
//Do you want to show account balance?
//press 1 to yes
//press 2 to no
//Enter your choice: 
//1
//
//
//Subham Saha your account balance is:7000.43
//Have a nice day.

//Output4:

//1. Show Current balance.
//2. Show account details.
//3. Withdraw Money.
//4. Deposit Money.
//Enter your choice: 3
//Enter the amount you want to withdraw: 13000
//Inavlid request because of insufficient balance.

//Output5:


//1. Show Current balance.
//2. Show account details.
//3. Withdraw Money.
//4. Deposit Money.
//Enter your choice: 4
//
//
//Enter the amount you want to deposit: 3000.45
//The amount is deposited inSubham Saha's account
//Do you want to show account balance?
//press 1 to yes
//press 2 to no
//Enter your choice: 
//1
//
//
//Subham Saha your account balance is:15000.880000000001
//Have a nice day.


