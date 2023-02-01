/*Write a Java program to find a specified element in a given sorted array of elements using Jump Search.*/

package Day095;

public class JumpSearch {

	    public static int jumpSearch(int[] nums, int item)	    {
	        
	    	int array_size = nums.length;
	 
	        // Find block size to be jumped
	        int block_size = (int)Math.floor(Math.sqrt(array_size));
	 
	        // If the element is present find the block where element is present
	        int prev_item = 0;
	        while (nums[Math.min(block_size, array_size)-1] < item)
	        {
	            prev_item = block_size;
	            block_size += (int)Math.floor(Math.sqrt(array_size));
	            if (prev_item >= array_size)
	                return -1;
	        }
	 
	        // Using a linear search for element in block beginning with previous item
	        while (nums[prev_item] < item)
	        {
	            prev_item++;
	            if (prev_item == Math.min(block_size, array_size))
	                return -1;
	        }
	 
	        // If element is found
	        if (nums[prev_item] == item)
	            return prev_item;
	 
	        return -1;
	    }
	    

		public static void main(String[] args) {
	        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
	        int search_num = 120;

	       // Find the index of searched item
	       int index_result = jumpSearch(nums, search_num);

	       if(index_result == -1) {
	    	   System.out.println("The element is not in the array.");
	       }
	       else {
	    	   System.out.println(search_num + " is found at index " + index_result);
	       }

		}
}


//------------ Test Cases -----------

//TestCase1:
//Input: 
/*
 Array: 1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564
 search_num : 120
 */
//Output: 120 is found at index 12


//Input: 
/*
Array: 1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564
search_num : 90
*/
//Output: The element is not in the array.

