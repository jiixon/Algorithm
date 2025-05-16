import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxQue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQue = new PriorityQueue<>();
        
        for(int i = 0; i<operations.length; i++){
            if(operations[i].charAt(0) == 'I') {
                int num = Integer.parseInt(operations[i].substring(2));
                maxQue.offer(num);
                minQue.offer(num);
            }
            
            if(operations[i].equals("D 1") && !maxQue.isEmpty()){
                Integer max = maxQue.poll();
                minQue.remove(max);
            }
            
            if(operations[i].equals("D -1") && !minQue.isEmpty()){
                Integer min = minQue.poll();
                maxQue.remove(min);
            }
        }
        
        if(maxQue.isEmpty() && minQue.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        }else {
            Integer max = maxQue.poll();
            Integer min = minQue.poll();
            answer[0] = max;
            answer[1] = min;
        }
        
        
        return answer;
    }
}