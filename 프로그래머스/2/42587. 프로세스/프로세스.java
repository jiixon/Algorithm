import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<priorities.length; i++){
            q.offer(new int[]{i, priorities[i]});
            pq.offer(priorities[i]);
        }
        int count = 0; //실행순서
        while(!q.isEmpty()){
            int[] current = q.poll();
            if(pq.peek() == current[1]){
                pq.poll();
                count++;
                
                if(current[0] == location) return count;
            }else{
                q.offer(current);
            }
        }
        return -1;
        
    }
}