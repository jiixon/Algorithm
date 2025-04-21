import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> sumList = new ArrayList<>();
        ArrayList<Integer> primeList = new ArrayList<>();
        boolean[] isPrime = new boolean[3001];
        for(int i = 2; i<=Math.sqrt(3000); i++){
            if(!isPrime[i]){
                for(int j=i*i; j<=3000; j+=i){
                    isPrime[j] = true;
                }
            }
            
        }

        for(int i = 2; i<3001; i++){
            if(!isPrime[i]) primeList.add(i);
        }

        for(int i = 0; i<=nums.length-3; i++){
            for(int j = i+1; j<=nums.length-2; j++){
                for(int k = j+1; k<=nums.length-1; k++){
                    sumList.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
                
        for(int i : sumList) {
            if(primeList.contains(i)){
                answer++;
            }
        }

        return answer;
    }
}