import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1929 소수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		for (int i = start; i <= end; i++) {
			int count = 0;
			if (i == 1) {
				count++;
			}
			for (int j = 2; j <= (int)Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
					if (count > 0) {
						break;
					}
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}

}