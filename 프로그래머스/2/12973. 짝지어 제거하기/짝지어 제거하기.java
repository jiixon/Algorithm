import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        String[] array = s.split("");
        
        for(String str : array){
            if(!stack.empty() && stack.peek().equals(str)){
                stack.pop();
            }
            else{
                stack.push(str);
            }
        }
        return stack.empty() ? 1:0;
    }
}