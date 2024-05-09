import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 세 수 A, B, C를 입력 받습니다.
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // (A+B)%C를 계산합니다.
        int result1 = (A + B) % C;
        // ((A%C) + (B%C))%C를 계산합니다.
        int result2 = ((A % C) + (B % C)) % C;
        // (A×B)%C를 계산합니다.
        int result3 = (A * B) % C;
        // ((A%C) × (B%C))%C를 계산합니다.
        int result4 = ((A % C) * (B % C)) % C;

        // 결과를 출력합니다.
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        scanner.close();
    }
}
