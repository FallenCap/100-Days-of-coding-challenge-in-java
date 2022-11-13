/*Create a inteface in1 which includes a method display which takes an integer as input .
 Now write a class  which implements interface in1 and has a method named display.
  Which takes an integer as input and total number of prime numbers between 2 and integer k (including it).
*/

package Day033;

import java.util.Scanner;

interface in1 {
	void display(int r1);
}

class printPrime implements in1 {

	@Override
	public void display(int r1) {
		int i = 2;
		int ans = 0;
		
		while(i <= r1) {
			if(i % 2 != 0) {
				ans++;
			}
			i++;
		}
		System.out.println("The numbers of prime numbers between 2 to " + r1 + " is: " + ans);
	}
	
}
public class PrimeUsingInterface {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the range: ");
		int range = sc.nextInt();
		
		printPrime p1 = new printPrime();
		p1.display(range);
		
	}
}


//-------------Test Case-------------

//TestCase1:
//Input: 13
//Output: 
//The numbers of prime numbers between 2 to 13 is: 6


//TestCase2:
//Input: 80
//Output:
//The numbers of prime numbers between 2 to 80 is: 39


//TestCase3:
//Input: 200
//Output:
//The numbers of prime numbers between 2 to 200 is: 99