//Write a program that will read a line and count all occurrences of the word „the‟.
package Day11;
import java.io.*;
public class CountWord {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		
		//Entering a string
		System.out.println("Enter a sentence:  ");
		String str = br.readLine();
		
		//Entering a word which we need.
		System.out.println("Enter the word to count its occurance: ");
		String word = br.readLine();
		
		//Calling the method
		System.out.println(CountOcc(str, word));
	}
static int CountOcc(String str1, String word1) {
	
	//Mehtod to count the occurance of a word inputed by user.
	String a[] = str1.split(" ");
	int count = 0;
	for(int i = 0; i < a.length; i++) {
		if(word1.equals(a[i])) {
			count++;
		}
	}
	return count;
}
}





//------------ Test Cases -----------
//Test Case1: 
//Enter a sentence:  
//Hello I am the Famous the me
//Enter the word to count its occurance: 
//the
//2


//TestCase2:
//Enter a sentence:  
//Ronaldo is the best footballer
//Enter the word to count its occurance: 
//best
//1

