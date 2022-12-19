/*write a java program in which the push, pop method in a stack can be safely accessed from multiple threads.*/

package Day042;

import java.util.*;

class StackOperation{
	//Creating class for stack push and pop operation.
	public static Scanner sc = new Scanner(System.in);
	
	Stack<Integer> stk = new Stack<> (); //Declaring Stack globally.
	
	public synchronized void  push(){
		//Creating a synchronized method  to push elements into the stack.
		
		//Taking input to push element that times into the stack.
		System.out.println("How many times you want to push elements into stack: ");
		int n = sc.nextInt();
		
		//Entering elements into stack.
		System.out.println("Enter the items: ");
		for(int i = 1; i <= n; i++) {
			int item = sc.nextInt();
			stk.push(item);
		}
		
		System.out.println("Stack: " + stk);
	}
	
	public synchronized void pop(){
		//Creating a synchronized method  to pop elements from the stack.
		
		//Taking input to pop element that times from the stack.
		System.out.println("How many times you want to pop element: ");
		int n = sc.nextInt();
		
		//Popping elements from the stack.
		for(int i = 1; i <= n; i++) {
			stk.pop();
		}
		System.out.println("Popping done.");
		System.out.println("Stack: " + stk);
	}
}

class StackPush implements Runnable{
	
//Creating StackPush class which inherits Runnable interface.
	
	//Assigning variables globally.
	StackOperation s;
	Thread t;
	
	StackPush(StackOperation s) {
		//initializing the variables 
		this.s = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		s.push();
		
StackPop pop = new StackPop(s);
		
		try {
			pop.t.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class StackPop implements Runnable {
	//Creating StackPop class which inherits Runnable interface.
	
	//Assigning variables globally.
	StackOperation s;
	Thread t;
	
	StackPop(StackOperation s) {
		//initializing the variables 
		this.s = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		s.pop();
	}
}

public class StackOperationUsingMultiThreading {

	public static void main(String[] args) {
		StackOperation s = new StackOperation(); //Creating object of StackOperation class.
		@SuppressWarnings("unused")
		StackPush push = new StackPush(s); //Creating object of StackPush class.
		
		@SuppressWarnings("unused")
		StackPop pop = new StackPop(s); //Creating object of StackPop class.
	}
}


//-------------Test Case-------------

//TestCase1:
//How many times you want to push elements into stack: 
//5
//Enter the items: 
//10
//11
//12
//13
//14
//Stack: [10, 11, 12, 13, 14]
//How many times you want to pop element: 
//3
//Popping done.
//Stack: [10, 11]

//TestCase2: 
//How many times you want to push elements into stack: 
//10
//Enter the items: 
//12
//32
//45
//65
//23
//87
//01
//67
//21
//76
//Stack: [12, 32, 45, 65, 23, 87, 1, 67, 21, 76]
//How many times you want to pop element: 
//5
//Popping done.
//Stack: [12, 32, 45, 65, 23]
