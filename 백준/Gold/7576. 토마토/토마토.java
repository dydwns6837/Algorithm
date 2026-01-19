import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static int[][] tomato;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int n;
	static int m;
	static int cnt;
	public static void main(String[] args) throws IOException {
		// 백준 7576 토마토
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		tomato = new int [m][n];
		Deque<int []> deq = new ArrayDeque<>();
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
				if (tomato[i][j] == 1) {
					deq.add(new int [] {i, j, 0});
				} 
			}
		}
		
		int ans = bfs(deq);
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (tomato[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(ans);
	}
	private static int bfs(Deque<int[]> deq) {
		int day = 0;
		while (!deq.isEmpty()) {
			int[] parent = deq.pollFirst();
			for (int i = 0; i < dx.length; i++) {
				int ni = parent[0] + dx[i];
				int nj = parent[1] + dy[i];
				if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
					if (tomato[ni][nj] == 0) {
						deq.add(new int [] {ni, nj, parent[2] + 1});
						tomato[ni][nj] = 1;
						day = parent[2] + 1;
					}
				}
			}
		}
		return day;
	}

}