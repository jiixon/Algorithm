import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>(); //num, count
        boolean[] visited = new boolean[y+1]; //방문 체크 배열
        queue.add(new int[]{x, 0}); //큐 초기화
        visited[x] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int num = current[0];
            int count = current[1];
            
            if(num == y) return count;
            
            int[] nexts = {num+n, num*2, num*3};
            for(int next : nexts){
                if(next<=y && !visited[next]){
                    queue.add(new int[]{next, count+1});
                    visited[next] = true;
                }
            }

        }
        
        return -1;
    }
}