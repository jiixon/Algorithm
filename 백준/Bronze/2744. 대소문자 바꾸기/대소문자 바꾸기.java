import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                output.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                output.append(Character.toUpperCase(c));
            }
        }

        System.out.println(output.toString());
    }
}
