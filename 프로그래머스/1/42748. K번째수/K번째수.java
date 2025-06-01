import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            
            int start = commands[i][0];
            int end = commands[i][1];
            int point = commands[i][2];
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = start-1; j<=end-1; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            result[i] = list.get(point-1);
        }
        
        return result;
    }
}