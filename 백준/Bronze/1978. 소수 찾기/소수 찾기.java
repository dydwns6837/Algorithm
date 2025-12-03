import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		for (int i = 0; i < n; i++) {
			int p = Integer.parseInt(st.nextToken());
			int count = 0;
			for (int j = 1; j <= p; j++) {
				if (p % j == 0) {
					count++;
					if (count > 2) {
						break;
					}
				}
			}
			if (count == 2) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}