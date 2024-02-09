import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(array));
        for(char c :  array){
            if(c==' ') sb.append(" ");
            else{
                int i = (int)c;
                System.out.println(i);
                System.out.println(i+n);
                if(i+n>122) {
                    i-=26;
                    System.out.println(i+n);
                }
                else if(i+n>90 && i<=90) i-=26;
                sb.append((char)(i+n));
                    
                
            }
            
        }
        return sb.toString();
    }
}