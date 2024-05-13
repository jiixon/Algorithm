import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] array;
    public static boolean[] visited;

    public static void backTracking(int n, int m, int depth){
        if(m == depth){
            for(int i = 0; i<array.length-1; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1 ;i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                array[depth] = i;
                backTracking(n,m,depth+1);

                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        array = new int[m+1];
        visited = new boolean[n+1];

        backTracking(n,m,0); //깊이 0부터 시작
    }
}
