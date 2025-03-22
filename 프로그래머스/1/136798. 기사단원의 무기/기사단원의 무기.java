import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] counts = new int[number];
        for(int i =1; i<=number; i++){
            counts[i-1] = calculate(i);
        }
        
        for(int i = 0; i<counts.length; i++){
            if(counts[i]<=limit) answer+=counts[i];
            else answer += power;
        }
        return answer;
    }
    public int calculate(int number){
        int result = 0;
        for(int i =1; i*i<=number; i++){
                if(number%i == 0) {
                    result += 1;
                    if(i != number/i) result +=1;
                }
            }
            return result;
    }
}