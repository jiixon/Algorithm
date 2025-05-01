import java.util.*;
class Solution {
    public List<String> words = new ArrayList<>();
    public String[] str = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        dfs("", 0);
        return words.indexOf(word)+1;
    }
    
    private void dfs(String current, int depth){
        if(depth > 5) return;
        if(!current.equals("")){
            //빈 문자열이 아닐 경우 모두 저장
            words.add(current);  
            }
        for(int i = 0; i<5; i++){
            dfs(current + str[i], depth +1);
        }
    }
}