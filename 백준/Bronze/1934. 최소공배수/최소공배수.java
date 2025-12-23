import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1934 최소공배수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int answer = 1;
			if (a < b) {
				for (int j = 1; j <= a; j++) {
					if (a % j == 0 && b % j == 0) {
						answer = j;
					}
				}
			} else {
				for (int j = 1; j <= b; j++) {
					if (a % j == 0 && b % j == 0) {
						answer = j;
					}
				}
			}
			System.out.println((a * b) / answer);
		}

	}

}