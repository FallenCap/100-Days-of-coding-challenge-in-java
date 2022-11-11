/*Write a Java program to check if a given number is circular prime or not.
 Circular Prime : A circular prime is a prime number with the property that the number generated at each intermediate step 
 when cyclically permuting its (base 10) digits will be prime.
 */

package Day031;

import java.util.Scanner;
public class CircularPrimeNo {
	public static Scanner sc = new Scanner(System.in);
	
	static boolean checkCircularPrime(int n) {
		//method for check circular prime number.
        if( n < 2 ) {
        	//Logic for check if the number is circular prime or not. 
        	return false;
        }
        else if( n == 2 ) {
        	return true;
        }
        else if( n % 2 == 0 ) {
        	return false;
        }
        else{
            int num = (int) Math.sqrt( n );
            for( int i = 3 ; i <= num; i+=2 ){
                if( n %i == 0 ){
                    return false;
                }
            }
        }
        return true;
	}
	
	public static int circulate_func( int n, int divisor_part ){
		//method to circulate the number.
        if( n < 10 ) {
        	return n; 
        }
        else {
        	return ( n % divisor_part ) * 10 + n / divisor_part; 
        }
  }
	
	public static void main(String[] args) {
		//Entering the number to check whether it is circular prime or not.
		System.out.println("Enter a number to check whether it is circular prime or not: ");
		int num = sc.nextInt();
		@SuppressWarnings("unused")
		//Initializing the other variables for the operation.
		int num_of_digits = 0, divisor_part=1, circular_num = num; 
        boolean allPrime = true; 
        for( int i = num; i > 0; i /= 10 ) {
            num_of_digits++;
            divisor_part *=10;
        }
        divisor_part /=10;
        do{
            circular_num = circulate_func( circular_num, divisor_part );
            if( !checkCircularPrime( circular_num ) ) {
            	allPrime=false;
            }
        }while( circular_num != num );
        if( allPrime ) {
        	System.out.println(num + " is Circular Prime number." );
        }
        else {
        	System.out.println(num + " is not a Circular Prime number." );
        }
	}

}


//-------------Test Case-------------

//TestCase1: 1931
//Output: 1931 is Circular Prime number.

//TestCase2: 
//Input: 35
//Output: 35 is not a Circular Prime number.

//TestCase3:
//Input: 373
//Output: 373 is Circular Prime number.
