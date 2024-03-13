import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bf.readLine().split("");
        long sum = 0;
        for(String s: split){
            sum+=Math.pow(Integer.parseInt(s),5);
        }
        System.out.println(sum);
    }
}