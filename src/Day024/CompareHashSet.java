//Write a Java program to compare two hash set.
package Day024;

import java.util.*;
public class CompareHashSet {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Create a empty hash set
	    HashSet<String> h_set = new HashSet<String>();
	 // use add() method to add values in the hash set
	      h_set.add("Apple");
	      h_set.add("Mango");
	      h_set.add("Guava");
	      h_set.add("Jack Fruit");

	      HashSet<String>h_set2 = new HashSet<String>();
	      h_set2.add("Apple");
	      h_set2.add("Banana");
	      h_set2.add("Lemon");
	      h_set2.add("Guava");
	      //comparison output in hash set
	      @SuppressWarnings("unused")
		HashSet<String>result_set = new HashSet<String>();
	     for (String element : h_set){
	         System.out.println(h_set2.contains(element) ? "Yes" : "No");
	      }   
	}
}




//-------------Test Case-------------

//TestCase1:
//h_Set: Subham, Sarvesh, Surya, Tarang
//h_Set2: Atin, Surya, Pranav, Tarang
//Output:
//No
//Yes
//No
//Yes

//TestCase2:
//h_Set: Apple, Mango, Guava, Jack Fruit
//h_Set2: Apple, Banana, Lemon, Guava
//Output:
//Yes
//No
//Yes
//No

