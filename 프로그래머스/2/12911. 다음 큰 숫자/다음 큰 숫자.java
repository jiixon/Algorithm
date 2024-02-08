class Solution {
    public int solution(int n) {
        int answer = 0;
        int count1 = 0;
        String str = Integer.toBinaryString(n);
        char[] array = str.toCharArray();
        for(char c : array){
            if(c == '1') count1++;
        }
        
        for(int i=n+1; i<=1000000; i++){
            int count2 = 0;

            String s2 = Integer.toBinaryString(i);
            char[] array2 = s2.toCharArray();
            for(char c : array2){
                if(c == '1') count2++;
            }
            if(count1==count2){
                answer=i;
                break;
            } 
            
        }
        return answer;
    }
}