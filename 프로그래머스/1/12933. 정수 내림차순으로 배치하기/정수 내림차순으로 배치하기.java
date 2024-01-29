import java.util.*;
class Solution {
    public long solution(long n) {
        String s = Long.toString(n);
        Integer[] result = new Integer[s.length()];
        for(int i = 0; i<s.length(); i++){
            result[i] = s.charAt(i)-'0';
        }
        Arrays.sort(result, Collections.reverseOrder());
        String answer = "";
        for(int i : result){
            answer+=Integer.toString(i);
        }
        return Long.parseLong(answer);
    }
}