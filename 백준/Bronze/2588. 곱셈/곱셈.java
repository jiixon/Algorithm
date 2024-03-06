import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        int t1 = Integer.parseInt(s2.substring(2));
        int t2 = Integer.parseInt(s2.substring(1,2));
        int t3 = Integer.parseInt(s2.substring(0,1));

        int n = Integer.parseInt(s1);
        System.out.println(n*t1);
        System.out.println(n*t2);
        System.out.println(n*t3);
        System.out.println((n*t3)*100 + (n*t2)*10 + (n*t1)*1 );
    }
}