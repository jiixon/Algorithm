
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer value;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            value = new StringTokenizer(br.readLine());
            String command = value.nextToken();
            if (command.equals("push")) {
                int num = Integer.parseInt(value.nextToken());
                stack.push(num);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) sb.append(-1).append("\n");
                else{
                    sb.append(stack.pop()).append("\n");
                }
            } else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (command.equals("top")) {
                if (stack.isEmpty()) sb.append(-1).append("\n");
                else{
                    sb.append(stack.peek()).append("\n");
                }
            }

        }
        System.out.println(sb);
    }
}
