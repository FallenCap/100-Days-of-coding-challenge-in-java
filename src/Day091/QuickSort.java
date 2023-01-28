/*Implement Quick Sort using java.*/

package Day091;

import java.util.Arrays;

public class QuickSort {

	//Method for swap.
	private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

	//Method for pivot
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);

        return swapIndex;
    }

    //Method for quick sort helper.
    private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex-1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }

    //Method for quick sort.
    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }
    
	public static void main(String[] args) {
		int[] myArray = {10, 32,3, 45, 76, 21, 90};

        quickSort(myArray);

        System.out.println( "Array after Quick Sort " + Arrays.toString( myArray ) );
	}

}


//------------ Test Cases -----------
//TestCase1:
/*
 Array after Quick Sort [1, 2, 3, 4, 5, 6, 7]
 */

//TestCase2: 
/*
 Array after Quick Sort [3, 10, 21, 32, 45, 76, 90]

 */