import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i = 0; i<want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        int day = 0;
        for(int i = 0; i<= discount.length - 10; i++) {
            Map<String, Integer> currentMap = new HashMap<>();
            for(int j = i; j<i+10; j++){
                if(currentMap.containsKey(discount[j])){
                    currentMap.put(discount[j], currentMap.get(discount[j])+1);
                }else {
                    currentMap.put(discount[j], 1);
                }
            }
            
            if(matches(wantMap, currentMap)){
                day++;
            }

        }
        return day;
        
    }
    private boolean matches(Map<String, Integer> wantMap, Map<String, Integer> currentMap) {
    for(String key : wantMap.keySet()) {
        if(currentMap.getOrDefault(key, 0) < wantMap.get(key)) {
            return false;
        }
    }
        return true;
    }
}
    


