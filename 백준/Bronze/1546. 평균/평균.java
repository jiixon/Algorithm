import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        ArrayList<Double> array = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        while (st.hasMoreTokens()){
            array.add(Double.parseDouble(st.nextToken()));
        }
        Collections.sort(array,Collections.reverseOrder());
        double m = array.get(0);

        for(int i=0; i<array.size(); i++){
            array.set(i,array.get(i)/m *100);
        }
        double sum = 0;
        for(double i: array){
            sum+=i;
        }
        System.out.println(sum/ array.size());
    }
}