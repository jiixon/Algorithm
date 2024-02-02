import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] result = new int[2];
        int[] nums = {n,m};
        Arrays.sort(nums);
        int x=nums[0];
        int y=nums[1];
        
        int max = 0;
        for(int i=1; i<x+1; i++){
            if(y%i==0 && x%i==0) max = i;    
        }
    
        result[0]=max;
        result[1]=x*y/max;
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(nums));

        return result;
    }
}