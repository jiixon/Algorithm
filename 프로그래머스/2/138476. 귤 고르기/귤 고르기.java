import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        Arrays.sort(tangerine);
        int before = tangerine[0];
        int cnt = 1;
        for(int i = 1; i<tangerine.length; i++){
            if(before == tangerine[i]){
                cnt++;
                
            }else{
                pq.offer(cnt);
                cnt = 1;
                before = tangerine[i];
            }
        }
        pq.offer(cnt);
        
        int kinds = 0;
        while(k>0){
            int n = pq.poll();
            k-=n;
            kinds++;
        }
        return kinds;
    }
}