package Day003;
import java.util.*;

public class Array1 {

	public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	//Entering the length of the array
	   System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        
       //Delcare and entering the value of the array. 
        int a[] = new int[n];
        System.out.println("Enter array length: ");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Prints each sequential element in array a.
        System.out.println("Printing the array sequentially: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


//-------------Test Case-------------

//TestCase1:
//Input: 21, 23, 45, 65, 67
//Output:
//21
//23
//45
//65
//67

//TestCase2:
//Input: 21 34 65 78 9 35 54 12 90 56
//Output:
//21
//34
//65
//78
//9
//35
//54
//12
//90
//56

















