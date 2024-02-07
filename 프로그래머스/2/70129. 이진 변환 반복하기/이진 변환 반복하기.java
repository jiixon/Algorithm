import java.util.*;
import java.lang.*;
class Solution {
    static int[] result = new int[2];
    
    public int[] solution(String s) {
        result[0] = 0;
        result[1] = 0;
        
        binary(s);
        
        return result;
    }
    static String binary(String s){
        if(s.equals("1")) return "1";
        char[] array = s.toCharArray();
    
        int zero = 0;
        for(char c : array){
            if (c=='0') zero+=1;
        }
        int sLen = s.length() - zero;
        String str = Integer.toBinaryString(sLen);
    
        result[0]+=1;
        result[1]+=zero;

        return binary(str);
    }
}
