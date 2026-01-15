import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static int[][] cabbage;
	static boolean[][] visited;
	static int m;
	static int n;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		// 백준 1012 유기농 배추
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			cabbage = new int [n][m];
			for (int K = 0; K < k; K++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				cabbage[b][a] = 1;
			}
			visited = new boolean[n][m];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (cabbage[i][j] == 1 && !visited[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}

	}

	private static void bfs(int i, int j) {
		Deque<int[]> deq = new ArrayDeque<>();
		deq.add(new int [] {i, j});
		visited[i][j] = true;
		while (!deq.isEmpty()) {
			int[] parent = deq.pollFirst();
			for (int x = 0; x < 4; x++) {
				int ni = parent[0] + dx[x];
				int nj = parent[1] + dy[x];
				if (ni < 0 || nj < 0 || ni >= n || nj >= m) {
					continue;
				} else {
					if (!visited[ni][nj] && cabbage[ni][nj] == 1) {
						visited[ni][nj] = true;
						deq.add(new int[] {ni, nj});
					}
				}
			}
		}
		
	}

}
