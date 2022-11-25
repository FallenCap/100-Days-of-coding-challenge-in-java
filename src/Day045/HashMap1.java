/*Write a Java program to test if a map contains a mapping for the specified key.*/

package Day045;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMap1 {
public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		//Declaring the HashMap
		HashMap<String, Integer> h_map = new HashMap<String, Integer> ();
		
		//Inserting key values in the HashMap
		h_map.put("Red", 1);
		h_map.put("Green", 2);
		h_map.put("Black", 3);
		h_map.put("White", 4);
		h_map.put("Blue", 5);
		  
		//Taking input of the key value you want to find.
		  System.out.print("Enter the key element you want to find: ");
		  String key = br.readLine();
		  
		  System.out.println("Is key " + key +  " exists?");
		  
		  if (h_map.containsKey(key)) {
		   //key exists
		   System.out.println("yes! - " + h_map.get(key));
		  } else {
		   //key does not exists
		   System.out.println("no!");
		  }
	}

}



//-------------Test Case-------------

//TeastCase1:
//Input: Green
//Output: 
//Is key Green exists?
//yes! - 2

//TestCase2:
//Input: Orange
//Output:
//Is key Orange exists?
//no!
