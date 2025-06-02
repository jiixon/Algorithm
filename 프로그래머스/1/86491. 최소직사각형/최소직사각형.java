import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        for(int[] arr : sizes){
            Arrays.sort(arr);
        }
        int w = sizes[0][0];
        int h = sizes[0][1];
        for(int[] arr : sizes){
            if(w<arr[0]) w = arr[0];
            if(h<arr[1]) h = arr[1];
        }
        return w*h;
    }
}