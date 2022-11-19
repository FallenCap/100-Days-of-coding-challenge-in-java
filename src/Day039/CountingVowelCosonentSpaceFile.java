/*Write a java program to print an string in a existing text file and print the number of  vowel consonants and white space.*/

package Day039;

import java.io.*;
import java.util.*;
public class CountingVowelCosonentSpaceFile {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException  {
		
		//Taking a Strign as a input from user.
		System.out.println("Enter the text you want to print into the text file: ");
		String data = br.readLine();
		try {
			//Creating a object of the file.
			FileWriter fw = new FileWriter("D:\\codes\\Java GitHub\\100-Days-of-coding-challenge-in-java\\src\\Day039\\testCase.txt");
			fw.write(data); //Printing the string in the text file.
			fw.close();
		} 
		catch (FileNotFoundException e) {
			//If the file is not found then it prints the below text in console.
			System.out.println("The file is not found.");
		}
		
		try {
			//Creating a object of the file.
			File testCase = new File("D:\\codes\\Java GitHub\\100am -Days-of-coding-challenge-in-java\\src\\Day039\\testCase.txt");
			Scanner sc = new Scanner(testCase);
		      while (sc.hasNextLine()) {
		        String data1 = sc.nextLine();
		        int count = 0;
				int count1 = 0;
				int count2 = 0;
				for(int i=0;i<data1.length();i++) {
					if(data1.charAt(i) == 'a' || data1.charAt(i) == 'e' || data1.charAt(i) == 'i' || data1.charAt(i) == 'o' || data1.charAt(i) == 'u' 
							|| data1.charAt(i) == 'A' || data1.charAt(i) == 'E' || data1.charAt(i) == 'I' || data1.charAt(i) == 'O' || data1.charAt(i) == 'U') {
						//If the particular character is a vowel then the count will increment.
							count++;
					}
					else if(data1.charAt(i) == ' ') {
					//If the particular character is a white space then the count1 will increment.
						count2++;
					}
					else {
						//If the particular character is a consonant then the count2 will increment.
						count1++;
					}
				}
				//Printing the vowel, consonant and white spaces.
				System.out.println("vowels:" + count);
				System.out.println("Consonent:" + count1);
				System.out.println("BlankSpace:" + count2);
		      }
		}
		catch(FileNotFoundException e) {
			System.out.println("The file is not found.");
		}
		
		
	}

}
