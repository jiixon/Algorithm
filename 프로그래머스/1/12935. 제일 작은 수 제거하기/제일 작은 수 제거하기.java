import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            return new int[]{-1};
        }
        answer = new int[arr.length-1];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]) min = arr[i];
        }
        int i=0;
        for(int num : arr){
            if(num==min) continue;
            answer[i++]=num;
        }
        return answer;
    }

}