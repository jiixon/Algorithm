import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for(int i=0; i<=s.length(); i+=10){
            if(s.length() - s.substring(0,i).length()<10){
                System.out.print(s.substring(i,s.length()));
                break;
            }
            System.out.println(s.substring(i,i+10));
        }
    }
}