class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pSize = p.length();
        long pLong = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-pSize; i++){
            String tmp = t.substring(i,i+pSize);
            if(Long.parseLong(tmp) <= pLong) answer++;
        }
        
        return answer;
    }
}