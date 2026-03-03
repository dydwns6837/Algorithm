import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 13699 점화식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long [36];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			long sum = 0;
			for (int j = 0; j < i; j++) {
				sum += dp[j] * dp[i - j - 1];
			}
			dp[i] = sum;
		}
		System.out.println(dp[n]);
		
	}
}
