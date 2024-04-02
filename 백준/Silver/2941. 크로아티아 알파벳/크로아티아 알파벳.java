
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        String[] list = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        int result = 0;
        for(int i=0; i<sb.length(); i++){
            for(int j = 0; j<list.length; j++){
                if(sb.toString().contains(list[j])){
                    int idx = sb.indexOf(list[j]);
                    sb.replace(idx,idx+list[j].length(),"0");
                    i--;
                    result++;
                    break;
                }

            }

        }
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)!='0') result++;
        }
        System.out.println(result);

    }
}
