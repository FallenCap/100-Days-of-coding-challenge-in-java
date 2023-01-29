/*Write a java program to implement binary search and insertion sort.*/

package Day005;
import java.util.Scanner;

public class BinaryInsertion {
	public static Scanner sc = new Scanner(System.in);
	
	private static int[] InsertionSort(int arr1[]) {
		//method for Insertion sort
		int i = 0;//Initializing the i.
		
		while(i < arr1.length) {
			//Logic for insertion sort.
			int temp = arr1[i]; //storing arr[i] in a temporary variable.
			int j = i - 1;
			
			while(j >= 0 && arr1[j] > temp) {
				//if the array[j] is bigger than temp then the position of the values will be swapped.
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
		
		int low = 0; //initializing the lower index.
		int high = arr1.length - 1; //initializing higher index.
		
		while(low <= high) {
			int middle = low + (high - low) / 2; //Creatign the middle index.
			
			//assigning array[middle] into value.
			int value = arr1[middle];
			
			if(value < key1) {
				//if value is lesser than key then low will changed into middle+1.
				low = middle + 1;
			}
			else if(value > key1) {
				//if the value is greater than key than it will change high = middle+1.
				high = middle -1;
			}
			else {
				//if value = key then it return middle.
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
		//printing array after sorting
		System.out.println("After sorting the array is: ");
		int arr1[] = InsertionSort(arr);
		//entering the value we want to found.
		System.out.print("Enter the number you want to search: ");
		int key = sc.nextInt();
		
		int index = BinarySearch(arr1, key);
		if(index == -1) {
			//if the index is -1 then the array element is not in the array.
			System.out.println(key + " not found");
		}
		else {
			System.out.println("Element found at: " + index);
		}
		
	}
}




//-------------Test Case-------------
//TestCase1:
//Input: 12(length), 23 21 45 12 9 3
//Output: 
//After sorting the array is: 
//3 
//9 
//12 
//21 
//23 
//45 
//Enter the number you want to search: 21
//Element found at: 3

//TestCase2:
//Input: 10(length), 12 32 9 4 56 43 78 0 65 97
//Output: 
//After sorting the array is: 
//0 
//4 
//9 
//12 
//32 
//43 
//56 
//65 
//78 
//97 
//Enter the number you want to search: 12
//Element found at: 3
