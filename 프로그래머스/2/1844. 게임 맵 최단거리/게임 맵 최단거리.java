import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int count = 0;
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        //큐 초기화
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            for(int i = 0; i<4; i++){
                int x = cx + dx[i];
                int y = cy + dy[i];
                
                if(x>=0 && y>=0 && x<n && y<m && !visited[x][y] && maps[x][y] == 1){
                    queue.add(new int[]{x, y});
                    visited[x][y] = true;
                    dist[x][y] = dist[cx][cy] + 1;
                }
            }
        }
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
    
}