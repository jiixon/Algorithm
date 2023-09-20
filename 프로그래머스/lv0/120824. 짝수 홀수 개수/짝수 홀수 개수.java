class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        int odd=0, even=0;
        for (int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                odd+=1;
            }else{
                even+=1;
            }
        }
        result[0]=odd;
        result[1]=even;
        return result;
    }
}