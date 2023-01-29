/*Write a java program to print a multiplication table from 1 to 10 of any user given number.*/

package Day001;

import java.util.*;
public class Loop1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
    	//Giving input for multiplier
    	System.out.println("Enter the multiplier: ");
        int N = sc.nextInt();
        
        //Initialize the output.
        int output = 0;
        
        for(int i = 1; i <= 10; i++) {
        	//In ecah iteration the N will be multiplied with i.
            output = N * i;
            
            //Printing the value of the multiplication.
            System.out.println(N + " x " + i + " = " + output);
        }
        
    }
}

//-------------Test Case-------------

//TestCase1:
//Input: 3
//Output:
//3 x 1 = 3
//3 x 2 = 6
//3 x 3 = 9
//3 x 4 = 12
//3 x 5 = 15
//3 x 6 = 18
//3 x 7 = 21
//3 x 8 = 24
//3 x 9 = 27
//3 x 10 = 30

//TestCase2:
//Input: 23
//Output: 
//23 x 1 = 23
//23 x 2 = 46
//23 x 3 = 69
//23 x 4 = 92
//23 x 5 = 115
//23 x 6 = 138
//23 x 7 = 161
//23 x 8 = 184
//23 x 9 = 207
//23 x 10 = 230
