import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
//DFS 방식
//         List<List<Integer>> winGraph = new ArrayList<>();
//         List<List<Integer>> loseGraph = new ArrayList<>();
        
//         for(int i = 0; i<= n; i++){
//             winGraph.add(new ArrayList<>());
//             loseGraph.add(new ArrayList<>());
//         }
        
//         for(int[] r : results){
//             int a = r[0];
//             int b = r[1];
//             winGraph.get(a).add(b); //a가 b를 이겼음
//             loseGraph.get(b).add(a); //b가 a한테 짐
//         }
        
//         int answer = 0;
//         for(int i = 1; i<=n; i++){
//             boolean[] winVisited = new boolean[n+1];
//             boolean[] loseVisited = new boolean[n+1];
            
//             int winCount = dfs(i, winGraph, winVisited);
//             int loseCount = dfs(i, loseGraph, loseVisited);
            
//             if(winCount + loseCount == n-1) answer++;
//         }
//         return answer;
        
//플로이드-워셜
        boolean[][] graph = new boolean[n+1][n+1];
        for(int[] r : results){
            int a = r[0];
            int b = r[1];
            graph[a][b] = true; //a가 b를 이김 -> true
            
        }
        
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(graph[i][k] && graph[k][j]){ //i가 k를 이김 + k가 j를 이김
                        graph[i][j] = true; //i가 j를 이김 추가
                    }
                }
            }
        }
        
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int win = 0;
            int lose = 0;
            
            for(int j = 1; j <= n; j++){
                if(i==j) continue; //자신 무시
                
                if(graph[i][j]) win++; //내가 이긴 횟수
                if(graph[j][i]) lose++; //내가 진 횟수
            }
            if(win + lose == n-1) answer++;
            
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