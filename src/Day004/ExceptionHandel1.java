/* Write overloaded methods named nextValue().
If  the  input  is  numeric  value  of  the  type  int,  float,  or  double,  the  associated  methods  should return a value that is onegreater than the input parameter but with the data type similar to the input. 
If the input  is a single character either a char or a String, the associated methods should return  a  char  or  a  String  whose  value  is  the  character  immediately  following  the  input parameter. 
For  example,  nextValue(‘q’)  must  return  ‘r’.  
If  the  input  is  a  String  with more  than one characters, the method should return a new  String whose  content  is the same as the input  but the last position is the  character  immediately following the character in the last  position of the original String. 
For example, nextValue(“ABC”) must return “ABD”. If the input is null, the method returns null.
 */

package Day004;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExceptionHandel1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static double nextValue(double a) {
    	//Overloaded method for returning double.
            return ++a;
    }
    public static float nextValue(int a) {
    	//Overloaded method for returning integer.
        return ++a;
    }
    
    public static String nextValue(String a) {
    	//Overloaded method for returning string.
        int b= a.length()-1;
        a = a.substring(0,b)+(char)(a.charAt(b)+1);
        return a;
    }
    public static void int_return(double a) {
        System.out.println(a);
    }
    
public static void main(String[] args) throws IOException {
		//Initializing the double and interger values.
        double d = 0;
        int a=0;
        //Taking input as a string.
        System.out.println("Enter a input: ");
        String c= br.readLine();
        
        try {
            if(c.contains(".")) {
            	//if the string containing numbers contains '.' then it will change the string into the double.
                d=Double.parseDouble(c.substring(0,c.length()-1));
                System.out.println(nextValue(d));
            }
            else {
            	//if the string containing numbers not contains '.' then it will change the string into the integer.
                a=Integer.parseInt(c);
                System.out.println(nextValue(a));
            }
        }
        catch (NumberFormatException e) {
        	//if the string containing charactersinstead of numbers then it will print as a string.
            System.out.println(nextValue(c));   // input is not a double
        }
    }
}

//-------------Test Case-------------

//TestCase1:
//Input: abc
//Output: abd

//TestCase2:
//Input: 