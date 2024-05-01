import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 메시지의 길이
        st = new StringTokenizer(br.readLine());
        
        // 숫자 최댓값 + 1 크기의 배열 생성 (숫자는 1 이상이므로)
        int c = 1000000; // 예제 입력의 최댓값인 1,000,000으로 설정
        int[] arr = new int[n]; // 입력받는 수 저장하는 배열
        int[] original = new int[n]; // 입력순서를 저장하는 배열
        int[] countMap = new int[c + 1]; // 숫자의 빈도수를 저장하는 배열

        // 입력받은 숫자를 배열에 저장하고, 동시에 해당 숫자의 빈도를 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            original[i] = arr[i];
            countMap[arr[i]]++;
        }

        // 빈도수를 기준으로 배열을 정렬
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (countMap[arr[i]] < countMap[arr[j]] || 
                    (countMap[arr[i]] == countMap[arr[j]] && indexOf(original, arr[i]) > indexOf(original, arr[j]))) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 정렬된 배열을 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
    
    // 주어진 숫자가 처음 등장한 위치를 반환하는 메서드
    private static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1; // 에러 처리, 실제로는 여기에 들어올 일이 없어야 함
    }
}
