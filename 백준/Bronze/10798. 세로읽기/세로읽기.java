
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] lines = new String[5];
        int maxSize = 0;

        for(int i = 0; i<5; i++){
            lines[i] = bf.readLine();
            maxSize = Math.max(maxSize,lines[i].length());
        }

        char[][] arr = new char[5][maxSize];
        for(int i = 0; i<5; i++){
            String line = lines[i];

            for(int j = 0; j<maxSize; j++){
                if(j < line.length()){
                    arr[i][j] = line.charAt(j);
                }else{
                    arr[i][j] = ' ';
                }
            }
        }
        for(int i=0; i<maxSize; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] == ' ') continue;
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}