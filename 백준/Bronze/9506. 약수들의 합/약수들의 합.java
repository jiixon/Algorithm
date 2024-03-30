
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        while (true){
            int num = Integer.parseInt(bf.readLine());
            if(num == -1) break;
            arrList.add(num);
        }
        int sum=0;
        for(int i = 0; i< arrList.size(); i++){
            for(int j = 1; j<arrList.get(i); j++){
                if(arrList.get(i)%j==0) nums.add(j);

            }
            for(int k=0; k<nums.size(); k++){
                sum+=nums.get(k);
            }
            if(sum==arrList.get(i)){
                System.out.print(arrList.get(i)+" = ");
                for(int p=0; p<nums.size(); p++){
                    System.out.print(nums.get(p));
                    if (p < nums.size() - 1) {
                        System.out.print(" + ");
                    }
                }

                System.out.println();
            }
            else System.out.println(arrList.get(i) + " is NOT perfect.");

            sum=0;
            nums.clear();
        }

    }
}