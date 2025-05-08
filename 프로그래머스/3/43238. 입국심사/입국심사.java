import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = 0;
        long left = 1;
        long right = (long)times[times.length-1]*n; //최장시간
        long mid;
        while (left <= right) {
            mid = (left + right)/2; //중간값
            
            long sum = 0; //중간값동안 탐색할 수 있는 총시간
            for(int time : times){
                sum += mid / time;
            }
            
            if(sum >= n){
                answer = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
            
        }
        return answer;
    }
}