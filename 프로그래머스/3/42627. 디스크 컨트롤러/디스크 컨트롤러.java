import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> a[1]-b[1] //a[0]=요청시간, a[1]=소요시간, 소요시간 기준 오름차순
        );
        
        Arrays.sort(jobs, (a,b) -> a[0]-b[0]); //요청시간 기준 오름차순
        
        int currentTime = 0; //현재 시간
        int idx = 0; //pq에 넣을 작업 인덱스
        while(idx<jobs.length || !pq.isEmpty()){
            
            while(idx<jobs.length && jobs[idx][0] <= currentTime) {
                pq.add(jobs[idx]); //해당 작업 큐에 추가
                idx++;
            }
            
            if(!pq.isEmpty()){
                int[] job = pq.poll();
                currentTime += job[1]; //현재시간 갱신
                answer+= currentTime - job[0]; //반환시간 계산
            } else {
                currentTime = jobs[idx][0]; //도착 안한 작업있으면 점프
            }
            
        }
        
        int result = answer/jobs.length;
        return result;
    }
}