import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder words = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        int k = 0;
        while(words.length() < t*m){
            String str = Integer.toString(k, n);//n진수 변환
            words.append(str.toUpperCase()); //대문자 변환
            k++;
        }
        
        for(int i = p-1; i<t*m; i+=m){
            result.append(words.charAt(i));
        }
        
        return result.toString();
    }
}