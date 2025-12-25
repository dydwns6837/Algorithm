import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 4134 다음 소수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(br.readLine());
			for (long j = a; ; j++) {
				int count = 0;
				if (j < 2) {
					count++;
				}
				for (int k = 2; k <= Math.sqrt(j); k++) {
					if (j % k == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					sb.append(j).append("\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}

}