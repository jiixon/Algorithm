class Solution {
    public long solution(long n) {
        for(long i=1; i<n+1; i++){
            if(Math.sqrt(n)==(long)i){
                return (i+1)*(i+1);
            }
        }
        return -1;
    }
}