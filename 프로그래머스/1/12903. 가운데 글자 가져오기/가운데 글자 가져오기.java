class Solution {
    public String solution(String s) {
        int i = s.length()/2;
        if(s.length()%2==0){
            return s.charAt(i-1)+""+s.charAt(i)+"";
        }else {
            System.out.println(i);
            return s.charAt(i)+"";
        }
    }
}