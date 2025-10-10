import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        Set<Character> skipSet = new HashSet<>();
        
        for(char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        
        for(int i = 0; i<s.length(); i++){
            int shiftCount = 0; //유효한 이동횟수
            char currentChar = s.charAt(i);
            while(shiftCount < index){
                currentChar++;
                if(currentChar > 'z') currentChar -= 26; //'z'넘어가면 'a'로 순환
                if(!skipSet.contains(currentChar)) {
                    shiftCount++;
                }

                
            }
            answer += currentChar;       
        }
         return answer;
    }
}