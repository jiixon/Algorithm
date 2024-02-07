import java.util.*;
class Solution {
    boolean solution(String s) {
        char[] array = s.toCharArray();
        int count = 0;
        for(char c : array ){
            count += c=='('? 1 : -1;
            if(count<0) return false;
        }
        if(count == 0) return true;
        else return false;
    }
}