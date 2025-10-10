import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int n = order.length;
        Stack<Integer> container = new Stack<>();
        
        int idx = 0; //현재 실어야하는 order의 인덱스
        for(int i = 1; i<=order.length; i++){
            if(i == order[idx]) {
                idx++;
                answer++;
            }
            else {
                container.push(i);
            }
            
            //메인벨트 끝나고 스택 처리
            while(!container.isEmpty() && container.peek() == order[idx]) {
                container.pop();
                idx++;
                answer++;
            }   
        }
        
        return answer;
    }
}