class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left +1);
        int[] answer = new int[len];
        
        int row;
        int col;
        for(int i = 0; i<len; i++) {
            long idx = left + i;
            row = (int)(idx/n);
            col = (int)(idx%n);
            answer[i] = Math.max(row, col) +1;
        }
        
        return answer;
    }
}