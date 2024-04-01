
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = bf.readLine();
            if(input.equals("0")) break;
            inputs.add(input);
        }
        String[] result = new String[inputs.size()];

        for(int i = 0; i< inputs.size(); i++){
            if(inputs.get(i).length() == 1) {
                result[i] = "yes";
                continue;
            }
            for(int j = 0; j<inputs.get(i).length()/2; j++){
                if(inputs.get(i).charAt(j)!=inputs.get(i).charAt(inputs.get(i).length()-j-1)) {
                    result[i] = "no";
                    break;
                }
                result[i] = "yes";
            }

        }
        for(String s: result){
            System.out.println(s);
        }
    }
}