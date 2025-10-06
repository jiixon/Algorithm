class Solution {
    int solution(int[][] land) {
        int[][] dp = new int[land.length][4];
        
        //dp 1행 초기화
        for(int i = 0; i<4; i++){
            dp[0][i] = land[0][i];
        }
        
        for(int i = 1; i<land.length; i++){
            
            //4열로 고정
            dp[i][0] = land[i][0] + Math.max(dp[i-1][1], Math.max(dp[i-1][2], dp[i-1][3]));
            dp[i][1] = land[i][1] + Math.max(dp[i-1][0], Math.max(dp[i-1][2], dp[i-1][3]));
            dp[i][2] = land[i][2] + Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][3]));
            dp[i][3] = land[i][3] + Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
        }

        int answer = 0;
        for(int i = 0; i<4; i++){
            if(dp[dp.length-1][i]>answer) answer = dp[dp.length-1][i];
        }
        return answer;
    }
}