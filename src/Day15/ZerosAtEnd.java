package Day15;

import java.util.*;
public class ZerosAtEnd {
	public static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) throws Exception {
       int[] arr = {0,1,0,2,0,3,0,4};	//Declaring array
        int i = 0;
        
        //printing the origianl array.
		System.out.print("\nOriginal array: \n");
		for (int n : arr)
           System.out.print(n+"  ");
		
		//Transfering the non-zero elements into the starting of array
       for(int j = 0, l = arr.length; j < l;) {
           if(arr[j] == 0)
               j++;
           else {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i ++;
               j ++;
           }
       }
       
       //Transfering the0's into the ending of the array.
       while (i < arr.length)
           arr[i++] = 0;
       
       //Printing the array after processing.
		System.out.print("\nAfter moving 0's to the end of the array: \n");
       for (int n : arr)
           System.out.print(n+"  ");
			System.out.print("\n");
   }
}



//------------ Test Cases -----------
//TestCase1:
//Original array: 
//0  0  1  0  3  0  5  0  6  
//After moving 0's to the end of the array: 
//1  3  5  6  0  0  0  0  0  

//TestCase2:
//Original array: 
//0  1  0  2  0  3  0  4  
//After moving 0's to the end of the array: 
//1  2  3  4  0  0  0  0  