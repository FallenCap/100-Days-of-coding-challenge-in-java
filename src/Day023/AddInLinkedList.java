/*Write a Java program to insert the specified element at the specified position in the linked list.*/

package Day023;

import java.util.LinkedList;
public class AddInLinkedList {

	public static void main(String[] args) {
		
		// create an empty linked list
				LinkedList <String> l_list = new LinkedList <String> ();
				
				// use add() method to add values in the linked list
				l_list.add("Red");
				l_list.add("Green");
				l_list.add("Black");
				l_list.add("White");
				l_list.add("Pink");
				l_list.add("Blue");
				l_list.add("Violet");
				l_list.add("Indigo");
				
				System.out.println("Original linked list: " + l_list);
				l_list.add(1, "Yellow");
				
				// print the list
				System.out.println("The new linked list:" + l_list);

	}

}


//-------------Output-------------
//Original linked list: [Red, Green, Black, White, Pink]
//Original linked list: [Red, Green, Black, White, Pink, Blue, Violet, Indigo]
//The new linked list:[Red, Yellow, Green, Black, White, Pink, Blue, Violet, Indigo]

