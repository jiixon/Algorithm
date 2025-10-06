import java.util.*;
class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i = 0; i<5; i++){ //전체 대기실
            boolean ok = true;
            
            for(int j = 0; j<5; j++){
                for(int k = 0; k<5; k++){
                    if(places[i][j].charAt(k) == 'P'){
                        if(!bfs(places[i], j, k)) { //(j,k) -> P좌표 전달, true면 거리두기 지킴
                            ok = false;
                            break;
                        } 
                    }
                }
                if(!ok) break; //이미 위에서 위반했으면 탈출
            }
            answer[i] = ok ? 1 : 0;
        }
        return answer;
    }
    
    private boolean bfs(String[] place, int startX, int startY){
        Queue<int[]> queue = new LinkedList<>(); //x, y, distance
        boolean[][] visited = new boolean[5][5];
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            int dist = current[2];
            
            for(int i = 0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                int ndist = dist + 1;
                
                if(nx>=0 && nx<5 && ny>=0 && ny<5 && !visited[nx][ny]){
                    //P이고 거리두기 2이하면 거리두기 위반
                    if(place[nx].charAt(ny) == 'P' && ndist <= 2) { 
                        return false;
                    }
                    
                    //O이면 큐에 넣고 계속 진행
                    if(place[nx].charAt(ny) == 'O') {
                        queue.add(new int[]{nx, ny, ndist});
                        visited[nx][ny] = true;
                    }
                }
            }   
        }
        
        return true;
    }
}