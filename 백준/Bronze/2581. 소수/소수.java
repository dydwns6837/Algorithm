import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int sum = 0;
		int first = 0;
		for (int i = N; i <= M; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
					if (count > 2) {
						break;
					}
				}
			}
			if (count == 2) {
				if (sum == 0) {
					first = i;
				}
				sum += i;
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(first);
		}
	}

}