import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothMap = new HashMap<>();
        int result = 1;
        for(int i = 0; i<clothes.length; i++) {
            String type = clothes[i][1];
            clothMap.put(type, clothMap.getOrDefault(type, 0) + 1);
        }
        
        for(int i : clothMap.values()){
            result *= (i+1);
        }
        return result-1;
    }
}