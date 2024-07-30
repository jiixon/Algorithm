import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<Integer>();
        int len = elements.length;
        int[] arr = new int[len*2];
        int value = 0; 
        for(int i = 0; i<len; i++){
            arr[i] = elements[i];
            arr[i+len] = elements[i];
        }
        for(int length = 1; length<=len; length++){
            for(int start = 0; start<len; start++){
                int sum = 0;
                for(int i = start; i< start+length; i++){
                    sum+=arr[i];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}