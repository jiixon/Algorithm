import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        int[] dp = new int[11];
        dp[0] = 1; 
        dp[1] = 1; 
        dp[2] = 2; 
        
        for (int i = 3; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(dp[n]);
        }
        
        scanner.close();
    }
}