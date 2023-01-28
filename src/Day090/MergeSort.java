/*Implement MergeSort Sort using java.*/

package Day090;

import java.util.*;

public class MergeSort {

	//Method for merge.
	public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }
	
	//Method for Merge Sort
	 public static int[] mergeSort(int[] array) {
	        if (array.length == 1) return array;

	        int midIndex = array.length/2;
	        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
	        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

	        return merge(left, right);
	    }
	
	public static void main(String[] args) {

		int[] array1 = {10, 32, 3, 43,12, 87};

        System.out.println("Array after merge sort: " +  Arrays.toString( mergeSort(array1) ) );	
	}

}


//------------ Test Cases -----------

//TestCase1:
//Array after merge sort: [1, 2, 3, 4, 5, 6, 7, 8]


//TestCase2: 
//Array after merge sort: [2, 4, 5, 6, 10, 32, 3, 43, 12, 87]

