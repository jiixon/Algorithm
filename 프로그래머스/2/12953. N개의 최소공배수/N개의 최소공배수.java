import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int result = lcm(arr[0], arr[1]);
        for(int i = 2; i<arr.length; i++){
            result = lcm(result, arr[i]);
        }
        return result;
        
    }
    private int lcm(int a, int b) {
        return a*b /gcd(a,b);
    }
    
    private int gcd (int a, int b) {
        int bn = Math.max(a,b);
        int sn = Math.min(a,b);
        int r = bn % sn;
        if(r == 0) return sn;
        else {
            return gcd(sn, r);
        }
    }
}