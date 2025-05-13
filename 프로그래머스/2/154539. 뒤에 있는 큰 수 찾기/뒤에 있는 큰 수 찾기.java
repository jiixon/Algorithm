import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(numbers[numbers.length-1]);
        answer[numbers.length-1] = -1;
        
        for(int i = answer.length-2; i>=0; i--){
            int target = numbers[i];
            
            while(!stack.isEmpty() && target>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()) answer[i] = -1;
            else answer[i] = stack.peek();
            
            stack.push(target);        
        }
        return answer;
    }
}