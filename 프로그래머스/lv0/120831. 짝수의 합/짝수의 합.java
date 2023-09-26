class Solution {
    public int solution(int n) {
        int answer =0; 
        for(int i=2; i<n+1; i+=2){
            answer+=i;
        }
        return answer;
    }
}