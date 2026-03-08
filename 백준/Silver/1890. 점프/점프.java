import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 백준 1890 점프
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        long[][] dp = new long[n][n];
        StringTokenizer st;
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = 1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (!(i == dp.length - 1 && j == dp.length - 1)) {
                    if (dp[i][j] != 0) {
                        int jump = arr[i][j];
                        int ni = i + jump;
                        int nj = j + jump;
                        if (ni < dp.length) {
                            dp[ni][j] += dp[i][j];
                        }
                        if (nj < dp.length) {
                            dp[i][nj] += dp[i][j];
                        }
                    }
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}
