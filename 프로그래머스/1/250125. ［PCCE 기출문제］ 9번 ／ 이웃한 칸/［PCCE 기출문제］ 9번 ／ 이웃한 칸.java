class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for(int i = 0; i<4; i++){
            int x = w + dx[i];
            int y = h + dy[i];
            
            if(x>=0 && x<n && y>=0 && y<n && board[y][x].equals(board[h][w])) answer++;
        }
        
        return answer;
    }
}