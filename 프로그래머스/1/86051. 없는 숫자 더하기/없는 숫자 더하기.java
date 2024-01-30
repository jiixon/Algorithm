import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for(int i : numbers){
            sum+=i;
        }
        return 45 - sum;
    }
}