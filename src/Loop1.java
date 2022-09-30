import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Loop1 {
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        int output = 0;
        
        for(int i = 1; i <= 10; i++) {
            output = N * i;
            System.out.println(N + " x " + i + " = " + output);
        }
        
    }
}
