/*Create a interface in2 which includes a method display which takes an integer as input .
 Now write an class  which implements interface in2 and has a method named sumDivisors.
 Which takes an integer as input and display the sum of the divisors of the number.
  */

package Day034;

import java.util.*;

interface in2 {
	//Creating the interface in2.
	void sumDivisors(int number);
}

class SumOfDevisor implements in2 {
	//Creating the class to calculate and diplay the sum of the divisors which implements the interface in2.

	@Override
	public void sumDivisors(int number) {
		//overriding the sumDivisors method.
		
		//initializing the i and sum.
		int i = 1;
		int sum = 0;
		while(i <= number) {
			//if the modulus is zero then i is a divisor of that inputed number.
			if(number % i == 0) {
				sum += i;
			}
			i++;
		}
		//Printing the sum of the divisors.
		System.out.println("Sum of " + number +"'s divisors is: " + sum);
	}
	
}

public class SumOfDivisorsUsingInterface {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Entering the number to do the following operation.
		System.out.println("Enter any number: ");
		int number = sc.nextInt();
		
		//Creating instance of SumOfDevisor.
		SumOfDevisor sum1 = new SumOfDevisor();
		
		//Calling the method.
		sum1.sumDivisors(number);
		
	}

}




//-------------Test Case-------------

//TestCase1:
//Input: 6
//Output: 
///Sum of 21's divisors is: 12

//TestCase2:
//Input: 21
//Output:
//Sum of 21's divisors is: 32

//TestCase3:
//Input: 100
//Output:
//Sum of 21's divisors is: 217
