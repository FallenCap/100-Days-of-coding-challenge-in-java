/* Write a java program to print all  Disarium numbers in a given range. 
 A number will be called Disarium if the sum of its digits powered with their respective position is equal with the number itself.
 As 11+32+53 = 135
  */

package Day029;

import java.util.*;
public class DisariumNumber {
	public static Scanner sc = new Scanner(System.in);

	static boolean checkDisarium(int num) {
		//Declaring variables.
		int copy = num, d = 0, sum = 0;
        String s = Integer.toString(num);		//trasfering the integer to a string
        int len = s.length();  			//Storing the string length in the len variable.
         
        while(copy>0)
        {
        	//logic for the Disarium Number operation.
            d = copy % 10;  
            sum = sum + (int)Math.pow(d,len);
            len--;
            copy = copy / 10;
        }
         
        if(sum == num) {
        	//if the sum is equals to num then the method returns true.
        	return true;
        }
        return false;
	}
	
	public static void main(String[] args) {
		//Entering the range.
		System.out.println("Enter the range:");
		int range = sc.nextInt();
		
		//Printing the Disarium number in the given range.
		System.out.println("The Disarium numbers in 1 to " + range + " is: ");
		for(int i = 0; i <= range; i++) {
			if (checkDisarium(i)) {
				System.out.print(i + " ");
			}
		}
	}
}


//-------------Test Case-------------

//TestCase1:
//Input: 200
//Output: 
/*The Disarium numbers in 1 to 200 is: 
0 1 2 3 4 5 6 7 8 9 89 135 175 */

//TestCase2:
//Input: 1000
//Output:
/*The Disarium numbers in 1 to 1000 is: 
0 1 2 3 4 5 6 7 8 9 89 135 175 518 598 */