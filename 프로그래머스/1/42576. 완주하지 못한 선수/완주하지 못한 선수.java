import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> check = new HashMap<>();
        for(String s : participant){
            if(check.containsKey(s)){
                Integer value = check.get(s);
                check.put(s,value+1);
            }else {
                check.put(s,1);
            }
        }
        
        for(String s : completion){
            if(check.containsKey(s)){
                Integer value = check.get(s);
                if(value == 1){
                    check.remove(s);
                }else {
                    check.put(s,value-1);
                }
            }
        }
        Set<String> key = check.keySet();
        for(String s : key){
            return s;
        }
        return answer;
    }
}