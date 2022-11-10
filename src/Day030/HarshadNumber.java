/* Write a java program to print all  Harshad numbers in a given range.
 In recreational mathematics, a harshad number in a given number base, is an integer that is divisible by the sum of its digits when written in that base.
Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. 
Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
 */

package Day030;

import java.util.*;
public class HarshadNumber {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static boolean checkHarshad(int num) {
		//Declaring variables.
		int x = num, y, sum = 0;
        
		//logic for finding sum of of the digits of the number.
	       while(x>0)
	        {
	            y = x%10;
	            sum = sum + y;
	            x = x/10;
	        }
	         
	        if(num%sum == 0) {
	        	//if sum is divisible by sum then it return true.
	        	return true;
	        }
	        return false;
	        
	}

	public static void main(String[] args) {
		//Entering the range.
				System.out.println("Enter the range:");
				int range = sc.nextInt();
				
				//Printing the Disarium number in the given range.
				System.out.println("The Harshad numbers in 1 to " + range + " is: ");
				for(int i = 1; i <= range; i++) {
					if (checkHarshad(i)) {
						System.out.print(i + " ");
					}
				}
	}

}



//-------------Test Case-------------

//TestCase1:
//Input: 100
//Output: 1 2 3 4 5 6 7 8 9 10 12 18 20 21 24 27 30 36 40 42 45 48 50 54 60 63 70 72 80 81 84 90 100 


//TestCase2:
//Input: 500
//Output: 1 2 3 4 5 6 7 8 9 10 12 18 20 21 24 27 30 36 40 42 45 48 50 54 60 63 70
//72 80 81 84 90 100 102 108 110 111 112 114 117 120 126 132 133 135 140 144
//150 152 153 156 162 171 180 190 192 195 198 200 201 204 207 209 210 216 220 
//222 224 225 228 230 234 240 243 247 252 261 264 266 270 280 285 288 300 306 
//308 312 315 320 322 324 330 333 336 342 351 360 364 370 372 375 378 392 396
//399 400 402 405 407 408 410 414 420 423 432 440 441 444 448 450 460 465 468
//476 480 481 486 500