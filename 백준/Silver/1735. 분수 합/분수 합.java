import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 백준 1735 분수 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c1 = Integer.parseInt(st.nextToken());
		int p1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c2 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		int c3 = c1 * p2 + p1 * c2;
		int p3 = p1 * p2;
		while (p3 != 0) {
			int temp = p3;
			p3 = c3 % p3;
			c3 = temp;
		}
		System.out.println((c1 * p2 + p1 * c2) / c3 + " " + p1 * p2 / c3);
	}

}