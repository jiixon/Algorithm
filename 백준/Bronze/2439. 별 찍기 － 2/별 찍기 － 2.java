import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 1; i<a+1; i++){
            for(int j = a; j>0; j--){
                if(j<=i) System.out.print("*");
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }
}