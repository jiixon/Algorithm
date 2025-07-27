import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        //스택에 아직 값이 안떨어져 있는 것들 저장
        for(int i = 0; i<prices.length; i++){
            //스택이 비어있지 않음 + 현재 가격보다 최상단 가격이 큼 -> 스택에서 제거
            while(!s.isEmpty() && prices[i] < prices[s.peek()]){
                int idx = s.pop();
                answer[idx] = i - idx;
            }
            s.push(i);
        }
        for(Integer i : s){
            answer[i] = prices.length - 1 - i;
        }
        return answer;
    }
}