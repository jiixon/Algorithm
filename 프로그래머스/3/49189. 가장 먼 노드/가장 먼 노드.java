import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0 ; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        //edge[i] = {u, v}
        for(int[] e : edge){
            int u = e[0];
            int v = e[1];
            //양방향 그래프
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        int[] distance = new int[n+1];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(1);
        distance[1] = 1; //시작 노드
        
        //BFS
        while(!queue.isEmpty()){
            int target = queue.poll();
            
            //target과 인접한 노드 방문처리
            for(int i = 0; i<graph.get(target).size(); i++){
                int next = graph.get(target).get(i);
                //아직 방문하지 않은 노드라면
                if(distance[next] == 0){
                    distance[next] = distance[target] + 1; //거리 갱신
                    queue.offer(next);
                }
            }
            
        }
        
        //가장 먼 거리 찾기
        int maxDistance = 0; 
        for(int d : distance){
            maxDistance = Math.max(maxDistance, d);
        }
        
        //가장 먼 거리의 노드 수 세기
        int count = 0;
        for(int d :distance){
            if(d == maxDistance) count++;
        }
               
        return count;
    }
}