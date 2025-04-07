class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;
        for(int i = 0; i<section.length; i++){
            if(section[i] > last) { //칠해야하 하는 곳이 아직 도달 안했을 경우
                answer++;
                last = section[i] + m -1; //마지막 칠한 위치 갱신
                
            }
        }
        return answer;
    }
}