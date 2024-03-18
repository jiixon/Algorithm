import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int result = 1;
        while (st.hasMoreTokens()){
            result*=Integer.parseInt(st.nextToken());
        }
        System.out.println(result);
    }
}