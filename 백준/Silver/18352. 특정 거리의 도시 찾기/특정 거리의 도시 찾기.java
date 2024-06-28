import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static int[] distance;
    public static ArrayList<ArrayList<Integer>> graph;

    public static void bfs(int start) {
        LinkedList<Integer> queue = new LinkedList<>();

        //시작점 큐에 넣기
        queue.offer(start);
        distance[start] = 0;

        while (!queue.isEmpty()) {
            Integer curNode = queue.poll();

            //인접노드 확인
            for (int i = 0; i < graph.get(curNode).size(); i++) {
                Integer nxtNode = graph.get(curNode).get(i);
                if (distance[nxtNode] == -1){
                    distance[nxtNode] = distance[curNode]+1; //간선 모두 1이므로 최단거리 갱신
                    queue.offer(nxtNode);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //도시 갯수
        int m = Integer.parseInt(st.nextToken()); //도로 갯수
        int k = Integer.parseInt(st.nextToken()); //거리정보(도달해야하는 거리)
        int x = Integer.parseInt(st.nextToken()); //출발 도시

        graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        distance = new int[n + 1];
        Arrays.fill(distance, -1); //최단거리 배열 모두 -1로 초기화

        bfs(x);
        
        boolean found = false;
        for(int i =1; i<n+1; i++){
            if(distance[i] == k){
                System.out.println(i);
                found = true;
            }
        }

        if(!found) System.out.println(-1);
    }
}
