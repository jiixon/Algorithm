import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<keymap.length; i++){
            for(int j = 0; j<keymap[i].length(); j++){
                if(!map.containsKey(keymap[i].charAt(j))){ //문자 존재하지 않으면, 
                    map.put(keymap[i].charAt(j), j+1);
                }else{
                    int currentCnt = map.get(keymap[i].charAt(j));
                    if(currentCnt > j+1){ //현재 키 카운트가 최소가 아니라면,
                        map.put(keymap[i].charAt(j), j+1);
                    }
                }
            }
        }
        
        //targets 최소키 갯수 확인
        for(int i = 0; i<targets.length; i++){
            int count = 0;
            for(int j = 0; j<targets[i].length(); j++){
                if(map.containsKey(targets[i].charAt(j))){
                    count += map.get(targets[i].charAt(j));
                }
                else {
                    count = -1;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}