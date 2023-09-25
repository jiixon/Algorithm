class Solution {
    public int solution(int n, int k) {
        int service = (int)n/10;
        return n*12000+2000*(k-service);
    }
}