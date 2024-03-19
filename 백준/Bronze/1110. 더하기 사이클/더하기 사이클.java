import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder(bf.readLine());
        StringBuilder sb = new StringBuilder();
        if(input.length()==1) input.insert(0,"0");
        sb.append(input);
        int num=0;
        int result = 0;
        do {
            for(int i = 0; i<sb.length(); i++){
                num+=Integer.parseInt(String.valueOf(sb.charAt(i)));
            }
            sb.deleteCharAt(0);
            sb.append(num%10);
            num=0;
            result++;
        } while (!input.toString().equals(sb.toString()));
        System.out.println(result);
    }
}