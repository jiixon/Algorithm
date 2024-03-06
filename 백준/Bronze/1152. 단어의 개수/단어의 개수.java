import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(" ",-1);
        ArrayList<String> list = new ArrayList<>();
        for(String str : split){
            if(!str.isEmpty()) list.add(str);
        }
        System.out.println(list.size());
    }
}