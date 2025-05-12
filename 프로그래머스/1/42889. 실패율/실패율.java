import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N+2]; 
        double[] fail = new double[N+2];
        
        for(int i = 0; i<stages.length; i++) {
            count[stages[i]]++;
        }
        
        List<Stage> stageList = new ArrayList<>();
        int remain = stages.length;
        for(int i = 1; i<N+1; i++){
            double failure = (double) count[i]/(remain - count[i-1]);
            remain -= count[i-1];
            
            Stage stage = new Stage(i,failure);
            stageList.add(stage);
        }
        
        Collections.sort(stageList, Collections.reverseOrder());
        
        for(int i = 0; i<stageList.size(); i++){
            answer[i] = stageList.get(i).id;
        }
    
        return answer;
    }
}
class Stage implements Comparable<Stage> {
    public int id;
    public double failure;

    public Stage(int id_, double failure_) {
        id = id_;
        failure = failure_;
    }

    @Override
    public int compareTo(Stage o) {
        if (failure < o.failure ) {
              return -1;
        }
        if (failure > o.failure ) {
            return 1;
        }
        return 0;
    }
}