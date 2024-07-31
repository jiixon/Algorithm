import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayList<String> car1 = new ArrayList<>(Arrays.asList(cards1));      
        ArrayList<String> car2 = new ArrayList<>(Arrays.asList(cards2));
        
        for(String str: goal){
            if(!car1.isEmpty() && str.equals(car1.get(0))){
                car1.remove(car1.get(0));
            }
            else if(!car2.isEmpty() && str.equals(car2.get(0))){
                car2.remove(car2.get(0));
            }
            else{
                return "No";
            }
        }
        return "Yes";
        
    }
}