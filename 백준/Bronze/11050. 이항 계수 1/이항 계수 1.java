
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static long factorial(long num){
        if (num==1 || num == 0) return 1;
        else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        if(m==0) System.out.println(1);
        else{
            System.out.println(factorial(n)/(factorial(m)*factorial(n-m)));
        }

    }
}