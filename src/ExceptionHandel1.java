import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExceptionHandel1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
    	
        double d = 0;
        int a=0;
        System.out.println("Enter a input: ");
        String c= br.readLine();
        try {
            if(c.contains(".")) {
                d=Double.parseDouble(c.substring(0,c.length()-1));
                System.out.println(nextValue(d));
            }
            else {
                a=Integer.parseInt(c);
                System.out.println(nextValue(a));
            }
        }
        catch (NumberFormatException e) {
            System.out.println(nextValue(c));   // input is not a double
        }
    }
    
    public static double nextValue(double a) {
            return ++a;
    }
    public static float nextValue(int a) {
        return ++a;
    }
    
    public static String nextValue(String a) {
        int b= a.length()-1;
        a = a.substring(0,b)+(char)(a.charAt(b)+1);
        return a;
    }
    public static void int_return(double a) {
        System.out.println(a);
    }
}