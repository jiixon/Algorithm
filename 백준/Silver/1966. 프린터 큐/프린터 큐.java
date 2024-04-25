
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int m, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); 
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<test; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); 
            n = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{j,priority}); 
            }

            int result = 0;
            while(!queue.isEmpty()){
                int[] poll = queue.poll(); 
                boolean print = true;

                for(int[] next: queue){ 
                    if(next[1]>poll[1]){
                        print = false; 
                        break;
                    }
                }

                if(print){ 
                    result++; 
                    if(poll[0]==n) { 
                        sb.append(result).append("\n");
                        break;
                    }
                }
                else{ 
                    queue.offer(poll); 
                }

            }
        }
        System.out.println(sb);

    }
}
