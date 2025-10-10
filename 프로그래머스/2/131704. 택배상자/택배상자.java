import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int n = order.length;
        Stack<Integer> container = new Stack<>();
        
        int box = 1; //메인 밸트에서 오는 상자(1~n)
        int idx = 0; //현재 실어야하는 order의 인덱스
        while(box<=n){
            if(box == order[idx]) {
                idx++;
                box++;
                answer++; //트럭에 넣음
            }
            //스택에서 꺼낸것이 현재 실어야하는 상자인 경우
            else if(!container.isEmpty() && container.peek() == order[idx]) {
                container.pop();
                idx++;
                answer++;
            }
            else{
                container.push(box); //스택에 넣기
                box++;
            }
        }
        
        //메인벡트 끝나고 남은 스택 처리
        while(!container.isEmpty() && idx<n && container.peek() == order[idx]) {
            container.pop();
            idx++;
            answer++;
        }
        return answer;
    }
}