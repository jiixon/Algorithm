
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static boolean visited[];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void bfs(int start){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()){
            int x = queue.poll();
            System.out.printf(x + " ");
            for(int i = 0; i<graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    public static void dfs(int x){
        visited[x] = true;
        System.out.print(x + " ");

        Collections.sort(graph.get(x));


        for(int i = 0; i<graph.get(x).size(); i++){
            int nextV = graph.get(x).get(i);
            if(!visited[nextV]){
                dfs(nextV);

            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //정점의 개수
        int m = Integer.parseInt(st.nextToken()); //간선의 개수
        int v = Integer.parseInt(st.nextToken()); //시작할 정점
        visited = new boolean[n+1];

        //그래프 초기화
        for(int i =0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }

        //입력값 인접 노드 데이터 저장
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);

    }
}
