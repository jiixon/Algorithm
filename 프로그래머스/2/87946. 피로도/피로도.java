import java.util.*;
class Solution {
    static int maxCount;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        maxCount = 0;
        dfs(k, visited, dungeons, maxCount);
        return maxCount;
    }
    
    public void dfs(int k, boolean[] visited, int[][] dungeons, int count){
        maxCount = Math.max(count, maxCount);
        for(int i = 0; i<dungeons.length; i++){
            if(!visited[i]&& dungeons[i][0] <= k){
                visited[i] = true;
                dfs(k - dungeons[i][1], visited, dungeons, count+1);
                visited[i] = false;
            }
        }
    }
}