import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for(int i : d){
            budget-=i;
            count++;
            if(budget<0) {
                count-=1;
                break;
            }else if(budget == 0) break;
        }
        return count;
        
    }
}