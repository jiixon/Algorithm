
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static boolean visited[];
    public static int cnt = -1;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void bfs(int start){
        LinkedList<Integer> queue = new LinkedList<>();

        //현재 노드 방문처리
        queue.offer(start);
        visited[start] = true;

        //큐 빌때까지 반복
        while (!queue.isEmpty()){
            int x = queue.poll();
            cnt++;
            for(int i = 0; i<graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        visited = new boolean[t+1];

        //그래프 초기화
        for(int i =0; i<t+1; i++){
            graph.add(new ArrayList<>());
        }

        //입력값 인접 노드 데이터 저장
        for(int i = 0; i<c; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        bfs(1);
        System.out.println(cnt);

    }
}
