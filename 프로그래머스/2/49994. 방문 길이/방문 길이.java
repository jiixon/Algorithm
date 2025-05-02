import java.util.*;
class Solution {
    public int solution(String dirs) {        
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;
        char[] charArray = dirs.toCharArray();
        for(char c : charArray){
            int nx = x, ny = y;
            switch (c) {
                case 'U': ny+=1; break;
                case 'D': ny-=1; break;
                case 'R': nx+=1; break;
                case 'L': nx-=1; break;
            }
            if(nx < -5 || nx > 5 || ny < -5 || ny > 5) continue; //범위 넘어가지 않도록
            
            //움직인 방향, 경로 모두 저장
            String before = x + "," + y;
            String after = nx + "," + ny;
            
            //min -> max로만 저장
            String path = before.compareTo(after) < 0 ? before + "->" + after : after + "->" + before;
            set.add(path);

            //x, y 초기화
            x = nx;
            y = ny;
        }
        return set.size();
    }
}