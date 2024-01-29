import java.util.*;
class Solution {
    public long solution(long n) {
        String[] list = Long.toString(n).split(""); 
        Arrays.sort(list, Collections.reverseOrder()); 
        
        StringBuilder sb = new StringBuilder();
        for(String i : list) sb.append(i);
        
        return Long.parseLong(sb.toString());
         
    }
}