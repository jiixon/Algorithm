
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        Arrays.sort(split,Collections.reverseOrder());
        for(String s: split){
            System.out.print(s);
        }
    }
}
