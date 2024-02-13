class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for(int j=2; j<sum; j++){
            if(sum%j==0 && sum/j <= j){
                if((j-2)*(sum/j-2)==yellow){
                    answer[0] = j;
                    answer[1] = sum/j;
                    break;
                    }
                    
              }
        }
        return answer;
    }
}