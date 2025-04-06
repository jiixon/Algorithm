import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        if(score.length < m) {
            return 0;
        }
        
        Arrays.sort(score); //오름차순
        
        //내림차순
        int start = 0;
        int end = score.length -1;
        while(start < end) {
            int tmp = score[start];
            score[start] = score[end];
            score[end] = tmp;
            start++;
            end--;
        }
        
        //int[] -> ArrayList
        ArrayList<Integer> sList = new ArrayList<>();
        for(int num : score){
            sList.add(num);
        }
        
        if(sList.size()%m != 0) {
            for(int i = 0; i<sList.size()%m; i++){
                sList.remove(sList.size()-i-1);
            }
        }
        
        int lastIndex = (sList.size() / m) * m;
        for(int i = m-1; i<lastIndex; i+=m){
            
            answer += sList.get(i)*m;
        }
       
        return answer;
    }
}