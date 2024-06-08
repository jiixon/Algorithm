import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long[] memo;
    public static long fibonacci_dp_bottom(int n) {
        if (n <= 1) return n;
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        memo = new long[n + 1];

        System.out.println(fibonacci_dp_bottom(n));
    }
}
