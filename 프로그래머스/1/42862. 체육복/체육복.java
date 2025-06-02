import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] losts = new int[n+1];
        int[] reserves = new int[n+1];
        
        //배열 초기화
        for(int l : lost){
            losts[l] = 1;
        }
        
        for(int r : reserve){
            reserves[r] = 1;
        }
        
        for(int i = 1; i<=n; i++){
            if(losts[i] == 1){
                answer--; //체육복 없는 학생 빼기
                if(reserves[i] == 1){ //여벌있는 학생이 도난 당한 경우
                    losts[i] = 0;
                    reserves[i] = 0;
                    answer++;
                }
            }
        }
        
        for(int i = 1; i<=n; i++){
            if(losts[i] == 1){
                if(i >= 1 && reserves[i-1] == 1 && losts[i-1] == 0) {
                    losts[i] = 0;
                    reserves[i-1] = 0;
                    answer++;
                } else if(i < n && reserves[i+1] == 1 && losts[i+1] == 0){
                    losts[i] = 0;
                    reserves[i+1] = 0;
                    answer++;
                }
            }
        }
        return answer;
    }
}