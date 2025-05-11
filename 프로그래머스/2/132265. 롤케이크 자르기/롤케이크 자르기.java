import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int[] left = new int[10001];
        int[] right = new int[10001];
        
        int leftCount = 0;
        int rightCount = 0;

        //오른쪽으로 초기화 => rightCount는 총 토핑 종류 수
        for(int i = 0; i<topping.length; i++){
            right[topping[i]]++;
            if(right[topping[i]] == 1) rightCount++;
        }
        
        for(int i = 0; i<topping.length; i++){
            left[topping[i]]++;
            if(left[topping[i]] == 1) leftCount++;
            right[topping[i]]--;
            if(right[topping[i]] == 0) rightCount--;
            
            if(leftCount == rightCount) answer++;
        }
        return answer;
    }
        
       
}