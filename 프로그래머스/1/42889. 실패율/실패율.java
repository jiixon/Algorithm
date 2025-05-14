import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N+2]; 
        double[] fail = new double[N+2];

        for(int i = 0; i<stages.length; i++) {
            count[stages[i]]++;
        }
        int remain = stages.length;
        for(int i = 1; i<N+1; i++){
            if(remain - count[i-1] == 0) fail[i] = 0;
            else {
                fail[i] = (double)count[i]/(remain - count[i-1]);
                remain -= count[i-1];
            }
        }

        List<Integer> indices = new ArrayList<>();
        for(int i = 1; i<=N; i++){
            indices.add(i);
        }

        indices.sort((a,b) -> {
            if(Double.compare(fail[b],fail[a]) != 0) {
                return Double.compare(fail[b],fail[a]); //실패율 내림차순
            } else {
                return Integer.compare(a,b); //인덱스 오름차순
            }
        });

        for(int i = 0; i<indices.size(); i++){
            answer[i] = indices.get(i);
        }

        return answer;
    }
}