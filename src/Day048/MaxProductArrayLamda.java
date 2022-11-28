/*Create a Java interface and override with lambda expression to find maximum product of two integers in a given array of integers.*/

package Day048;

import java.util.Scanner;

interface FindMaxProduct {
	//Creating the interface.
	
	void getAnswer(int[] arr);	//method for find maximum product of two integers in a given array of integers.
}

public class MaxProductArrayLamda {
	public static Scanner sc = new  Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();	//taking input for array size.
		
		int[] arr = new int[size]; //declaring the array.
		
		//Taking user input as the array elements.
		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++) {
			 arr[i] = sc.nextInt();
		}
		
		//Creating lamda expression to override tge interface.
		FindMaxProduct max = (arr1)-> {
			
			//Initializing the variables.
			int max_pair_product = 0;
			int max_i = 0, max_j = 0;

			for (int i = 0; i < arr1.length - 1; i++)
			{
				for (int j = i + 1; j < arr1.length; j++)
				{
					if (max_pair_product < arr1[i] * arr1[j])
					{
						max_pair_product = arr1[i] * arr1[j];	//Check max_pair_product in every iteration.
						max_i = i;	//For every iteration max_i will update.
						max_j = j;	//For every iteration max_j will update.
					}
				}
			}

			System.out.print("Pair is (" + arr1[max_i] + ", " + arr1[max_j] + "), Maximum Product: " + (arr1[max_i]*arr1[max_j]));
		};
		max.getAnswer(arr);
	}

}




//-------------Test Case-------------

//TestCase1: 
//Input: 5 (array length), 12 13 14 15 16 (elements)
//Output: 
//Pair is (15, 16), Maximum Product: 240

//TestCase2:
//Input: 10 (array length), 2 4 8 1 10 23 7 18 15 19 (elements)
//Output: 
//Pair is (23, 19), Maximum Product: 437
