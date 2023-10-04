import java.util.Arrays;
class Solution {
    public double solution(int[] arr) {
        double sum = Arrays.stream(arr).sum();
        return sum/arr.length;
    }
}