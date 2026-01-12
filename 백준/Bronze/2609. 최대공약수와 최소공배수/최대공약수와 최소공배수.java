import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 2609 최대공약수와 최소공배수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int min = 0;
		if (a > b) {
			for (int i = 1; i <= b; i++) {
				if (a % i == 0 && b % i == 0) {
					min = i;
				}
			}
			System.out.println(min);
		} else {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0 && b % i == 0) {
					min = i;
				}
			}
			System.out.println(min);
		}
		System.out.println((a / min) * (b / min) * min);

	}

}