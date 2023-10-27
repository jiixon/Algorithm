import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       ArrayList<Integer> newList = new ArrayList<Integer>();

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                newList.add(arr[i]);
            }
        }
        newList.add(arr[arr.length-1]);

        return newList.stream().mapToInt(Integer::intValue).toArray();
    }
}