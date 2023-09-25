class Solution {
    public int solution(String str1, String str2) {
        int str2Len = str2.length();
        for(int i=0; i<str1.length()-str2Len+1; i++){
            String str3 =str1.substring(i,i+str2Len);
            if(str3.equals(str2)){
                return 1;
            }
        }
        return 2;
    }
}