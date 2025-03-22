class Solution {
    public String solution(int a, int b) {
        String answer;
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = b;
        for(int i = 0; i<a-1; i++){
            b += days[i+1];
        }
        answer = week[(b-1)%7];
        return answer;
    }
}