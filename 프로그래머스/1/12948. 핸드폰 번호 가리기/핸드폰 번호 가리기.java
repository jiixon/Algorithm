import java.util.ArrayList;
class Solution {
    public String solution(String phone_number) {
        ArrayList<String> an = new ArrayList<String>();
        int len = phone_number.length();
        for(int i=0; i<len-4; i++){
            an.add("*");
        }
        for(int i=len-4; i<len; i++){
            an.add(String.valueOf(phone_number.charAt(i)));
        }
        
        
        String answer = String.join("",an);
        return answer;
    }
}