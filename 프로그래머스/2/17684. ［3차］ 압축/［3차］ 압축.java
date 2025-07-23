import java.util.*;
class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dict = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i<26; i++){
            dict.put(String.valueOf((char)('A'+i)),i+1);
            
        }
        
        int i = 0;
        int idx = 27;
        
        while(i<msg.length()){
            String w = "";
            int j = i+1;
            boolean exists = false;
            
            for(j = i+1; j<=msg.length(); j++){
                String sub = msg.substring(i, j);
                
                if(dict.containsKey(sub)) {

                    exists = true;
                    w = sub;
                }
                else{
                    exists = false;
                    break;
                }
            }
            answer.add(dict.get(w));
            
            if(!exists){
                String newKey = msg.substring(i,j);
                dict.put(newKey, idx++);
            }
            
            i+=w.length();
            
        }
        
        int[] result = new int[answer.size()];
        for(int k = 0; k<answer.size(); k++){
            result[k] = answer.get(k);
        }
        
        return result;
    }
}