
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> remainders = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            remainders.add(a % 42); // 중복된 나머지는 Set에 추가되지 않음
        }

        System.out.println(remainders.size());
    }
}
