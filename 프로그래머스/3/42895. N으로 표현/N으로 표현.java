import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = 0;
        Set<Integer>[] dp = new Set[9];
        if(N == number) {
            return 1;
        }
        for(int i = 1; i<=8; i++) {
            dp[i] = new HashSet<>();
            
            int num = 0; 
            for(int n = 0; n<i; n++){
                num = 10*num + N;
            }
            dp[i].add(num);
            
            for(int j = 1; j<=i-1; j++) {
                int k = i-j;
                for(int x : dp[j]) {
                    for(int y : dp[k]){
                        dp[i].add(x+y);
                        dp[i].add(x-y);
                        dp[i].add(x*y);
                        if(y!=0) dp[i].add(x/y);
                    }
                   
                }
                 
            }
            if (dp[i].contains(number)) {
                return i;
            }
        }
        
        return -1;
    }
}