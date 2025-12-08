import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2231 분해합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = n / 2; i < n; i++) {
			int sum = i;
			int temp = i;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if (sum == n) {
				sb.append(i);
				break;
			}
		}
		if (sb.isEmpty()) {
			sb.append(0);
		}
		System.out.println(sb);
		
	}

}
