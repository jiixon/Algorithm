import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int[] arr = new int[goal.length];
        for(int i = 0; i<goal.length; i++){
            for(int j = 0; j<cards1.length; j++){
                if(cards1[j].equals(goal[i])) arr[i] = j;
            }
            for(int j = 0; j<cards2.length; j++){
                if(cards2[j].equals(goal[i])) arr[i] = j;
            }
           
        }
        boolean check = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i+1]-1) check = false;

        }

        if(check) return "Yes";
        else return "No";
    }
}