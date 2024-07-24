class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        while(n>=a&& n>=2){
            int newBottle = (n/a)*b;
            n = (n%a) + newBottle;
            result += newBottle;
        }
        
        return result;
    }
}