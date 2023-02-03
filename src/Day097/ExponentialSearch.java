/*Write a Java program to find a specified element in a given sorted array of elements using Exponential search.*/

package Day097;

import java.util.Arrays;
public class ExponentialSearch {
	
	//Method for exponential search.
	private static int exponentialSearch(int[] arr, int i) {
		int start_num = 0;
		
		if(arr[start_num] == i)
			return start_num;
		start_num =1;
		while(start_num < arr.length && arr[start_num] <= i) {
			start_num*=2;
		}
		return Arrays.binarySearch(arr, start_num/2, Math.min(start_num, arr.length), i);
	}
	
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
        int search_num = 120;
		
		// Find the index of searched item
       int index_result = exponentialSearch(nums, search_num);

       if(index_result == -1) {
    	   System.out.println("The element is not in the array.");
       }
       else {
    	   System.out.println(search_num + " is found at index " + index_result);
       }		
		
	}
}


//------------ Test Cases -----------

//TestCase1:
//Input: 
/*
Array: 1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564
search_num : 120
*/
//Output: 120 is found at index 12


//Input: 
/*
Array: 1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564
search_num : 90
*/
//Output: The element is not in the array.

