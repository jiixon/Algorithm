import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] say = {"aya", "ye", "woo", "ma"};
        String[] notSay = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(int i = 0; i<babbling.length; i++){
            for(String not : notSay){
                if(babbling[i].contains(not)){
                    babbling[i]+="1"; //발음 할 수 없으면 "1"추가
                }
            }    
        }
        for(int i = 0; i<babbling.length; i++){
            for(String s : say){
                if(babbling[i].contains(s)){
                    babbling[i] = babbling[i].replace(s, "0");
                }
            }
        }
        
        for(String s : babbling){
            if(s.matches("0+")) answer++; //0으로만 이루어져 있다면
        }
        
        return answer;
    }
}