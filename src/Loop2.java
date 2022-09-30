import java.util.Scanner;
class Loop2{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int loop = 1;
        int result = 0;
        while(loop<=number){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=b;
                int n=sc.nextInt();
                result=0;

            for(int x=1;x<=n;x++){

                result=a+(1*b)+result;


                System.out.printf(result +" ");
                b*=2;


            }   


                loop++;
            }
    }
}

