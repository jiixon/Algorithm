class Solution {
    boolean solution(String s) {
        int sum1=0, sum2=0;
        String[] str = s.split("");
        for(int i=0; i<str.length; i++){
            if(str[i].equals("p") || str[i].equals("P")){
                sum1+=1;
            }else if(str[i].equals("y") || str[i].equals("Y")){
                sum2+=1;
            }
        }
        if(sum1==sum2) {
            return true;
        } else {
            return false;
        }
    }
}