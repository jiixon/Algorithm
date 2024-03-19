import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int max=0;
        for(int i=1; i<=list.get(0); i++){
            if(list.get(1)%i==0 && list.get(0)%i==0) {
                max = i;
            }
        }
        System.out.println(max);
        System.out.println(max*(list.get(0)/max)*(list.get(1)/max));
    }
}