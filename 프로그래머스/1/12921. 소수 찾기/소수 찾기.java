class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n+1];
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(!isPrime[i]){
                for(int j = i*i; j<=n; j+=i){
                    isPrime[j] = true; //i의 배수들은 모두 소수
                }
            }
        }
        for(int i = 2; i<= n; i++){
            if(!isPrime[i]) answer++;
        }
        return answer;
    }
}