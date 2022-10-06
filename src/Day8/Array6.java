//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
package Day8;
import java.util.*;

public class Array6 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void TransferZeros(int arr1[], int l1) {
		// Method for to move all 0's to the end of an array.
		
		int i = 0; 						//initializing the i
		for(int j = 0; j < l1;) {
			if(arr1[j] == 0) {
				//if the current array element is 0 then its check the next element.
				j++;
			}
			else {
				//If the current element is non-0 then swapping the value into a new array and after that check the next element.
				int temp = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp;
				i++;
				j++;
			}
		}
		while(i < l1) {
			//Assigning the 0's int the new array after assigning the non-0 elements.
			arr1[i++] = 0;
		}
			System.out.print("\nAfter moving 0's to the end of the array: \n");
			for(int n : arr1) {
				//Printing the new array using for-each loop
				System.out.print(n + " ");
				System.out.print("\n");
			}
	}
	public static void main(String[] args) {
		//Giving the length of the array by user.
		System.out.println("Enter the length of the array: ");
		int l = sc.nextInt();
		
		//Giveing the array inputs by user.
		int[] arr = new int[l];
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();
		}
		
		TransferZeros(arr, l);
	}

}


//------------ Test Cases ------------
//TestCase1: 
//Enter the length of the array: 
//5
//Enter the array elements: 
//0
//0
//1
//6
//78
//
//After moving 0's to the end of the array: 
//1 
//6 
//78 
//0 
//0 

//TestCase2: 
//Enter the length of the array: 
//10
//Enter the array elements: 
//12
//43
//0
//6
//0
//4
//0
//0
//98
//0
//
//After moving 0's to the end of the array: 
//12 
//43 
//6 
//4 
//98 
//0 
//0 
//0 
//0 
//0 
