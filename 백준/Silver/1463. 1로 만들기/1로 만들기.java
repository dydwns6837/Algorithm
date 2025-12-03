import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1463
		// dp + 재귀로 접근하려 했으나 스택오버플로우 되어 dp로만 접근
		// bottom up 방식으로 밑에서(0) 부터 배열에 저장하여 비교할 예정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 밑에서 부터 계산한 값을 채워나갈 배열 하나 선언 후 초기화
		// N까지 니까 크기를 N + 1 로
		int[] dp = new int [N + 1];
		// 1을 만들면서 연산에 사용된 최소 횟수.
		
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + 1; // 1을 빼면 연산을 한 번 시행한거니 + 1
			
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1을 뺀 횟수와 /2를 한 횟수중 최소값을 dp[i] 배열에 저장
			}
			
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1); // dp[i]배열에 저장된 값과 /3를 한 횟수중 최소값을 dp[i] 배열에 저장
			}
			
		}
		System.out.println(dp[N]);
	}
}