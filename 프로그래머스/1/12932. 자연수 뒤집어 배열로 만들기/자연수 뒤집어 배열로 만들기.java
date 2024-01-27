class Solution {
    public int[] solution(long n) {
        String s = n + "";
        char[] charArray = s.toCharArray();

        int len = s.length();
        int[] answer = new int[len];
        for(int i = 0; i<len; i++){
            System.out.println(charArray[len-i-1]);
            answer[i] = charArray[len-i-1] - '0';
        } 
        
        return answer;
    }
}