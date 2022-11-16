/* Write a java program to create a calculator with addition, subtraction, multiplication, division operations.
 Which throws:
 -Cannot divide by 0 exception.
 -Max input exception: if any of the input is greater than or equals to 100000.
 -Max Multiplier exception: Don't allow any multiplication input to be greater than 7000.
 */

package Day036;

import java.util.*;
class calculator {
	public static Scanner sc = new Scanner(System.in);
	
	//Declaring varible globally.
	 static double a;
	 static double b;
	
	@SuppressWarnings("static-access")
	public void addition() throws CustomCalculatorException{
		//Method for  addition.
		try {
			//Assigning value for the global variable.
			System.out.print("Enter a number: ");
			this.a = sc.nextDouble();
			System.out.print("Enter another number: ");
			this.b = sc.nextDouble();
			
			 if(a >= 100000 || b >= 100000) {
				 //If one of the inputed number is greater then or equals to 100000 then it throws the custom exception.
				 throw new CustomCalculatorException("Please enter value below then 100000");
			 }
			 else {
				 //Adding the variables.
				 double c = a + b;
					System.out.println("Answer: " + c);
			 }
		}
		catch(InputMismatchException e) {
			//if the user gives the wrong input type then it print the following string.
			System.out.println("Please enter a valid input.");
		}
	}
	
	
	@SuppressWarnings("static-access")
	public void subtraction() throws CustomCalculatorException {
		//Method for subtraction.
		try {
			//Assigning value for the global variable.
			System.out.print("Enter a number: ");
			this.a = sc.nextDouble();
			System.out.print("Enter another number: ");
			this.b = sc.nextDouble();
			
			 if(a >= 100000 || b >= 100000) {
				 //If one of the inputed number is greater then or equals to 100000 then it throws the custom exception.
				 throw new CustomCalculatorException("Please enter value below then 100000");
			 }
			 else {
				 //Subtract the variables.
				 double c = a - b;
					System.out.println("Answer: " + c);
			 }
		}
		catch(InputMismatchException e) {
			//if the user gives the wrong input type then it print the following string.
			System.out.println("Please enter a valid input.");
		}
	}
	
	@SuppressWarnings("static-access")
	public void multiplication() throws CustomCalculatorException {
		//Method for multiplication.
		try {
			//Assigning value for the global variable.
			System.out.print("Enter a number: ");
			this.a = sc.nextDouble();
			System.out.print("Enter another number: ");
			this.b = sc.nextDouble();
			
			 if(a >= 7000 || b >= 7000) {
				//If one of the inputed number is greater then or equals to 7000 then it throws the custom exception.
				 throw new CustomCalculatorException("Inputed multiplier can't be greater than 7000.");
			 }
			 else {
				 //Multiply the variables.
				 double c = a * b;
					System.out.println("Answer: " + c);
			 }
		}
		catch(InputMismatchException e) {
			//if the user gives the wrong input type then it print the following string.
			System.out.println("Please enter a valid input.");
		}
	}
	
	@SuppressWarnings("static-access")
	public void divison() throws CustomCalculatorException {
		//Method for division.
		try {
			//Assigning value for the global variable.
			System.out.print("Enter a number: ");
			this.a = sc.nextDouble();
			System.out.print("Enter another number: ");
			this.b = sc.nextDouble();
			 if(a >= 100000 || b >= 100000) {
				//If one of the inputed number is greater then or equals to 100000 then it throws the custom exception.
				 throw new CustomCalculatorException("Please enter value below then 100000");
			 }
			 else {
				 if(b == 0) {
					 //If the diviser is 0 then it throws the custom exception.
					 throw new CustomCalculatorException("Can't divided by zero.");
				 }
				 else {
					 //Dividing the variables.
					 double c = a / b;
						System.out.println("Answer: " + c);
				 }
			 }
		}
		catch(InputMismatchException e) {
			//if the user gives the wrong input type then it print the following string.
			System.out.println("Please enter a valid input.");
		}
	}
}


public class CalculatorExceptionHandel {
	public static Scanner sc = new Scanner(System.in);

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		calculator calc = new calculator(); // Creating a new object for the class calculator.
		
		System.out.println("1. Addition." + "\n2. Subtraction." + "\n3. Multiplication." + "\n4. Division.");
		
		//Enter the choice.
		System.out.print("\nEnter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: {
			try {
				calc.addition();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				break;
			}
		}
		case 2: {
			try {
				calc.subtraction();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				break;
			}
		}
		case 3: {
			try {
				calc.multiplication();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				break;
			}
		}
		case 4: {
			try {
				calc.divison();
			} 
			catch (CustomCalculatorException e) {
				System.out.println(e);
			}
			finally {
				break;
			}
		}
		default: System.out.println("Pls enter a valid input.");
		}
		
	}
}	
	
	
	//-------------Test Case-------------
	
//TestCase1:
//Input: 1(choice), s
//Output: 
//	1. Addition.
//	2. Subtraction.
//	3. Multiplication.
//	4. Division.
//
//	Enter your choice: 1
//	Enter a number: s
//	Please enter a valid input.

//TestCase2:
//Input: 1(choice), 23,56
//Output:
//1. Addition.
//2. Subtraction.
//3. Multiplication.
//4. Division.
//
//Enter your choice: 1
//Enter a number: 23
//Enter another number: 56
//Answer: 79.0

//TestCase3:
//Input: 2(choice), 34, 23
//Output:
//1. Addition.
//2. Subtraction.
//3. Multiplication.
//4. Division.
//
//Enter your choice: 2
//Enter a number: 34
//Enter another number: 23
//Answer: 11.0

//TestCase4:
//Input: 3(choice), 23, 8000
//Output:
//1. Addition.
//2. Subtraction.
//3. Multiplication.
//4. Division.
//
//Enter your choice: 3
//Enter a number: 23
//Enter another number: 80000
//Day036.CustomCalculatorException: Inputed multiplier can't be greater than 7000.

//TestCase5:
//Input: 3(choice), 12, 23
//Output:
//1. Addition.
//2. Subtraction.
//3. Multiplication.
//4. Division.
//
//Enter your choice: 3
//Enter a number: 12
//Enter another number: 23
//Answer: 276.0

//TestCase6:
//Input:4(choice), 2, 0
//Output:
//1. Addition.
//2. Subtraction.
//3. Multiplication.
//4. Division.
//
//Enter your choice: 4
//Enter a number: 2
//Enter another number: 0
//Day036.CustomCalculatorException: Can't divided by zero.

//TestCase7:
//Input: 4(choice), 12, 6
//Output:
//1. Addition.
//2. Subtraction.
//3. Multiplication.
//4. Division.
//
//Enter your choice: 4
//Enter a number: 12
//Enter another number: 6
//Answer: 2.0