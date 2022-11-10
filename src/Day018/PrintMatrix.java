//Write a Java method (takes a number n as input) to displays an n-by-n matrix.
package Day018;

import java.util.*;

public class PrintMatrix {
 public static Scanner sc = new Scanner(System.in);
public static void main(String[] args)
    {
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        printMatrix(n);
    }
 
 public static void printMatrix(int n) {
//Method for Creating Matrix.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}



//------------ Test Cases -----------
//TestCase1:
//Input a number: 10
//0 0 0 1 1 1 1 1 0 0 
//1 0 1 1 0 0 0 0 1 0 
//0 0 1 0 0 0 1 1 1 0 
//0 1 0 1 1 1 0 1 1 0 
//0 0 0 1 0 0 1 1 0 0 
//1 0 0 1 1 1 1 0 0 0 
//0 1 1 0 0 0 1 1 0 1 
//0 1 1 1 0 1 1 1 1 1 
//0 1 0 0 1 1 1 0 1 1 
//0 0 0 1 1 0 0 0 0 0 

//TestCase2: 
//Input a number: 20
//1 0 1 1 1 0 0 0 1 1 1 0 0 0 1 0 0 0 1 0 
//1 0 1 1 0 0 1 1 0 0 0 1 0 0 0 1 0 0 1 1 
//1 0 0 1 1 1 1 1 1 0 0 0 0 0 1 1 1 1 0 0 
//0 1 0 0 1 1 0 1 1 1 0 0 1 0 1 1 0 1 0 1 
//1 0 0 0 1 1 1 0 1 0 1 0 0 1 1 1 1 0 1 1 
//1 0 1 0 1 1 1 1 1 1 0 0 1 0 0 1 1 0 1 1 
//0 1 0 1 0 0 1 0 1 0 0 1 0 1 1 0 0 0 1 0 
//0 0 0 0 1 0 1 0 1 1 1 1 1 1 1 0 1 1 1 0 
//0 0 1 1 0 0 0 0 1 1 1 1 1 0 0 1 1 0 0 1 
//1 1 1 0 1 0 1 1 0 1 1 0 0 0 1 0 1 1 0 1 
//0 0 0 1 0 0 1 1 1 0 1 0 0 0 0 1 1 1 1 1 
//1 1 0 0 0 0 1 1 1 0 1 0 0 0 1 0 0 1 0 0 
//0 0 1 1 1 1 1 0 0 0 0 0 0 1 0 0 0 0 1 1 
//0 1 0 0 1 0 0 0 1 0 0 1 0 0 0 0 1 1 0 0 
//0 1 1 1 1 1 0 0 0 1 0 0 0 1 1 1 0 1 1 0 
//1 1 1 0 1 0 1 1 0 0 1 0 0 1 1 1 0 0 0 0 
//1 0 0 0 1 1 0 1 0 0 0 1 1 0 0 1 1 0 1 0 
//1 0 1 1 1 0 1 0 0 0 0 0 0 1 1 0 1 0 1 1 
//1 0 1 0 1 0 1 0 1 0 1 1 0 0 1 1 1 1 0 0 
//0 1 0 1 1 0 0 0 0 1 1 1 1 1 1 0 1 0 1 1 
