import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        String nStr1 = str1.toUpperCase();
        String nStr2 = str2.toUpperCase();
        
        System.out.println(nStr1);
        System.out.println(nStr2);
        
        List<String> list1 = createSet(nStr1);
        List<String> list2 = createSet(nStr2);
        
        List<String> intersection = new ArrayList<>();
        
        System.out.println(list1);
        System.out.println(list2);
        
        if(list1.size() == 0 && list2.size() == 0){
            return 65536;
        }
        
        for(String s : list1){
            if(list2.contains(s)){
                intersection.add(s);
                list2.remove(s);
            }
        }
        
        double answer = (double)intersection.size()/(list1.size()+list2.size());
        return (int) (answer*65536);
    }
    
    private List<String> createSet(String str){
        List<String> arr = new ArrayList<>();
        for(int i = 0; i<str.length()-1; i++){
            if(Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(i+1))){
                String s = "" + str.charAt(i) + str.charAt(i+1);
                arr.add(s);
            }
            
        }
        return arr;
    }
}