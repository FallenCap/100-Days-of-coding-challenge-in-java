/*Implement Radix Sort using java*/

package Day093;

import java.util.*;

class RadixSort {

	//Method to get maximum value in arr[]
	static int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	// Method for countSort
	static void countSort(int arr[], int n, int exp) {
		int output[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		// Copy the output array to arr[], so that arr[] now
		// contains sorted numbers according to current
		// digit
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

	// Method for radixSort
	static void radixsort(int arr[], int n) {
		// Find the maximum number to know number of digits
		int m = getMax(arr, n);

		// Do counting sort for every digit. Note that
		// instead of passing digit number, exp is passed.
		// exp is 10^i where i is current digit number
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}

	//Method to print an array
	static void print(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		int arr[] = { 200, 100, 500, 300, 900, 800, 700, 400, 600 };
		int n = arr.length;

		// Function Call
		radixsort(arr, n);
		print(arr, n);
	}
}


//------------ Test Cases -----------

//TestCase1: 
//Input:  170, 45, 75, 90, 802, 24, 2, 66
//Output: 2 24 45 66 75 90 170 802 


//TestCase2:
//Input: 200, 100, 500, 300, 900, 800, 700, 400, 600 
//Output: 100 200 300 400 500 600 700 800 900 
