class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<food.length; i++){
            if(food[i]%2!=0){
                food[i]=food[i]-1;
            }
            for(int j=1; j<=food[i]/2; j++){
                    sb.append(i);
            }
        }
        String answer = sb.toString() + "0";
        return answer + sb.reverse();
    }
}