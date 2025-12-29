import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1459 걷기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		long w = Integer.parseInt(st.nextToken());
		long s = Integer.parseInt(st.nextToken());
		long ans = (x + y) * w;
		long ans2 = 0;
		if (x > y) {
			ans2 = y * s + (x - y) * w;
		} else {
			ans2 = x * s + (y - x) * w;
		}
		long ans3 = 0;
		if ((x + y) % 2 == 0) {
			if (x > y) {
				ans3 = x * s;
			} else {
				ans3 = y * s;	
			}
		} else {
			if (x > y) {
				ans3 = (x - 1) * s + w;
			} else {
				ans3 = (y - 1) * s + w;
			}
		}
		long answer = ans;
		if (answer > ans2) {
			answer = ans2;
		}
		if (answer > ans3) {
			answer = ans3;
		}
		System.out.println(answer);
	}

}