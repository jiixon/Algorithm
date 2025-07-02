import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
        List<List<Integer>> winGraph = new ArrayList<>();
        List<List<Integer>> loseGraph = new ArrayList<>();
        
        for(int i = 0; i<= n; i++){
            winGraph.add(new ArrayList<>());
            loseGraph.add(new ArrayList<>());
        }
        
        for(int[] r : results){
            int a = r[0];
            int b = r[1];
            winGraph.get(a).add(b); //a가 b를 이겼음
            loseGraph.get(b).add(a); //b가 a한테 짐
        }
        
        int answer = 0;
        for(int i = 1; i<=n; i++){
            boolean[] winVisited = new boolean[n+1];
            boolean[] loseVisited = new boolean[n+1];
            
            int winCount = dfs(i, winGraph, winVisited);
            int loseCount = dfs(i, loseGraph, loseVisited);
            
            if(winCount + loseCount == n-1) answer++;
            
        }
        
        return answer;
    }
    
    private int dfs(int node, List<List<Integer>> graph, boolean[] visited){
        visited[node] = true; //방문처리
        
        int count = 0;
        for(int i = 0; i<graph.get(node).size(); i++){
            int next = graph.get(node).get(i);
            if(!visited[next]){
                visited[next] = true;
                count += 1 + dfs(next, graph, visited);
            }
        }
        return count;
    }
}