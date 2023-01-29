/* Write a java program to print all  Lychrel numbers in a given range. 
A Lychrel number is a natural number that cannot form a palindrome through the iterative process of repeatedly reversing its digits and adding the resulting numbers. This process is sometimes called the 196-algorithm, after the most famous number associated with the process.
The first few Lychrel numbers are 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887, ... .
 */

package Day028;

import java.util.*;
public class LychrelNumber {
	public static Scanner sc = new Scanner(System.in);
	
	//Initializing the max iterations globally.
	 private static int MAX_ITERATIONS = 20;
	 
	    // Function to check whether number is Lychrel Number
	    private static boolean isLychrel(long number)
	    {
	        for (int i = 0; i < MAX_ITERATIONS; i++)
	        {
	            number = number + reverse(number);
	            if (isPalindrome(number)) {
	            	//if the number is palindrome it returns false.
	            	return false;
	            }
	        }
	        //if the above conditions are satisfied ten it returns ture.
	        return true;
	    }
	 
	    // Function to check whether the number is Palindrome
	    private static boolean isPalindrome(final long number)
	    {
	    	//if the reversed number is equals to the number its means its palindrome and it returns true.
	        return number == reverse(number);
	    }
	 
	    // Function to reverse the number
	    private static long reverse(long number)
	    {
	    	//Initializing the reverse.
	        long reverse = 0;
	 
	        while (number > 0) {
	        	//Logic for reversing a number.
	            long remainder = number % 10;
	            reverse = (reverse * 10) + remainder;
	            number = number / 10;
	        }
	        return reverse;
	    }
	 
	    public static void main(String[] args)
	    {
	    	//Entering the range.
	    	System.out.print("Enter the range: ");
	    	int length = sc.nextInt();
	    	
	    	//Printing the Lychrel numbers in the given range.
	    	System.out.println("The Lychrel numbers in 1 to " + length + " is: ");
	    	for(int i = 0; i <=length; i++) {
	    		if (isLychrel(i)) {
					System.out.print(i + " ");	
				}
	    	}
	    }
}



//-------------Test Case-------------

//TestCase1:  1000(Range)
/*Output: 89 98 187 196 286 295 385 394 484 493 583 592 682 689 691 781 788 790 869 879 880 887 968 978 986 */

//TestCase2: 
//Input: 2000(Range)
/*
 Output: 89 98 187 196 286 295 385 394 484 493 583 592 682 689 691 781 788 790 869 879 880 887 968 978 986 1297 1387 1477 1495 1497 1567 1585 1587 1657 1675 1677 1747 1765 1767 1837 1855 1857 1927 1945 1947 1997 
*/