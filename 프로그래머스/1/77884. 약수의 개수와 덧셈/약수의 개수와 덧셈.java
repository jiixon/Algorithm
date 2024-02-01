class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for(int i=left; i<right+1; i++){
            int count = divisor(i);
            for(int j=1; j<=left/2+1; j++){
                if(count%2==0) {
                    sum+=i; 
                    break;
                }
                else if(count%2!=0) {
                    sum-=i; 
                    break;
            
                }
            }

        }
        return sum;
}

private int divisor(int number){
    int count = 0;
    for(int i=1; i<number+1; i++){
        if(number%i==0){
            count+=1;
        }
    }
    return count;
    }
}