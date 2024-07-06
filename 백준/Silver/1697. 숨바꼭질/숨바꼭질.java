import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //수빈이 위치
        int k = Integer.parseInt(st.nextToken()); //동생 위치


        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        int[] distance = new int[100001];

        queue.offer(n);
        visited[n] = true;
        
        if (n == k) {
            System.out.println(0);
            return;
        }

        while (!queue.isEmpty()){
            Integer current = queue.poll();
            
            int[] nxtNode = {current*2, current -1, current+1 };
            for(int next : nxtNode){
                if(next >= 0 && next <= 100000 && !visited[next]){
                    queue.offer(next);
                    visited[next] = true;
                    distance[next] = distance[current] +1;
                }
                //원하는 위치 도달
                if(next == k){
                    System.out.println(distance[next]);
                    return;
                }

            }
        }

    }
}
