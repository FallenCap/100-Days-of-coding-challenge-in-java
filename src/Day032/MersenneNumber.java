//Write a program to check if a number is Mersenne number or not.
//In mathematics, a Mersenne number is a number that can be written in the form M(n) = 2n − 1 for some integer n.
//The first four Mersenne primes are 3, 7, 31, and 127


package Day032;

import java.util.*;
public class MersenneNumber {
	public static Scanner sc = new Scanner(System.in);
	
	public static void isMersenne(int n) {
		//Method to check the inputed number is mersenne or not.
		
		int n1 = n + 1;
		int power = 0;
        int ans = 0;
        for(int i=0;;i++) {
            power=(int)Math.pow(2,i);
            if(power>n1) {
                break;
            }
            else if(power==n1) {
               System.out.println(n+" is a Mersenne number.");
               ans=1;
            }
        }
        if(ans==0) {
        	System.out.println(n+" is not a Mersenne number.");
        }
	}

	public static void main(String[] args) {
		//Taking input to check whether the number is mersenne or not.
		 System.out.print("Input a number to check whether it is mersenne or not: ");
	        int n = sc.nextInt();
	        isMersenne(n);	      
	}

}



//-------------Test Case-------------

//TestCase1:
//Input: 31
//Output: 31 is a Mersenne number.


//TestCase2:
//Input: 100
//Output: 100 is not a Mersenne number.

//TestCase3:
//Input: 127
//Output: 127 is a Mersenne number.
