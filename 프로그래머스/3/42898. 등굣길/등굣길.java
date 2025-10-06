class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n][m];
        
        for(int i = 0; i<puddles.length; i++){
            dp[puddles[i][1]-1][puddles[i][0]-1] = -1; //웅덩이 -1
        }
        
        dp[0][0] = dp[0][0] == -1 ? 0 : 1; //시작점 웅덩이면 0, 아니면 1로 초기화
        
        //첫 행처리: 웅덩이면 0으로 두고, 아니면 왼쪽 값 복사
        for(int i = 1; i<m; i++){
            if(dp[0][i] == -1) dp[0][i] = 0;
            else dp[0][i] = dp[0][i-1]; //시작점이 웅덩이가 아닌 경우 첫 행 계속해서 복사
        }
        
        //첫 열처리
        for(int i = 1; i<n; i++){
            if(dp[i][0] == -1) dp[i][0] = 0;
            else dp[i][0] = dp[i-1][0];
        }
        
        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                if(dp[i][j] == -1) { //웅덩이면 0으로 처리 후 계속 진행
                    dp[i][j] = 0;
                    continue;
                }
                //위의 값 + 왼쪽 값 해서 경로 누적
                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000007;
                
            }
        }
        
        return dp[n-1][m-1];
    }
}