import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){   
            int startInx = commands[i][0]-1;
            int endInx = commands[i][1]-1;
            int kInx = commands[i][2];
            
            int[] tmp = new int[endInx - startInx +1];
            
            for(int j=startInx, idx = 0; j<=endInx; j++, idx++){
                tmp[idx]=array[j]; 
            }
            Arrays.sort(tmp);
            answer[i]=tmp[kInx-1];
        }
        return answer;
    }
}