
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static int[][] graph;
    public static int n;
    public static ArrayList<Integer> counts = new ArrayList<>();


    public static int dfs(int x, int y){

        if(x<=-1 || x>=n || y<=-1 ||y>=n) return 0; 
        if (graph[x][y] == 0) return 0; 

        int count = 1;

        graph[x][y] = 0; 

        count+=dfs(x-1,y);
        count+=dfs(x,y-1);
        count+=dfs(x+1,y);
        count+=dfs(x,y+1);

        return count;
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];


        //이차원 배열 입력받고 저장
        for(int i = 0; i<n; i++){
            String str = br.readLine();
            for(int j = 0; j<n; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                int totalCount = dfs(i,j);
                if(totalCount>0){ //하나이상의 집을 세었다면
                    counts.add(totalCount);
                }
            }
        }

        Collections.sort(counts); //오름차순 후 출력
        System.out.println(counts.size());
        for(Integer i: counts){
            System.out.println(i);
        }


    }
}
