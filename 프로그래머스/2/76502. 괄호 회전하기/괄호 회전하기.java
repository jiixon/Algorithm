import java.util.*;
class Solution {
    public int solution(String s) {
        int answer=0;
        for(int i = 0; i<s.length(); i++) {
            if(isValid(s.substring(i) + s.substring(0,i))){
                answer ++;
            }
        }
        return answer;
    }
    private boolean match(char start, char end) {
        return start == '(' && end == ')' ||
            start == '{' && end == '}' ||
            start == '[' && end == ']';
    }
    
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                else {
                    char p = stack.pop();
                    if(!match(p, s.charAt(i))) {
                        return false;
                    }
                }
                
            }
        }
            
        return stack.isEmpty();
    }
}