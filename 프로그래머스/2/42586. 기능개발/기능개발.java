import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        LinkedList<Integer> q = new LinkedList<>();
        for(int i = 0; i<progresses.length; i++) {
            int remainder = 0;
            if((100 - progresses[i])%speeds[i]!=0) remainder = 1;
            q.offer((100 - progresses[i])/speeds[i] + remainder);
        }
        
        while(!q.isEmpty()) {
            int count = 1;
            int x = q.poll();
            while(!q.isEmpty() && x>=q.peek()){
                q.poll();
                count++;
            }
            answerList.add(count);
        }
        
        int[] answer = new int[answerList.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}