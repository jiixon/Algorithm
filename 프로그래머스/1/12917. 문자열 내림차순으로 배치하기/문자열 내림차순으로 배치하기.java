import java.util.*;
class Solution {
    public String solution(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder(new String(array));
        return sb.reverse().toString();
    }
}