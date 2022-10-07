package Day5;
import java.util.Scanner;

public class BinaryInsertion {
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
		System.out.println("After sorting the array is: ");
		int arr1[] = InsertionSort(arr);
		System.out.print("Enter the number you want to search: ");
		int key = sc.nextInt();
		int index = BinarySearch(arr1, key);
		if(index == -1) {
			System.out.println(key + " not found");
		}
		else {
			System.out.println("Element found at: " + index);
		}
		
	}
}
