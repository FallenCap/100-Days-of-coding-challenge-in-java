/* Write a java program to take input from a text file using file handling and check whether is the input is Armstrong number or not and print it on another file.*/

package Day043;

import java.io.*;
import java.util.*;

public class CheckArmtrongFileHandling {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static  void checkArmstring() throws IOException {
		
		//making a instance of the text file which we want to use using File function.
		File testCase = new File("D:\\codes\\Java GitHub\\100-Days-of-coding-challenge-in-java\\src\\Day043\\testCase.txt");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(testCase);
		
	      while (sc.hasNextLine()) {
	    	  String data = sc.nextLine(); //Taking the file data as a string.
	    	  int data1 = Integer.parseInt(data);//Transfering the file data into an integer.
	    	  
	    	  int data2 = data1;
	    	  int  total = 0;
	    	  
	    	  //Logic for the armstrong number.
	    	  while(data2 > 0) {
	  			int  temp = data2 % 10;
	  			total += (int) Math.pow(temp, 3);
	  			data2 /= 10;
	  		}
	    	  try {
	  			//Creating a object of the file.
	  			FileWriter fw = new FileWriter("D:\\codes\\Java GitHub\\100-Days-of-coding-challenge-in-java\\src\\Day043\\outPut.txt");
	  			if(total == data1)
		  			fw.write(data1 +" is an Armstrong number");
		  		else
		  			fw.write(data1 +" is not an Armstrong number");
	  			
	  			fw.close();
	  		}
	  		catch(FileNotFoundException e) {
	  			System.out.println("File not found in the directory.");
	  		}
	     }
	}
	

	public static void main(String[] args) throws IOException {
		
		//Taking a string as a input from user.
		System.out.print("Enter the number you want to print in the text file: ");
		String num = br.readLine();
		
		try {
			//Creating a object of the file.
			FileWriter fw = new FileWriter("D:\\codes\\Java GitHub\\100-Days-of-coding-challenge-in-java\\src\\Day043\\testCase.txt");
			fw.write(num); //Printing the string in the text file.
			fw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found in the directory.");
		}
		checkArmstring();//Calling the method.
	
	}

}


//-------------Test Case-------------

//TestCase1: 
//Input: 371(in testCase.txt)
//Output: 371 is an Armstrong number (in outPut.txt)

//TestCase2: 
//Input: 122(in testCase.txt)
//Output: 122 is not an Armstrong number (in outPut.txt)