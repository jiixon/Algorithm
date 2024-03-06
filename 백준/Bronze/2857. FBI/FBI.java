import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=1;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(num<=5){
            list.add(br.readLine());
            num++;
        }
        for(int i=0; i<list.size(); i++){
            if(list.get(i).contains("FBI")) {
                sb.append(i+1);
                sb.append(" ");
            }
        }
        if(sb.length()==0) System.out.println("HE GOT AWAY!");
        else{
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }
}