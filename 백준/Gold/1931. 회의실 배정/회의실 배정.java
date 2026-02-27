import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 백준 1931 회의실 배정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int [n][2];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(arr, (o1,o2) -> {
            if (o1[1] - o2[1] == 0) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        int max = arr[0][1];
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i][0] >= max) {
                max = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
