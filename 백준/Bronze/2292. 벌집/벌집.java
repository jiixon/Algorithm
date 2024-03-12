import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long i=1;
        long count = 1;
        while(n>count){
            count += 6*i;
            i++;
        }
        System.out.println(i);
    }
}