//Write a Java program that randomly picks an English alphabet (A-Z) and keeps asking the user to guess the alphabet until he/she has got it right. Also report the number of trials.

package Day20;

import java.util.Random;
import java.util.Scanner;
public class GuessRandomCharacter {
public static Scanner sc = new Scanner(System.in);
public static void Random(char randomizedCharacter1, int k1) {
    do {
        System.out.printf("Enter a alphabet %d: ",k1);
        char input = sc.next().charAt(0);
        if(randomizedCharacter1 == input) {
            System.out.println("Congrats you have guessed the right alphabet.");
            break;
        }
        else 
            k1--;
        
    }while(k1>0);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
	    char randomizedCharacter = (char) (random.nextInt(26) + 'a');
	    int k = 26;
		Random(randomizedCharacter, k);
	}

}




//------------ Test Cases -----------
//Output1:
//Enter a alphabet 26: a
//Enter a alphabet 25: b
//Enter a alphabet 24: c
//Enter a alphabet 23: d
//Enter a alphabet 22: e
//Enter a alphabet 21: f
//Enter a alphabet 20: g
//Enter a alphabet 19: h
//Enter a alphabet 18: i
//Enter a alphabet 17: j
//Enter a alphabet 16: k
//Congrats you have guessed the right alphabet.


//Output2:
//Enter a alphabet 26: a
//Enter a alphabet 25: b
//Enter a alphabet 24: c
//Enter a alphabet 23: d
//Enter a alphabet 22: e
//Enter a alphabet 21: f
//Enter a alphabet 20: g
//Enter a alphabet 19: h
//Congrats you have guessed the right alphabet.