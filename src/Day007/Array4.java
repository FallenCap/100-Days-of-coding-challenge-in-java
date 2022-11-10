// Write a Java program to find the common elements between two arrays of integers.
package Day007;

import java.util.*;

public class Array4 {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Entering the length of first array
		System.out.println("Enter the first string length: ");
		int l1 = sc.nextInt();
		int arr1[] = new int[l1];
		
		//Entering the elements of first array
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < l1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		//Entering the length of Second array
		System.out.println("Enter the second string length: ");
		int l2 = sc.nextInt();
		int arr2[] = new int[l2];
		
		//Entering the elements of Second array
		System.out.println("Enter the array elements: ");
		for(int j = 0; j < l2; j++) {
			arr2[j] = sc.nextInt();
		}
		CompareArray(arr1, arr2); //Calling the function which compares the arrays
	}
	public static void CompareArray(int arr1[], int arr2[]) {
		//writing a method to compare two arrays
		for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == (arr2[j]))
                {
                 
                 System.out.println("Common element is : "+(arr1[i]));
                 }
            }
        }
	}
}


//------------ Test Cases ------------

//Test case1: 
//Enter the first string length: 
//4
//Enter the array elements: 
//1
//2
//4
//6
//Enter the second string length: 
//5
//Enter the array elements: 
//5
//2
//3
//6
//1
//Common element is : 1
//Common element is : 2
//Common element is : 6


//Test case2: 
//Enter the first string length: 
//6
//Enter the array elements: 
//12
//31
//54
//23
//65
//17
//Enter the second string length: 
//5
//Enter the array elements: 
//31
//17
//8934
//34
//90
//Common element is : 31
//Common element is : 17
