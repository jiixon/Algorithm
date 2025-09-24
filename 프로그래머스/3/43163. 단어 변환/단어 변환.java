import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<Word> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>(); //방문한 단어 체크
        
        //시작점
        queue.add(new Word(begin, 0));
        visited.add(begin);
        
        while(!queue.isEmpty()){
            Word current = queue.poll();
            
            if(current.word.equals(target)) { //현재 꺼낸 단어가 target이라면
                return current.step; //step 반환
            }
            
            for(String s : words){
                if(!visited.contains(s) && canChange(current.word, s)){ //방문안한 단어 && 한글자만 다른 단어
                    visited.add(current.word); //방문처리
                    queue.add(new Word(s, current.step + 1)); //word는 s를, step은 +1 추가해서 넣기
                }
            }
            
        }
        return 0; //변환할 수 없는 경우
    }
    
    private boolean canChange(String str1, String str2){
        int dif = 0; //다른 글자 수
        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)) dif++;
            if(dif>1) return false; //다른 글자수 2개이상이면 false
        }
        return true;
    }
    
    
}
class Word {
    String word; //단어
    int step; //단계
    Word(String word, int step) {
        this.word = word;
        this.step = step;
    }
}