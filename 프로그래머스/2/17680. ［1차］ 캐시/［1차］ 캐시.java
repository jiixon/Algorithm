import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;
        LinkedList<String> q = new LinkedList<>();
        for(int i = 0; i<cities.length; i++){
            String city = cities[i].toUpperCase();
            
            if(q.contains(city)) {
                time += 1;
                q.remove(city);
                q.offer(city);
            }else {
                if(q.size()==cacheSize) {
                    q.poll();
                }
                if(cacheSize != 0) {
                    q.offer(city);
                }
                time += 5;
            }
        }
        return time;
    }
}