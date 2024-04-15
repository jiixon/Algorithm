
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String[][] input = new String[num][2];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            input[i][0] = st.nextToken();
            input[i][1] = st.nextToken();
        }
        int[] result = new int[num];

        for(int i=0; i<num; i++){
            for(int j=0; j< num; j++){
                if(i!=j){
                    if(Integer.parseInt(input[i][0]) < Integer.parseInt(input[j][0]) &&
                            (Integer.parseInt(input[i][1]) < Integer.parseInt(input[j][1]))){
                        result[i]++;
                    }
                }

            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print((result[i] + 1) + " ");
        }
    }
}