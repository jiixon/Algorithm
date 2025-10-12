class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0); //첫번째 문자 x
        int x_cnt = 0;
        int other_cnt = 0;
        
        for(int i = 0; i<s.length(); i++){
            //다음 문자열이 x와 같은지 다른지 확인 후 카운팅
            if(x == s.charAt(i)) x_cnt++;
            else other_cnt++;
            
            
            //x와 x가 아닌 다른 글자들 나온 횟수 같아지면
            if(x_cnt == other_cnt) {
                System.out.println(i);
                answer++;
                //다음 구간 준비
                if(i+1<s.length()){
                    x = s.charAt(i+1);
                    x_cnt = 0;
                    other_cnt = 0;
                }
            }
            
            //마지막 문자 처리
            if(x_cnt != other_cnt && i+1 == s.length()){
                answer++;
            }
        }
        
        return answer;
    }
}