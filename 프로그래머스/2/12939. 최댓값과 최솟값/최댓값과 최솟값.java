import java.util.*;

class Solution {
    public String solution(String s) {
        String[] stringArray = s.split(" ");
        Arrays.sort(stringArray, (a,b)-> Integer.compare(Integer.parseInt(a),Integer.parseInt(b)));
        String result = stringArray[0]+ " "+ stringArray[stringArray.length-1];
        return  result;
    }
}