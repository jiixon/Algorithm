
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static int n,m;
    public static int factors(int n, int m){
        int max = 0;
        if(n>m){ 
            int tmp = n;
            n=m;
            m=tmp;
        }
        else if (n==m) return n;
        
        for(int i=1; i<m; i++){
            if(n%i == 0 && m%i ==0 && i<=m) {
                max = i;
            }
        }
        return max;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int p;
        int[] result = new int[t];

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            p = factors(n,m);
            result[i] = p*(n/p)*(m/p);
        }

        for(int i : result){
            System.out.println(i);
        }
    }
}