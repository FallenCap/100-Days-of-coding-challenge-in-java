/*Implement Bubble Sort using java.*/

package Day088;

import java.util.*;

public class BubbleSort {
	
	//Method for bubble sort.
	 public static void bubbleSort(int[] array) {
	        for (int i = array.length - 1; i > 0; i--) {
	        	//the loop will iterate through from the last to first element of the array.
	            for (int j = 0; j < i; j++) {
	                if (array[j] > array[j+1]) {
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	            }
	        }
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		
		int[] myArray = new int[n];
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < n; i++) {
			myArray[i] = sc.nextInt();
		}

        bubbleSort(myArray);

        System.out.println("Array after Bubble Sort: " + Arrays.toString(myArray) );
        sc.close();
	}

}


//------------ Test Cases -----------
//TestCase1:
/*
Enter the length of the array: 
5
Enter the array elements: 
21
13
26
32
2
Array after Bubble Sort: [2, 13, 21, 26, 32]
*/


//TestCase2:
/**/