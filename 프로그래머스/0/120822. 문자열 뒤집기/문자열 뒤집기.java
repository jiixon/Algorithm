class Solution {
    public String solution(String my_string) {
        String[] list = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
        }
        return sb.reverse().toString();
    }
}