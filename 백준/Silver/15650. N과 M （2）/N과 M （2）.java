import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int m;
	static boolean[] visited;
	static int[] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		// 백준 15650 N과 M (2)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n + 1];
		arr = new int[m];
		sb = new StringBuilder();
		dfs(0);
		System.out.println(sb);
	}
	private static void dfs(int depth) {
		if (depth == m) {
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				if (depth == 0 || arr[depth - 1] < i) {
					visited[i] = true;
					arr[depth] = i;
					depth++;
					dfs(depth);
					depth--;
					visited[i] = false;
				}
			}
		}
	}

}