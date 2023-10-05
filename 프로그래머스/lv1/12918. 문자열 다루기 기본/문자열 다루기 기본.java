class Solution {
    public boolean solution(String s) {
        int len = s.length();
        boolean isNumeric = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isNumeric = false;
            }
        }
        if(isNumeric && (len ==4||len==6)){
            return true;
        }else{
            return false;
        }   
    }
}