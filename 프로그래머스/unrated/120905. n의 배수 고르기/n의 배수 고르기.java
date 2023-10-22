import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> an = new ArrayList<Integer>();
        for(int i : numlist){
            if(i%n==0){
                an.add(i);
            }
        }
        int[] answer = an.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}