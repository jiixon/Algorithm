import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] input = bf.readLine().toCharArray();
        int[] array = new int[26];
        int n = 97;
        for (int i = 0; i < 26; i++) {
            array[i] = n;
            n++;
        }
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            check = false;
            for (int j = 0; j < input.length; j++) {
                if (input[j] == array[i]) {
                    array[i] = j;
                    check = true;
                    break;
                }
            }
            if(check==false) array[i] = -1;
        }
        for(int i=0; i<array.length; i++){
            if(i== array.length) System.out.print(array[i]);
            else{
                System.out.print(array[i]);
                System.out.print(" ");
            }
        }
    }
}