
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine().toUpperCase();
        int[] arr = new int[26];

        for(int i=0; i<input.length(); i++){
            arr[input.charAt(i)-'A']++;
        }
        int max=0;
        char result = ' ';
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
                count = 0;
                result = (char) ('A' + i);
                continue;
            }
            if(max == arr[i]) count++;
        }
        if(count>0) {
            System.out.println("?");
        }else if(count == 0){
            System.out.println(result);
        }
    }
}