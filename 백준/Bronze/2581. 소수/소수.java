import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static int[] array;
    public static int n,m;
    public static void eratosthenesSieve(){
        array = new int[n+1];
        array[0] = 0;
        array[1] = 0;

        for(int i=2; i<=n; i++){
            array[i] = i;
        }

        for(int i=2; i<=n; i++){
            if(array[i] == 0) continue;
            for(int j = i+i; j<=n; j+=i){
                array[j] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        ArrayList<Integer> primes = new ArrayList<>();
        array = new int[n+1];
        eratosthenesSieve();
        long sum = 0;
        for(int i=m; i<=n; i++){
            if(array[i]!=0) primes.add(array[i]);
        }
        if(primes.isEmpty()) System.out.println(-1);
        else{
            for(int i: primes) sum+=i;
            System.out.println(sum);
            System.out.println(primes.get(0));
        }
    }
}