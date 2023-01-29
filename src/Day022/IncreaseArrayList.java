/*Write a Java program to increase the size of an array list.*/

package Day022;

import java.util.*;
public class IncreaseArrayList {

	public static void main(String[] args) {
		//Initialize the array list.
		ArrayList<String> arrL = new ArrayList<String> (3);
		
		//Entering the value of the arrayl list.
		arrL.add("Red");
		arrL.add("Green");
		arrL.add("Blue");
		
		//Printing the array list.
		System.out.println("The Array List is: " + arrL);
		
		//Increasing the size of the array list
		arrL.ensureCapacity(7);
		
		//Again entering the values of the array list.
		arrL.add("Violet");
		arrL.add("Indigo");
		arrL.add("Yellow");
		arrL.add("Orange");
		
		//Printing the new array list.
		System.out.println("\nThe new Array List is: " + arrL);
		
	}

}


//-------------Output-------------

//The Array List is: [Red, Green, Blue]
//
//The new Array List is: [Red, Green, Blue, Violet, Indigo, Yellow, Orange]

