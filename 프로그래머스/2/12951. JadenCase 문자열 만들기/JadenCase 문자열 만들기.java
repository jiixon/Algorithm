import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sList = s.split(" ",-1);
        
        for(int i=0; i<sList.length; i++){
            for(int j=0; j<sList[i].length(); j++){
                if(j==0) sb.append(Character.toUpperCase(sList[i].charAt(j)));
                else sb.append(Character.toLowerCase(sList[i].charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(s.length());
        
        return sb.toString();
    }
}