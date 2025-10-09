import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int match = 0;
        int[] rank = {6,6,5,4,3,2,1};
        Set<Integer> win = new HashSet<>();
        for(int w : win_nums) win.add(w); //당첨 번호 set에 저장
        
        for(int l : lottos) {
            if(win.contains(l)) match++;
            else if(l == 0) zero++;
        }
        
        answer[0] = rank[match + zero];
        answer[1] = rank[match];
        return answer;
    }
}