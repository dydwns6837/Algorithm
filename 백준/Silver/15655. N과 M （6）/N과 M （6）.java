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
		// 백준 N과 M (6)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		visited = new boolean[n + 1];
		number = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i < number.length; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(number);
		
		sb = new StringBuilder();
		back(0);
		System.out.println(sb);
	}
		private static void back(int depth) {
			if (depth == m) {
				for (int a : arr) {
					sb.append(a).append(" ");
				}
				sb.append("\n");
				return;
			}
			for (int i = 1; i <= n; i++) {
				if (!visited[i]) {
					if (depth == 0 || arr[depth - 1] < number[i]) {
						visited[i] = true;
						arr[depth] = number[i];
						back(depth + 1);
						visited[i] = false;
					}
				}
			}
		}
}
