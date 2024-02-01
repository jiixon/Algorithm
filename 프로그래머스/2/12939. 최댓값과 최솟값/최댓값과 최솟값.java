import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArray = s.split(" ");
        int[] intArray = new int[strArray.length];
        int i=0;
        for(String str : strArray){
            intArray[i] = Integer.parseInt(str);
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.stream(intArray).min().getAsInt());
        sb.append(" ");
        sb.append(Arrays.stream(intArray).max().getAsInt());
        
        return sb.toString();

    }
}