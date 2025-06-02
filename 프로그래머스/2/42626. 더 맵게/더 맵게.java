import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.add(i);
        }
        while(pq.size() >=2 && pq.peek()<K){
            Integer first = pq.poll();
            Integer second = pq.poll();
            pq.add(first + (second *2));
            answer++;
        }
        if(pq.peek() <K) return -1;
        
        return answer;
    }
}