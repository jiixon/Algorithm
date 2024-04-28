import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("#")) {
                break;
            }
            int vowelCount = countVowels(line);
            System.out.println(vowelCount);
        }

        scanner.close();
    }

    public static int countVowels(String sentence) {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        // 모음인지 확인하는 함수
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
