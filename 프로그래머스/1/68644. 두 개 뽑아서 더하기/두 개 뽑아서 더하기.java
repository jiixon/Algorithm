import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer.add(numbers[i]+numbers[j]);
            }
        }
        answer = answer.stream().distinct().collect(Collectors.toCollection(ArrayList::new));

        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}