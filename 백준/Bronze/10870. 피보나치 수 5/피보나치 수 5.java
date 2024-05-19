
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long[] memo;
    public static long fibonacci_dp(int n) {
        if (n <= 1) return n;
        else if(memo[n] != 0) return memo[n];
        else return memo[n] = fibonacci_dp(n-1) + fibonacci_dp(n-2);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new long[21];
        System.out.println(fibonacci_dp(n));
    }
}
