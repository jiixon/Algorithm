import java.util.*;
class Solution {
    
    public String binaryStr(int num ,int n){
        StringBuilder sb = new StringBuilder();
        String s = Integer.toBinaryString(num);
        int len = s.length();
        for (int i = 0; i < n - len; i++) {
            sb.append("0");
        }
        sb.append(s);
        return sb.toString();
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        StringBuilder re = new StringBuilder();
        
        for(int i = 0; i<arr1.length; i++){
            re.setLength(0);
            char[] arry1 = binaryStr(arr1[i],n).toCharArray();
            char[] arry2 = binaryStr(arr2[i],n).toCharArray();
            
            for(int j=0; j<arr1.length; j++){
                if(arry1[j]=='0' && arry2[j]=='0') re.append(" ");
                else re.append("#");
            }
            answer[i]=re.toString();
        }

        return answer;
    }
}