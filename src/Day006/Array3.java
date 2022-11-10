//Write a Java program to remove a specific element from an array.

package Day006;

import java.util.*;
public class Array3 {
 public static Scanner sc = new Scanner(System.in);
 
 public static int[] removeTheElement(int[] arr, int index) {
	// Function to remove the element
	 
	// If the array is empty  or the index is not in array range return the original array
     if (arr == null || index < 0
         || index >= arr.length) {

         return arr;
     }
  // Create another array of size one less
     int[] anotherArray = new int[arr.length - 1];
     for (int i = 0, k = 0; i < arr.length; i++) {
         if (i == index) {
             continue;
         }
         anotherArray[k++] = arr[i];
     }
     return anotherArray;
 }
public static void main(String[] args) {
	System.out.println("Enter the array length: ");
	int l = sc.nextInt();
	
	int arr[] = new int[l];
	//Entering the array elements
	for(int i = 0; i < l; i++ ) {
		System.out.println("Enter the " + (i + 1) + " element of the array: ");
		arr[i] = sc.nextInt();
	}
	
	 
    // Print the resultant array
    System.out.println("Original Array: "
                       + Arrays.toString(arr));

    // Get the specific index
    System.out.println("Enter the index: ");
    int index = sc.nextInt();

    // Print the index
    System.out.println("Index to be removed: " + index);

    // Remove the element
    arr = removeTheElement(arr, index);

    // Print the resultant array
    System.out.println("Resultant Array: "
                       + Arrays.toString(arr));
 }
}



//------------ Test Cases ------------

//Test case1: 
//Enter the array length: 
//5
//Enter the 1 element of the array: 
//1
//Enter the 2 element of the array: 
//2
//Enter the 3 element of the array: 
//3
//Enter the 4 element of the array: 
//4
//Enter the 5 element of the array: 
//5
//Original Array: [1, 2, 3, 4, 5]
//Enter the index: 
//3
//Index to be removed: 3
//Resultant Array: [1, 2, 3, 5]

//Test case2: 
//Enter the array length: 
//6
//Enter the 1 element of the array: 
//21
//Enter the 2 element of the array: 
//23
//Enter the 3 element of the array: 
//12
//Enter the 4 element of the array: 
//54
//Enter the 5 element of the array: 
//23
//Enter the 6 element of the array: 
//65
//Original Array: [21, 23, 12, 54, 23, 65]
//Enter the index: 
//4
//Index to be removed: 4
//Resultant Array: [21, 23, 12, 54, 65]

