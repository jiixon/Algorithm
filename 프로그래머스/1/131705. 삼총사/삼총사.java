class Solution {
    public int solution(int[] number) {
        int result = 0;
        int sum=0;
        for(int i=0; i<number.length; i++){
            sum=0;
            for(int j=i+1; j<number.length; j++){
                sum=0;
                for(int k=j+1; k<number.length; k++){
                    sum=0;
                    sum+=number[i]+number[j]+number[k];
                    System.out.println(number[i]+ "+"+ number[j] +"+"+ number[k]);
                    
                    System.out.println(sum);
                    if(sum==0){
                        result+=1;
                    }
                }
            }
        }
        return result;
    }
}