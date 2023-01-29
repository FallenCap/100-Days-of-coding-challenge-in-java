/*Implement Bucket Sort using java.*/

package Day092;

import java.util.*;  
public class BucketSort   { 
	
	//user-defined method to sort array  
	private static void binSort(int[] array, int bktSize)  {   
		@SuppressWarnings("unchecked")
		List<Integer>[] buckets = new List[bktSize];  
		// Linked list with each bucket array index  
		// as there may be hash collision   
		for(int i = 0; i < bktSize; i++) {  
			buckets[i] = new LinkedList<>();  
		}  
		//calculate the hash and assigns elements to the proper bucket  
		for(int num : array) {  
			buckets[hash(num, bktSize)].add(num);  
		}  
		//iterate over the buckets and sorts the elements  
		for(List<Integer> bucket : buckets) {  
			//sorts the bucket      
			Collections.sort(bucket);  
		}  
		int index = 0;  
		//gethered the buckets after sorting  
		for(List<Integer> bucket : buckets) {  
			for(int num : bucket) {  
				array[index++] = num;  
			}  
		}  
	} 
	
	//distributing elements   
	private static int hash(int num, int bucketSize) {  
		return num/bucketSize;  
	}  

	public static void main(String args[]) { 
		int[] array = {22, 45, 12, 8, 10, 6, 72, 81, 33, 18, 50, 14, 55, 0, 12, 55};  
		System.out.println("Unsorted Array: " + Arrays.toString(array));  
		//calling the user-defined method to sort the array  
		binSort(array, 10);  
		System.out.println("Sorted Array: " + Arrays.toString(array));  
	}  
} 


//------------ Test Cases -----------

//TestCase1:
/*
 Unsorted Array: [22, 45, 12, 8, 10, 6, 72, 81, 33, 18, 50, 14, 55, 0, 12, 55]
Sorted Array: [0, 6, 8, 10, 12, 12, 14, 18, 22, 33, 45, 50, 55, 55, 72, 81]
 */


//TestCase2:
/*
Unsorted Array: [10, 32, 3, 45, 76, 21, 90]
Sorted Array: [3, 10, 21, 32, 45, 76, 90]
*/