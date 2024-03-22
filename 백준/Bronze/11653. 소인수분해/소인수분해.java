
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;


public class Main {
    public static int[] arr;
    public static void eratos(int num){
        arr = new int[num+1];

        for(int i=2; i<=num; i++){
            arr[i] = i;
        }

        for(int i=2; i<=num; i++){
            if(arr[i] == 0) continue;
            for(int j=i+i; j<=num; j+=i){
                arr[j] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        eratos(n);

        int i=2;
        while(n!=1){
            if(arr[i]!=0){
                if(n%i==0){
                    n/=i;
                    System.out.println(i);
                }
                else i++;
            } else i++;
            if (i > n) break;
        }
    }
}