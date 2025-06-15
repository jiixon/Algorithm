class Solution {
    int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return count;
    }
    
    private void dfs(int[] numbers, int target, int sum, int idx){
        if(idx == numbers.length){
            if(sum == target) count++;
            return;
        } 
        dfs(numbers, target, sum+numbers[idx], idx+1);
        dfs(numbers, target, sum-numbers[idx], idx+1);
    }
    
}