import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 백준 9095 1,2,3 더하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dp = new int [12];
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i < dp.length; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}
