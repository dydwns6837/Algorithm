import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2839 설탕 배달
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1000; i >= 0; i--) {
			for (int j = 0; j < 1667; j++) {
				if ((5 * i) + (3 * j) == n) {
					sb.append(i + j);
					break;
				}
			}
			if (!sb.isEmpty()) {
				break;
			}
		}
		if (sb.isEmpty()) {
			sb.append(-1);
		}
		System.out.println(sb);
	}

}