import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String converted = Integer.toString(n,k);
        String[] clist = converted.split("0");
        for(int i = 0; i<clist.length; i++){
            if(clist[i].equals("")) continue;
            long num = Long.valueOf(clist[i]);
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }
    private boolean isPrime(long num){
        if(num<2) return false;
        for(long i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}