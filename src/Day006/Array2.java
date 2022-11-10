package Day006;
//Write a Java program to calculate the average value of array elements

import java.util.*;
public class Array2 {
public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("Enter the leght of array: ");
			int length = sc.nextInt();				//Entering the length of array.
			
			
			int numbers[] = new int[length];
			//Entering array elements
			for(int i = 0; i < length; i++) {
				System.out.println("Enter the " + (i + 1) + " element of the array: ");
				numbers[i] = sc.nextInt();
			}
			
	       //calculate sum of all array elements
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array elements is : " + average);

	}

}


//------------ Test Cases ------------

//Test case1: 
//input: 5
//12
//21
//45
//32
//14
//output: 24

//Test case2: 
//input: 6
//3
//6
//9
//12
//15
//18 
//output: 10

