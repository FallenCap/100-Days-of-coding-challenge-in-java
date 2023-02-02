/*Write a Java program to find a specified element in a given sorted array of elements using Interpolation Search.*/

package Day096;

public class InterpolationSearch {
	
	//Method for Interpolation search.
    public static int Interpolation_search(int[] nums, int searched_num) {
        int low_num = 0;
        int high_num = nums.length - 1;
        int mid_num;
        while (nums[high_num] != nums[low_num] && nums[low_num] < searched_num && nums[high_num] >= searched_num) {
            mid_num = low_num + ((searched_num - nums[low_num]) * (high_num - low_num) / (nums[high_num] - nums[low_num]));
            if (searched_num > nums[mid_num])
                low_num = mid_num + 1;
            else if (searched_num < nums[mid_num])
                high_num = mid_num - 1;
            else
                return mid_num;
        }
        if (nums[low_num] == searched_num) {
            return low_num;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args){
        int nums[] = {10, 32, 54,23, 21, 87, 55, 9, 11, 16, 78};
        int searched_num = 1;
	   // Find the index of searched item
        int index_result = Interpolation_search(nums, searched_num);
        if(index_result == -1) {
	    	   System.out.println("The element is not in the array.");
	       }
	       else {
	    	   System.out.println(searched_num + " is found at index " + index_result);
	       }
    }

}


//------------ Test Cases -----------

//TestCase1: 
//Input: 
/*
Array: 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564
search_num : 91
*/

//Output: 91 is found at index 13

//TestCase2:
//Input: 
/*
Array: 10, 32, 54,23, 21, 87, 55, 9, 11, 16, 78
search_num : 1
*/

//Output: The element is not in the array.

