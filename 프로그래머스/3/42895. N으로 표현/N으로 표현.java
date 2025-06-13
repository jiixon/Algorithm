import java.util.*;
class Solution {
    public int solution(int N, int number) {
        Set<Integer>[] dp = new Set[9];
        if(N == number) return 1;
        for(int i = 1; i<=8; i++){
            dp[i] = new HashSet<>();
            
            int num = 0;
            //N을 i번 사용해서 만들 수 있는 숫자 채우기
            for(int n = 0; n<i; n++){
                num = 10*num + N;
                dp[i].add(num); //N, NN, NNN
            }
            
            for(int j = 1; j<=i-1; j++ ){
                int k = i - j;
                //i = 3이면, dp[1]과 dp[2] 연산
                for(int x : dp[j]){
                    for(int y : dp[k]){
                        dp[i].add(x+y);
                        dp[i].add(x-y);
                        dp[i].add(x*y);
                        if(y!=0) dp[i].add(x/y);
                    }
                }

            }
            if(dp[i].contains(number)) return i;
        }
        return -1;
    }
}