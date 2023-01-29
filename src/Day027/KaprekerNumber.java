/*Write a Java program to generate and show all Kaprekar numbers in a given range.
In number theory, a Kaprekar number for a given base is a non-negative integer, 
the representation of whose square in that base can be split into two parts that add up to the original number again.
For instance, 45 is a Kaprekar number, because 452 = 2025 and 20 + 25 = 45 */

package Day027;

import java.util.*;
public class KaprekerNumber {
	public static Scanner sc = new Scanner(System.in);
	
	static boolean iskaprekar(int n)
    {
        if (n == 1) {
        	return true;
        }
      
        // Count number of digits in square
        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0)
        {
            count_digits++;
            sq_n /= 10;
        }
        sq_n = n*n; // Recompute square as it was changed
      
        // Split the square at different points and see if sum
        // of any pair of splitted numbers is equal to n.
        for (int r_digits=1; r_digits<count_digits; r_digits++)
        {
             int eq_parts = (int) Math.pow(10, r_digits);
      
             // To avoid numbers like 10, 100, 1000 (These are not
             // Kaprekar numbers
             if (eq_parts == n)
                continue;
      
             // Find sum of current parts and compare with n
             int sum = sq_n/eq_parts + sq_n % eq_parts;
             if (sum == n)
               return true;
        }
      
        // compare with original number
        return false;
    }

	public static void main(String[] args) {
		//Entering the length.
		System.out.println("Enter the range: ");
		int length = sc.nextInt();
		
		//Printing the Kaprekar in the given range.
		System.out.println("The Kaprekar numbers in 0 to " + length + " is: ");
		for (int i=0; i<=length; i++) {
			if (iskaprekar(i)) {
				System.out.print(i + " ");	
			}
		}		
	}
}


//-------------Test Case-------------

//TestCase1:
//Input: 1000
//Output: 1 9 45 55 99 297 703 999 

//TestCase2:
//Input: 10000
//Output: 1 9 45 55 99 297 703 999 2223 2728 4879 4950 5050 5292 7272 7777 9999
