import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long i1 = Long.parseLong(st.nextToken());
        long i2 = Long.parseLong(st.nextToken());
        long sum1 = 0;
        long sum2 = 0;
        if(i1>i2){
            sum1 = i1 * (i1 + 1) / 2;
            sum2 = i2 * (i2 - 1) / 2;
            
            System.out.println(sum1-sum2);
        } else if (i1==i2) {
            System.out.println(i1);
        } else{
            sum1 = i1 * (i1 - 1) / 2;
            sum2 = i2 * (i2 + 1) / 2;
            System.out.println(sum2-sum1);
        }
    }
}