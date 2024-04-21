
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());

        StringTokenizer value;
        LinkedList<Integer> q = new LinkedList<>();
        for(int i=0; i<test; i++){
            value = new StringTokenizer(br.readLine());
            String command = value.nextToken();
            if (command.equals("push")) {
                int num = Integer.parseInt(value.nextToken());
                q.offer(num);
            }else if(command.equals("pop")){
                Integer item = q.poll();
                if(item == null){
                    sb.append(-1).append("\n");
                }else sb.append(item).append("\n");
            }else if(command.equals("size")){
                sb.append(q.size()).append("\n");
            }else if(command.equals("empty")){
                if(q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }else if(command.equals("front")){
                Integer peek = q.peek();
                if(peek == null) sb.append(-1).append("\n");
                else sb.append(peek).append("\n");
            }else if(command.equals("back")){
                Integer peekLast = q.peekLast();
                if(peekLast == null) sb.append(-1).append("\n");
                else sb.append(peekLast).append("\n");
            }
        }
        System.out.println(sb);
    }
}