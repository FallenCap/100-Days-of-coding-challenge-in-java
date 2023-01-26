package Day089;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	//method for selection sort.
	public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
        	//The loop will iterate through the whole array.
            int minIndex = i; //taking i as min index which will change its value every time till the loop is running.
            for (int j = i+1; j < array.length; j++) {
            	//The loop will iterate through i+1 to the last element of the array.
                if (array[j] < array[minIndex]) {
                	/*If the array[j] elemnt is lesser than min index the the j is assign as minIndex.*/
                    minIndex = j;
                }
            }
            if (i != minIndex) {
            	/*If i not equals to minIndex then the array[minIndex] and array[i] will swap their position.*/
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
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

	       selectionSort(myArray);

	        System.out.println("Array after Selection Sort: " + Arrays.toString(myArray) );
	        sc.close();
	}

}
