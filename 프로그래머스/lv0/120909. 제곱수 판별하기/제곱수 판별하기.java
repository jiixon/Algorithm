class Solution {
    public int solution(int n) {
        for(int i=1; i<n; i++){
            if(Math.sqrt(n)==(double)i){
                return 1;
            }
        }
        return 2;
    }
}