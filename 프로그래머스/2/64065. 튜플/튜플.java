import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(String s) {
        List<List<Integer>> numList = new ArrayList<>();
        String a = s.substring(2, s.length() -2);
        String[] str = a.split("\\},\\{");
        for(int i = 0; i<str.length; i++){
            List<Integer> n = Arrays.stream(str[i].split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            numList.add(n);
            
        }
        numList.sort((list1, list2) -> Integer.compare(list1.size(), list2.size()));
        
        int[] answer = new int[numList.size()];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<numList.size(); i++){
            for(int num : numList.get(i)){
                if(!set.contains(num)){
                    answer[i] = num;
                    set.add(num);
                    break;
                }
            }
        }
        return answer;
    }
}