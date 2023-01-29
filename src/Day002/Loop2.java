/*write a javaprogram to print the following series (a+2^0.b), (a+2^0.b+2^1.b),......,(a+2^0.b+2^1.b+.....+2^n-1.b)*/

package Day002;
import java.util.*;

class Loop2{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int N(int a) {
		//Function to calculate 2^0.b+2^1.b+.....+2^n-1.b part.
	        int b=0;
	        for(int i=a;i>=0;i--) {
	        	//in every iteration the it will add 2^n-1.
	            b = b+(int)Math.pow(2,i);
	        }
	        return b;
	    }

    public static void series_print(int a,int b,int n) {
    	//function to calculate the remaing part of the series
        for(int i=0;i<n;i++) {
            int v=0;//initialize the total.
            
            //after each iteration we do a+2^0.b+2^1.b+.....+2^n-1.b.
            v= a+(N(i)*b);
            
            System.out.printf("%d ",v);
        }
    }

    public static void main(String []args){
    	//Taking the inputs.
        	System.out.println("Enter the inputs: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.print("Output: ");
            series_print(a,b,n);
    }
}


//-------------Test Case-------------

//TestCase1:
//Input: 2, 3, 4
//Output: 5 11 23 47 

//TestCase2:
//Input:0 2 10
//Output: 2 6 14 30 62 126 254 510 1022 2046 
