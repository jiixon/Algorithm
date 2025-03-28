import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int[] leftCount = new int[10001];
        int[] rightCount = new int[10001];
        
        for(int i = 0; i<topping.length; i++){
            rightCount[topping[i]]++;
        }
        
        int leftUnique = 0, rightUnique = uniqueCount(rightCount);
        
        for(int i = 0;i<topping.length; i++){
            if (leftCount[topping[i]] == 0) leftUnique++;
            leftCount[topping[i]]++;
            rightCount[topping[i]]--;
            if (rightCount[topping[i]] == 0) rightUnique--;
            if(leftUnique == rightUnique) answer++;
        }
        
        return answer;
    }
    private int uniqueCount(int[] count){
        int kinds = 0;
        for(int i = 0; i<count.length; i++){
            if(count[i]>0) kinds++;
        }
        return kinds;
    }
}