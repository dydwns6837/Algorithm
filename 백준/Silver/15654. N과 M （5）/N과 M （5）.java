import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int m;
	static int[] arr;
	static boolean[] visited;
	static int[] number;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		// 백준 1182 부분수열의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		visited = new boolean[n + 1];
		number = new int[n + 1];
		sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(number);
		back(0);
		System.out.println(sb);
	}
	private static void back(int depth) {
		if (depth == m) {
			for (int number : arr) {
				sb.append(number).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = number[i];
				back(depth + 1);
				visited[i] = false;
			}
		}
	}
}
