import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> nums = new HashSet<>();
        dfs("", numbers, nums); //"", "17"
        
        for(int i : nums) {
            if(isPrime(i)) answer++;
        }
            
        return answer;
    }
    
    private void dfs(String path, String remaining, Set<Integer> nums) {
        //path 비어있지 않으면 set에 저장
        if(path != "") nums.add(Integer.parseInt(path));
        
        for(int i = 0; i<remaining.length(); i++){
            char current = remaining.charAt(i); //"1"
            String newPath = path + current; //"1"
            //remaini에서 i번째만 제외하고 만든 글자 "7"
            String newRemain = remaining.substring(0, i) + remaining.substring(i+1);
            dfs(newPath, newRemain, nums); //"1", "7"
            
        }
    }
    
    private boolean isPrime(int number){
        if(number == 0 || number == 1) return false;
        for(int i = 2; i*i<=number; i++){
            if(number %i == 0) return false;
        }
        return true;
    }
    
}