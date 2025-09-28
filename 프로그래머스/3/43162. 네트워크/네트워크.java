class Solution {
    public int solution(int n, int[][] computers) {
        int count = 0;
        boolean[] visited = new boolean[n]; //방문노드 확인배열
        for(int i = 0; i<n; i++){
            if(visited[i] == false){
                dfs(i, computers, visited);
                count++;
            }
            
        }
        return count;
    }
    
    private void dfs(int node, int[][] computers, boolean[] visited) {
        visited[node] = true; //방문처리
        for(int i = 0; i<computers.length; i++){
            if(computers[node][i] == 1 && node!=i && !visited[i]){
                dfs(i, computers, visited);
            }
        }
    }
}