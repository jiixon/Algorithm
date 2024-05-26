import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 테스트 케이스의 수를 입력받는다.
        int T = scanner.nextInt();
        
        // 각 테스트 케이스마다 A와 B를 입력받아 합을 출력한다.
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A + B);
        }
        
        scanner.close();
    }
}
