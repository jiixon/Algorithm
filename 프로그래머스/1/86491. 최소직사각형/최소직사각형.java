import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        for(int[] array : sizes){
            Arrays.sort(array);
        }
        int w = sizes[0][0];
        int h = sizes[0][1];
        int answer = 0;
        
        for(int[] array : sizes){
            if(w<array[0]) w=array[0];
            if(h<array[1]) h=array[1];
        
        }
        return w*h;
    }
}