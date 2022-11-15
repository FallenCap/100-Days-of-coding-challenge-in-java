/*Write a java program to take two integer n and p as an input and calculate n^p and also create a custom exception to throw an exception 
 * if n or p or both are zero or negative. */

package Day035;

import java.util.*;
public class ExceptionHandel1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void powerCalc(int n, int p) throws CustomNumberException{
		if(n == 0 || p == 0) {
			//if n or p or both is 0 then it throws error message.
			throw new CustomNumberException("n and p should not be zero.");
		}
		else if(n < 0 || p < 0) {
			//if n or p or both is negative then it throws error message.
			throw new CustomNumberException("n and p should not be negtive.");
		}

		else {
			//calculating the n^p.
			int c =(int) Math.pow(n, p);
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		//Entering n.
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		//Entering p.
		System.out.println("Enter another number: ");
		int p = sc.nextInt();
		
		//Checking error.
		try {
			powerCalc(n, p);
		}
		catch(Exception e) {
			System.out.println("java.lang.Exception: " + e);
		}
	}

}


//-------------Test Case-------------

//TestCase1:
//Input: 2 3
//Output: 8

//TestCase2:
//Input: 0 12
//Output: java.lang.Exception: Day035.CustomNumberException: n and p should not be zero.

//TestCase3:
//Input: -2 -5
//Output: java.lang.Exception: Day035.CustomNumberException: n and p should not be negtive.