/*Write a program to delete all vowels from a sentence.*/
package Day012;


import java.io.*;
public class DeleteVowel {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		//Entering a string
		System.out.println("Enter the sentence: ");
		String str = br.readLine();
		System.out.println("After operation the String: ");
		for(int i = 0; i < str.length(); i++) {
			//Checking the vowels of the user given string
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' 
					|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				continue;
			}
			else {
				System.out.println( str.charAt(i));
			}
		}
	}

}



//------------ Test Cases -----------
//TestCase1:
//Enter the sentence: 
//subham
//After operation the String: 
//s
//b
//h
//m


//TestCase2:
//Enter the sentence: 
//Abhishek
//After operation the String: 
//b
//h
//s
//h
//k

