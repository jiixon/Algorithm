class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=i; j<=n; j++){
                sum+=j;
                if(sum==n){
                    System.out.println(j);
                    result++;
                    break;
                }else if(sum>n) break;
            }
        }
        return result;        
    }
}