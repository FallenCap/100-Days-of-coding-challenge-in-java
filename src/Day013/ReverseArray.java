/*Write a Java program to reverse an array of integer values.*/
package Day013;
import java.util.*;
public class ReverseArray {
	public static Scanner sc = new Scanner(System.in);
	public static int[] Reversing(int[] arr1, int l) {
		//Method for reversing array
		for(int i = 0; i < l / 2; i++) {
			int temp = arr1[i]; 
			arr1[i] = arr1[l - i - 1];
			arr1[l - i - 1] = temp;
		}
		return arr1;
	}
public static void main(String[]args) {
	
	//Entering the length of the array.
	System.out.println("Enter the length of the  array: ");
	int length = sc.nextInt();
	
	//Entering the array element.
	
	int arr[] = new int[length];
	System.out.println("Enter array elements:");
	for(int i = 0; i < length; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Array before reversing:" + Arrays.toString(arr));
	int[] reverse_arr = Reversing(arr, length);
	System.out.println("Array after reversing: " + Arrays.toString(reverse_arr));
	
	}
}


//------------ Test Cases -----------
//TestCase1:
//Enter the length of the  array: 
//5
//Enter array elements:
//23
//21
//1
//45
//2
//Array before reversing:[23, 21, 1, 45, 2]
//Array after reverse: [2, 45, 1, 21, 23]


//TestCase2:
//Enter the length of the  array: 
//10
//Enter array elements:
//21
//13
//25
//32
//87
//32
//78
//22
//98
//123
//Array before reversing:[21, 13, 25, 32, 87, 32, 78, 22, 98, 123]
//Array after reverse: [123, 98, 22, 78, 32, 87, 32, 25, 13, 21]
