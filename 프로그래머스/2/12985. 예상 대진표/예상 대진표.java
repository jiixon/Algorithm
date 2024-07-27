class Solution{
    public int solution(int n, int a, int b) { 
        int[] answer = new int[n+1];
        int result = 0;
        for(int i = 1; i<=n; i++){
            answer[i] = i;
        }
        while(answer[a]!=answer[b]){
            for(int i = 1; i<=n; i++){
                if(answer[i]%2==0){
                    answer[i] /= 2;
                }else{
                    answer[i] = answer[i]/2 + answer[i]%2;
                }
            }
            result ++;
        }

        return result;
    }
}