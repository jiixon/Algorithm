import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        boolean p = false;
        
        for(int i =1; i<words.length; i++){
            for(int j=0; j<i; j++){
                int jLen = words[j].length();
                if(words[i].equals(words[j])) {
                    answer[0]=i%n+1;
                    answer[1]=i/n+1;
                    p = true;
                    break;
                } 
                if(words[j].charAt(jLen-1)!=words[j+1].charAt(0)){
                    answer[0]=(j+1)%n+1;
                    answer[1]=(j+1)/n+1;
                    p=true;
                    break;   
                }
            }
            if(p) break;
            
        }
        return answer;
    }
}
