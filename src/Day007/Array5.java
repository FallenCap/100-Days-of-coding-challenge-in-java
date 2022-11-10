//Find all Pairs of elements in an array whose sum is equal to a specified number
package Day007;

public class Array5 {

	static void  pairs_value(int inputArray[], int inputNumber) {
		//Method for Find all Pairs of elements in an array whose sum is equal to a specified number
	  System.out.println("Pairs of elements and their sum : ");
	 
	  for (int i =  0; i < inputArray.length; i++) {
		  for (int j  = i+1; j < inputArray.length; j++) {
			  if(inputArray[i]+inputArray[j] == inputNumber) {
				  System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
			  }
		  }
	  	}
	  }
	  
	  public static void  main(String[] args)
	  {
	  pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15); //Calling the method and passing values as arguments.
	  
	  }
}


//------------ Test Cases ------------

//TestCase1: 
//Input: [2, 7, 4, -5, 11, 5, 20], 15
//output: 
//Pairs of elements and their sum : 
//4 + 11 =  15
//-5 + 20 =  15

//TestCase2: 
//Input: [14, -15, 9, 16, 25, 45, 12, 8], 30
//output: 
//Pairs of elements and their sum : 
//14 + 16 =  30
//-15 + 45 =  30