import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ",-1);
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length(); j++){
                if(j%2==0) sb.append(Character.toUpperCase(array[i].charAt(j)));
                else sb.append(Character.toLowerCase(array[i].charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(s.length());
        return sb.toString();
    }
}