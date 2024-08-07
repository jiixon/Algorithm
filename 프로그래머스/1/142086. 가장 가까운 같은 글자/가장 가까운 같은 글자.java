import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i = 1; i<s.length(); i++){
            for(int j = i-1; j>=0; j--){
                if(s.charAt(j) == s.charAt(i)){
                    answer[i] = i-j;
                    break;
                }
                answer[i] = -1;
            }
        }
        return answer;
    }
}