import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> pocket = new HashMap<>();
        int num = nums.length/2;
        for(int i = 0; i<nums.length; i++){
            pocket.put(nums[i],pocket.getOrDefault(nums[i],0)+1);
        }
        if(pocket.size() >= num) {
            return num;
        }else {
            return pocket.size();
        }
    }
}