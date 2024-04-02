
import java.io.IOException;

public class Main {
    public static int selfNumbers(int n) {
        int sum = 0;
        int tmp = n;
        while(tmp!=0){
            sum+=tmp%10;
            tmp/=10;
        }
        return sum+n;
    }

    public static void main(String[] args) throws IOException {
        int[] nums = new int[10001];
        //배열 초기화
        for (int i = 0; i < 10001; i++){
            nums[i] = i;
        }
        for(int i = 1; i<10001; i++){
            if(selfNumbers(i)<=10000) {
                nums[selfNumbers(i)]=0;
            }
        }
        for(int i: nums){
            if(i!=0) System.out.println(i);
        }
    }
}