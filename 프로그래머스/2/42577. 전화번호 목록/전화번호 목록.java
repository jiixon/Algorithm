import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        Arrays.sort(phone_book);
        for(int i = 0; i<phone_book.length-1; i++){
            if(!set.contains(phone_book[i])){
                if(phone_book[i+1].startsWith(phone_book[i])) return false;
            
                set.add(phone_book[i]);
            }
        }
        return true;
    }
}