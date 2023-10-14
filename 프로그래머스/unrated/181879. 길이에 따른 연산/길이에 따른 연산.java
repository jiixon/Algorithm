import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >=11){
            return Arrays.stream(num_list).sum();
        }else{
            int gob = 1;
            for(int i=0; i<num_list.length; i++){
                gob*=num_list[i];
            }
            return gob;
        }
    }
}