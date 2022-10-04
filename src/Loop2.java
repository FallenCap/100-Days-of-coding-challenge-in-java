import java.util.*;

class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            series_print(a,b,n);
            System.out.println("");
        }
        in.close();
    }
    public static void series_print(int a,int b,int n) {
        for(int i=0;i<n;i++) {
            int v=0;
            v= a+(N(i)*b);
            
            System.out.printf("%d ",v);
        }
    }
    public static int N(int a) {
        int b=0;
        for(int i=a;i>=0;i--) {
            b = b+(int)Math.pow(2,i);
        }
        return b;
    }
}
