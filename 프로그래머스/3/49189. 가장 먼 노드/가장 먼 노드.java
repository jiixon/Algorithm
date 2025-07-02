import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] e : edge){
            int u = e[0];
            int v = e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        int[] distance = new int[n+1];
        LinkedList<Integer> queue = new LinkedList<>();
        distance[1] = 1;
        queue.offer(1);
        
        while(!queue.isEmpty()){
            int current = queue.poll();
            
            for(int i = 0; i<graph.get(current).size(); i++){
                int next = graph.get(current).get(i);
                
                if(distance[next] == 0){
                    distance[next] = distance[current] + 1;
                    queue.offer(next);
                }
            }
        }
        
        int maxDistance = 0;
        for(int d : distance){
            maxDistance = Math.max(d, maxDistance);
        }
        
        int count = 0;
        for(int d : distance){
            if(maxDistance == d) count++;
        }
        
        return count;
    }
}