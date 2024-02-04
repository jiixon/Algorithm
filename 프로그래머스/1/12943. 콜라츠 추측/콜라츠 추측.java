class Solution {
    public int solution(int num) {
        int result = 0;
        long n = (long)num;
        while(n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n=n*3+1;
            }
            result+=1;

            if(result>=500){
                break;
            }            
        }
        if(result == 500) return -1;
        return result;
        
        
    }
}