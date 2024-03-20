import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(bf.readLine());
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<c; i++){
            String[] split = bf.readLine().split(" ");
            int[] numbers = new int[split.length-1];
            double sum = 0;
            for(int j=1; j<split.length; j++){
                numbers[j-1] = Integer.parseInt(split[j]);
                sum+=numbers[j-1];
            }
            double count = 0;
            for(int k=0; k<numbers.length; k++){
                if(sum/numbers.length<numbers[k]) count++;
            }
            list.add(String.format("%.3f", count/numbers.length*100));
        }

        for(String s : list){
            System.out.println(s+"%");
        }
    }
}