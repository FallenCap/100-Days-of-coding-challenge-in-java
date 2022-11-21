/*Write a java program to perform the deposit and withdraw function using multi threading.*/

package Day041;

import java.util.*;
import java.lang.Thread;

class BankMulti {
	//Declaring balance variable globally.
	protected double balance;
	
	BankMulti(double balance) {
		//Initilizing balance using constructor.
		this.balance = balance;
	}
}

class Deposit implements Runnable {
	//Creating class deposit which inherits Runnable interface.
	public static Scanner sc = new Scanner(System.in);
	
	//Declaring variables gloablly for performing deposit.
	BankMulti   bankDepo;
	Thread t;
	
	Deposit(BankMulti bankMulti) {
		//Initializing the variables for performing deposit.
		t = new Thread(this);
		bankDepo = bankMulti;
		t.start();
	}
	public void run() {
		bankDeposit();
	}
	
	synchronized void bankDeposit() {
		//Taking input to perform deposit that much time.
		System.out.print("How many time you want to deposit: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			//Taking amount to deposit.
			System.out.print("Enter the amount you want to deposit:");
			double deposit = sc.nextDouble();
			bankDepo.balance += deposit;
		}
		System.out.println("Balance: " + bankDepo.balance);
		Withdraw with = new Withdraw(bankDepo);
		
		try {
			with.t.join();
		}
		catch(Exception e) {
			System.out.println("Invalid transaction.");
		}
	}
}

class Withdraw implements Runnable {
	//Creating class withdraw which inherits Runnable interface.
	
	public static Scanner sc = new  Scanner(System.in);
	
	//Declaring variables gloablly for performing withdraw.
	BankMulti bankWith;
	Thread t;
	
	Withdraw(BankMulti bankMulti) {
		//Initializing the variables for performing withdraw.
		t = new Thread(this);
		bankWith = bankMulti;
		t.start();
	}
	public void run() {
		bankWithdraw();
	}
	synchronized void bankWithdraw() {
		//Taking input to perform withdraw that much time.
		System.out.print("How many times you want to withdraw: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n;  i++) {
			//Taking amount to withdraw.
			System.out.print("Enter the amount you want to withdraw:");
			double withdraw = sc.nextDouble();
			bankWith.balance -= withdraw;
		}
		System.out.println("Balance: " + bankWith.balance);
	}
}
	
public class BankUsingMultiThreading {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)throws  IllegalThreadStateException{
		
		BankMulti bal = new BankMulti(0); //Creating object for BankMulti.
		Deposit depo = new Deposit(bal);  //Creating object for Deposit.
		try {
			depo.t.join();
		}
		catch(Exception e) {
			System.out.println("Invalid transaction.");
		}
		@SuppressWarnings("unused")
		Withdraw with = new Withdraw(bal);  //Creating object for Withdraw.
		
		
	}
}



//-------------Test Case-------------
//TestCase1: 
//How many time you want to deposit: 5
//Enter the amount you want to deposit:1000
//Enter the amount you want to deposit:1000
//Enter the amount you want to deposit:1000
//Enter the amount you want to deposit:1000
//Enter the amount you want to deposit:1000
//Balance: 5000.0
//How many times you want to withdraw:  3
//Enter the amount you want to withdraw:500
//Enter the amount you want to withdraw:500
//Enter the amount you want to withdraw:500
//Balance: 3500.0

//TestCase2:
//How many time you want to deposit: 1
//Enter the amount you want to deposit:5000
//Balance: 5000.0
//How many times you want to withdraw: 2
//Enter the amount you want to withdraw:2500
//Enter the amount you want to withdraw:2500
//Balance: 0.0



