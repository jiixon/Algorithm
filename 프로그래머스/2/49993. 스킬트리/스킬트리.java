import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String skill_tree : skill_trees){
            String filtered = "";
            for(char c : skill_tree.toCharArray()){
                if(skill.indexOf(c) != -1) filtered += c; //skill에 있는 문자들만 필터링
            }
            
            if(skill.startsWith(filtered)) answer++; //해당 문자열로 시작하면 가능
        }
        return answer;
    }
}