//Searching for an element in an unsorted array using Insertion sort and Binary Search.


package Day017;

import java.util.Scanner;
public class InsertionAndBinary {
	public static Scanner sc = new Scanner(System.in);
	private static int[] InsertionSort(int arr1[]) {
		//method for Insertion sort
		int i = 0;
		while(i < arr1.length) {
			int temp = arr1[i];
			int j = i - 1;
			
			while(j >= 0 && arr1[j] > temp) {
				arr1[j + 1] = arr1[j];
				j--;
			}
			arr1[j + 1] = temp;
			i++;
		}
		for(int j : arr1) {
			System.out.println(j + " ");
		}
		return arr1;
	}
	
public static int BinarySearch(int arr1[], int key1) {
	//method for Binary search
	int low = 0;
	int high = arr1.length - 1;
	
	while(low <= high) {
		int middle = low + (high - low) / 2;
		int value = arr1[middle];
		
		System.out.println("step: " + value);
		
		if(value < key1) {
			low = middle + 1;
		}
		else if(value > key1) {
			high = middle -1;
		}
		else {
			return middle;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		System.out.print("Enter the array length: ");
		int l = sc.nextInt();
		int arr[] = new int[l];
		//Taking the inputs for the array
		for (int i = 0; i <  arr.length; i++) {
			System.out.print((i + 1)+ " element: ");
			arr[i] = sc.nextInt();
		}
		//Printing the sorted array
		System.out.println("After sorting the array is: ");
		int arr1[] = InsertionSort(arr);
		
		//Entering the key value.
		System.out.print("Enter the number you want to search: ");
		int key = sc.nextInt();
		int index = BinarySearch(arr1, key);
		
		//if the index returns -1 then it prints not found or its print the position of the key value.
		if(index == -1) {
			System.out.println(key + " not found");
		}
		else {
			System.out.println("Element found at: " + index);
		}
		
	}

}


//------------ Test Cases -----------
//TestCase1:
//Enter the array length: 10
//1 element: 2
//2 element: 4
//3 element: 3
//4 element: 12
//5 element: 10
//6 element: 23
//7 element: 32
//8 element: 30
//9 element: 28
//10 element: 40
//After sorting the array is: 
//2 
//3 
//4 
//10 
//12 
//23 
//28 
//30 
//32 
//40 
//Enter the number you want to search: 32
//step: 12
//step: 30
//step: 32
//Element found at: 8

//TestCase2:
//Enter the array length: 15
//1 element: 21
//2 element: 23
//3 element: 12
//4 element: 8
//5 element: 45
//6 element: 4
//7 element: 18
//8 element: 15
//9 element: 87
//10 element: 24
//11 element: 64
//12 element: 41
//13 element: 69
//14 element: 76
//15 element: 29
//After sorting the array is: 
//4 
//8 
//12 
//15 
//18 
//21 
//23 
//24 
//29 
//41 
//45 
//64 
//69 
//76 
//87 
//Enter the number you want to search: 12
//step: 24
//step: 15
//step: 8
//step: 12
//Element found at: 2