class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(n%3);
            n /=3;
        }
        System.out.println(sb.reverse().toString());
        return Integer.parseInt(sb.reverse().toString(),3);
    }
}